package LSP;



class CurrentAccount implements WithdrawOnlyAccount{

    private double balance;

    public CurrentAccount(){
        balance = 0;
    }

    public void Deposite(double amount){
        balance += amount;
        System.out.println("Deposited: "+amount+" in current Account. New Balance: "+balance);
    }
    public void Withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("Withdraw: "+amount+" from Current Account. New Balance: "+balance);
        }
        else{
            System.out.println("Insufficient Funds in Current Account");
        }
    }
}