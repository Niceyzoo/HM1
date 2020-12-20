package ru.geekbrains.hm1;

public class HM1T1 {
    public static void main(String[] args) {

        System.out.println("Task2");
        byte val = -120;
        short val1 = 12442;
        int val2 = 1000;
        long val3 = 200000L;
        float val4 = 12.23f;
        double val5 = -123.123;
        boolean val6 = false;
        char val7 = 'a';
        System.out.println(val);
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
        System.out.println(val6);
        System.out.println(val7);

        System.out.println("");

        System.out.println("Task3");
        float a = 12.5f;
        float b = 2.8f;
        float c = 3.37f;
        float d = 6.17f;
        System.out.println(a * (b + (c / d)));

        System.out.println("");

        System.out.println("Task4");
        boolean even;
        even = isEven(99, 8);
        System.out.println(even);

        System.out.println("");

        System.out.println("Task5");
        int f = -30;
        if (f >= 0) System.out.println(f + " positive number");
        else System.out.println(f + " negative number");

        System.out.println("");

        System.out.println("Task6");
        boolean even1;
        even1 = isEven1(-15);
        System.out.println(even1);

        System.out.println("");

        System.out.println("Task7");
        String name = "Vlada";
        System.out.println("Привет, " + name + "!");


    }

    public static boolean isEven(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 20) return true;
        else return false;
    }

    public static boolean isEven1(int k) {
        if (k < 0) return true;
        else return false;
    }

    public static void hello(String name) {
        System.out.println("Привет, " + name + "!");
    }
}




