package ru.stqa.java_study.sandbox;

public class hll {

    public static void main(String[] args)
    {
        hello("world");
        hello("user");
        hello("hyuser");

        Square s = new Square(5);
        System.out.println( "Площадь со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("площадь треуг со стор " + r.a + " и " + r.b + " = " + r.area());
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody);
    }


}

