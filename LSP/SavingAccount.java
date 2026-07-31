package LSP;

class SavingAccount implements WithdrawOnlyAccount{

    private double balance;

    public SavingAccount(){
        balance = 0;
    }

    public void Deposite(double amount){
        balance += amount;
        System.out.println("Deposited: "+amount+" in Savings Account. New Balance: "+ balance);
    }
    public void Withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("Withdraw: "+amount+" from Savings Account. New Balance: "+balance);
        }else{
            System.out.println("Insufficient funds in Savings Account");
        }
    }
}