package FactoryPattern;

public interface Pen
{
    void write();

    //Interfaces can have multiple default functions which are concrete and can be called in the implementing class
    default void test()
{
    System.out.println("I am from the Interface");
}

}
