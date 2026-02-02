package com.Oopspratice.Interface;

public class petrolEngine implements Engine{
    @Override
    public int start() {
        System.out.println("Petrol Engine Started");
        return 1;
    }
}
