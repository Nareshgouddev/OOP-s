package com.Oopspratice.inheritance;

public class Main {
//    static void main(String[] args) {
//        System.out.println("hello");
//        System.out.println(main("Nijam"));;
//    }
//
//    static String main(String x) {
////        System.out.println(x);
//        main(3);
//        return x;
//    }
//
//    static void main(int l) {
//        System.out.println(l);
//    }
static void main() {

    Father f=new Son();
    f.Eating();

    Son s= (Son) f;
    s.Walk();

   }
}
