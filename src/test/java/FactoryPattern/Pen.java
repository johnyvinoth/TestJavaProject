package FactoryPattern;

public interface Pen {
    void write();

    //Interfaces can have multiple default functions which are concrete and can be called in the implementing class
    default void test() {
        System.out.println("I am from the Interface, first default function");
    }

    default void test1() {
        System.out.println("I am from the Interface, second default function");
    }

}
