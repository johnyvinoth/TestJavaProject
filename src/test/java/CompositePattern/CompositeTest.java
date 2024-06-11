package CompositePattern;

public class CompositeTest {
    public static void main(String[] args)
    {
        Component Mouse = new Leaf(500, "Mouse");
        Component hd = new Leaf(5000, "HDD");
        Component Moitor = new Leaf(8000, "Moitor");
        Component ram = new Leaf(6000, "RAM");
        Component cpu = new Leaf(3000, "CPU");

        Composite ph = new Composite("Peri");
        Composite Cabinet = new Composite("Cabinet");
        Composite mb = new Composite("MB");
        Composite Computer = new Composite("Computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);

        ph.addComponent(Mouse);
        ph.addComponent(Moitor);
        Cabinet.addComponent(hd);
        Cabinet.addComponent(mb);

        Computer.addComponent(Cabinet);
        Computer.addComponent(ph);

        Computer.showPrice();


    }

}
