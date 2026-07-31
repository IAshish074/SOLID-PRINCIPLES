package SRP;
import java.util.*;

// product class for representing any item of any ecommerce
public class Product {
    String name;
    double price;

    Product(String name,double price){
        this.name  = name;
        this.price = price;
    }
}
// voilating SRP : shopping is handling multiple responsibilities
class ShoppingCart{
    private List<Product>products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public List<Product>getProducts(){
        return produts;
    }

    public double calculateTotal(){
        double total = 0;
        for(int i=0;i<products.size();i++){
            Product a = products.get(i);
            total += a.price;
        }
        return total;
    }

    public void printInvoice(){
        System.out.println("Shopping Cart Invoice: ");
        
        for(int i=0;i<products.size();i++){
            System.out.println(products.get(i).name+" - ₹ "+products.get(i).price);
        }
        System.out.println("Total: ₹ "+calculateTotal());
        
    }

    void saveToDatabase(){
        System.out.println("Saving shopping cart to Database....");
    }
}
