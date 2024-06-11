package FactoryPattern;

public class PilotPen implements Pen
{

    @Override
    public void write() {
        System.out.println("Writing with Pilot pen");

        //this line is to check the default function and not related to Factory pattern.
        Pen.super.test();
        Pen.super.test1();

    }
    @Override
    public void test() {
        System.out.println("Testing the override of the default function in the implementating class");
    }

}
