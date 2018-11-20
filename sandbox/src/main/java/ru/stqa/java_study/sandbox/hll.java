package ru.stqa.java_study.sandbox;

public class hll {

    public static void main(String[] args)
    {
        hello("world");
        hello("user");
        hello("hyuser");

        double l = 5;
        System.out.println( "Площадь со стороной " + l + " = " + area(l));

        double a = 4;
        double b = 6;
        System.out.println("площадь треуг со стор " + a + " и " + b + " = " + area(a, b));
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody);
    }
    public static double area (double len) {
        return len * len;
    }

    public static double area (double a, double b) {
        return a * b;
    }
}

