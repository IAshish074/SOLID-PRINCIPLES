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

// class ShoppingCart{
//     private List<Product>products = new ArrayList<>();

//     public void addProduct(Product p){
//         products.add(p);
//     }

//     public List<Product>getProducts(){
//         return produts;
//     }

//     public double calculateTotal(){
//         double total = 0;
//         for(int i=0;i<products.size();i++){
//             Product a = products.get(i);
//             total += a.price;
//         }
//         return total;
//     }

//     public void printInvoice(){
//         System.out.println("Shopping Cart Invoice: ");
        
//         for(int i=0;i<products.size();i++){
//             System.out.println(products.get(i).name+" - ₹ "+products.get(i).price);
//         }
//         System.out.println("Total: ₹ "+calculateTotal());
        
//     }

//     void saveToDatabase(){
//         System.out.println("Saving shopping cart to Database....");
//     }
// }



// Shopping cart -> only manages products
class ShoppingCart {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> getProducts() {
        return products;
    }
}

// Responsible only for price calculation
class CartCalculator {

    public double calculatePrice(List<Product> products) {

        double total = 0;

        for (Product p : products) {
            total += p.price;
        }

        return total;
    }
}

// Responsible only for printing invoice
class CartInvoicePrinter {

    public void printInvoice(List<Product> products, double total) {

        System.out.println("Shopping Cart Invoice");

        for (Product p : products) {
            System.out.println(p.name + " - ₹ " + p.price);
        }

        System.out.println("Total = ₹ " + total);
    }
}



// Responsible only for database storage
class CartDBStorage {

    public void saveToDatabase(ShoppingCart cart) {
        System.out.println("Saving shopping cart to database...");
    }
}


