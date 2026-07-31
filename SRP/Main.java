package SRP;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new Product("Laptop", 1500));
        cart.addProduct(new Product("Mouse", 50));

        CartCalculator calculator = new CartCalculator();
        double total = calculator.calculatePrice(cart.getProducts());

        CartInvoicePrinter printer = new CartInvoicePrinter();
        printer.printInvoice(cart.getProducts(), total);

        CartDBStorage db = new CartDBStorage();
        db.saveToDatabase(cart);
    }
}