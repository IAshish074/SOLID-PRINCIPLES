package OCP;

import java.util.*;

class CartCalculator{
   
    public double calculateTotal(List<Product>products){
        double total = 0;
        for(Product p : products){
            total += p.price;
        }
        return total;
    }
}