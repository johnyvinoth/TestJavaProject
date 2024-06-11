package EcommerceSite;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Order {
    private List<Product> products;
    private double giftCardValue;


    public Order(double giftCardValue) {
        this.products = new ArrayList<>();
        this.giftCardValue = giftCardValue;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public void removeDuplicateProduct() {
        Set<Product> seenProducts = new HashSet<>();
        List<Product> uniqueProducts = new ArrayList<>();

        for (Product product : products) {
            if (seenProducts.add(product)) {
                uniqueProducts.add(product);
            } else {
                System.out.println("The product : " + product + " already exists and hence it has been removed");

            }
        }
        products = uniqueProducts;
    }
    public double getTotalPrice() {
        double totalPrice = 0;
        for(Product product : products)
        {
            totalPrice=product.getQuantity()*product.getPrice();
        }
        if(totalPrice<=giftCardValue)
        {
            return totalPrice;
        }
        else
        {
            System.out.println("The total price is: " + totalPrice+" which exceeds the gift card value. Please revise your order or add money to your gift card");
        }
        return 0;
    }
    public double proces_Order()
    {
        removeDuplicateProduct();
        double totPrice=getTotalPrice();
        return totPrice;
    }
}
