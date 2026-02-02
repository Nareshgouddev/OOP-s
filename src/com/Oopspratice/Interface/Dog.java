package com.Oopspratice.Interface;

public class Dog implements Animal {
    @Override
    public void Sound() {
        System.out.println("i can Bark");
    }
    int a=10;

    static void main() {
        Dog d=new Dog();
        System.out.println(d.a);
        d.Sound();
    }
}
