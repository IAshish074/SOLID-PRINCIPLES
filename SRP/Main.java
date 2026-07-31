package SRP;
import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Laptop", 1500));
        cart.addProduct(new Product("Mouse",50));

        cart.printInvoice();
        cart.saveToDatabase();
    }
}