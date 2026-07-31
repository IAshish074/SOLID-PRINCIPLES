package OCP;
import java.util.*;
class InvoicePrinter{


    public  void printInvoice(List<Product>products, double total){

        for(Product p : products){
            System.out.println(p.name +" ₹ "+p.price);
        }
        System.out.println("Total Price : "+total);
    }
}