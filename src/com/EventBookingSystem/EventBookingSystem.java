package com.EventBookingSystem;

import java.util.UUID;

class User{
    private String id;
    private String name;

    public void setId(){
        this.id= UUID.randomUUID().toString();
    }
    public void setName(String name){
        this.name=name;
    }
    public String getUser(){
        return name;
    }

}

class Events{
    private String id;
    private String name;
    int availableSeats;

    public String getId() {
        return id;
    }

    public void setId() {
        this.id= UUID.randomUUID().toString();
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    synchronized boolean reservedSeats(int count){
        if(availableSeats<count) return false;
        availableSeats-=count;
        return true;
    }
    synchronized void releasedSeats(int count){
        availableSeats+=count;
    }
}

class Booking{
    String bookingId;
    private User user;
    private Events event;
    int seats;

    Booking(User user, Events event, int seats){
        this.bookingId = UUID.randomUUID().toString();
        this.user = user;
        this.event = event;
        this.seats = seats;
    }
}

interface Payment{
    boolean pay(double amount);
}


class CreditCard implements Payment {
    public boolean pay(double amount){
        return true;
    }
}

class EventManager{
    boolean createBooking(User user, Events event, int seats){
        if(!event.reservedSeats(seats)) return false;

        Payment payment=new CreditCard();

        if(!payment.pay(seats*100)){
            event.releasedSeats(seats);
            return true;
        }
        Booking booking = new Booking(user, event, seats);
        System.out.println("Booking Created: " + booking.bookingId);
        return true;
    }
}

public class EventBookingSystem {
    static void main() {
        User u1 = new User();
        u1.setId();
        u1.setName("naresh");// random user
        Events e1 = new Events();
        e1.setId();
        e1.setName("raki function");
        e1.setAvailableSeats(40);
        System.out.println(e1.getName());
        System.out.println(e1.getAvailableSeats());
        EventManager manager = new EventManager();  // booking manager
        manager.createBooking(u1, e1, 2);
        System.out.println(u1.getUser());
    }
}
