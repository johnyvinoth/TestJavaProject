package EcommerceSite;

public class processOrder {
    public static void main(String[] args) throws Exception {
        double giftCardValue =900;
        Order order = new Order(giftCardValue);
        Product product1=new Product(1,10,100);
        Product product2=new Product(2,15,150);
        Product product3=new Product(3,5,200);
        order.addProduct(product1);
        order.addProduct(product2);
        order.addProduct(product3);
        order.addProduct(product2);

//        double totPrice = order.getTotalPrice();
        double totPrice=order.proces_Order();
        if(totPrice>0)
        {
            System.out.println("The total price is " + totPrice+" and the order product are"+order.getProducts());
        }
        else {
//            System.out.println("The total price is: " + totalPrice+" which exceeds the gift card value. Please revise your order or add money to your gift card");
        }

    }
}
