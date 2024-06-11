package FactoryPattern;

public class FactoryClassDemo {
    public static void main (String[] args)
    {
//        ObjectFactory objectFactory=new ObjectFactory();
        Pen pp= ObjectFactory.getInstance("Pilot");
        Pen gp= ObjectFactory.getInstance("GelpeN");
        pp.write();
        gp.write();

        pp.test();
        gp.test();
    }
}
