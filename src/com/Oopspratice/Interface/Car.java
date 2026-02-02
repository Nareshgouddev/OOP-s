package com.Oopspratice.Interface;

public class Car extends Object{
    public Car(){
        super();
    }
    Engine engine=null;
    public Car(Engine engine) {
    this.engine=engine;
    }
        public void drive() {
            int sta = engine.start();
            if (sta > 0) {
                System.out.println("happy journey");
            } else {
                System.out.println("Something Happens");
            }
        }

    static void main() {
        petrolEngine p=new petrolEngine();
        DieselEngine d=new DieselEngine();
        Car c=new Car(p);
        c.drive();
        Engine.Stop();

    }
}
