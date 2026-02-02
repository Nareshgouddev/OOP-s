package com.Oopspratice.inheritance;

public class Daughter extends  Father{
//    public Daughter(int a, int b) {
//        super(a, b);
//    }

    public void Ready(){
        System.out.println("ready faster than any one");
    }

    @Override
    public void Eating(){
        System.out.println("Eating");
    }
}
