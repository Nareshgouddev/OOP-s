package com.Oopspratice.abstraction;

public class SubClass extends Vehicle{
    @Override
    public void start() {
        System.out.println("Starting");
    }


//    public void Stop() {
//        System.out.println("Stops");
//    }

    static void main() {
        SubClass v=new SubClass();
        v.start();
        v.Stop();
    }
}
