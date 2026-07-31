package OCP;



class Main{

    public static void main(String[]args){
        Cart cart = new Cart();
        cart.addProduct(new Product("Laptop",50000));
        cart.addProduct(new Product("Realme 5G Phone",23000));

        CartCalculator calculator = new CartCalculator();
        double total = calculator.calculateTotal(cart.getProduct());

        InvoicePrinter invoice = new InvoicePrinter();
        invoice.printInvoice(cart.getProduct(),total);

       Database db1 = new SaveToSQL();
       db1.saveToDB();

       Database db = new SaveToMongoDB();
       db.saveToDB();

    }
}