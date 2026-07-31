package LSP;
import java.util.*;
class Client{
    private List<DepositeOnlyAccount>list1 = new ArrayList<>();
    private List<WithdrawOnlyAccount>list2 = new ArrayList<>();

    public Client(List<DepositeOnlyAccount>list1, List<WithdrawOnlyAccount>list2){
        this.list1 = list1;
        this.list2 = list2;
    }


    public void processTransactions(){
        for(WithdrawOnlyAccount acc : list2){
            acc.Deposite(1000);
           acc.Withdraw(500);
        }
        for(DepositeOnlyAccount acc : list1){
            acc.Deposite(5000);
        }
    }
}