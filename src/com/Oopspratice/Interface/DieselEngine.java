package com.Oopspratice.Interface;

public class DieselEngine implements Engine{
    @Override
    public int start() {
        System.out.println("Diesel Engine Started");
        return 1;
    }
}
