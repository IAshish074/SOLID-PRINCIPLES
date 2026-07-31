package LSP;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Accounts that support both deposit and withdrawal
        List<WithdrawOnlyAccount> withdrawAccounts = new ArrayList<>();
        withdrawAccounts.add(new SavingAccount());
        withdrawAccounts.add(new CurrentAccount());

        // Accounts that support only deposit
        List<DepositeOnlyAccount> depositAccounts = new ArrayList<>();
        depositAccounts.add(new FixedDeposite());

        // Create client
        Client client = new Client(depositAccounts, withdrawAccounts);

        // Process transactions
        client.processTransactions();
    }
}