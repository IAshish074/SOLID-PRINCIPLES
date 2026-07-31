package LSP;

class FixedDeposite implements DepositeOnlyAccount{
    private double balance;

    public FixedDeposite(){
        balance = 0;
    }

    public void Deposite(double amount){
        balance += amount;
        System.out.println("Deposited: "+amount+" in Fixed Deposite. New Balance: "+balance);
    }
}