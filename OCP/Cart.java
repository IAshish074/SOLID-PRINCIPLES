package OCP;
import java.util.*;

class Cart{

    List<Product>p = new ArrayList<>();

    public void addProduct(Product product){
        p.add(new Product(product.name,product.price));
    }
    
    public List<Product> getProduct(){
        return p;
    }

}