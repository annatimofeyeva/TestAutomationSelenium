public class CitBankAccount extends BankAccountSimple {

    public CitBankAccount(int accountNumber, double balance, String customerName) {
        super(accountNumber, balance, customerName);
    }

    public static void main(String[] args) throws MinimumBalanceNotMaintainedException, InactiveAccountException {
        CitBankAccount account1 = new CitBankAccount(1111, 2000, "Anna");
        CitBankAccount account2 = new CitBankAccount(1111, 3000, "Alla");
        CitBankAccount account3 = new CitBankAccount(1111, 4000, "Lynn");
        CitBankAccount account4 = new CitBankAccount(1111, 5000, "Emily");
        CitBankAccount account5 = new CitBankAccount(1111, 6000, "Alena");
        CitBankAccount[] accounts = new CitBankAccount[5];

        accounts[0] = account1;
        accounts[1] = account2;
        accounts[2] = account3;
        accounts[3] = account4;
        accounts[4] = account5;

        String customer3name = accounts[3].getCustomerName();
        System.out.println("Customer3 name is: " + customer3name);

        double totalsum = 0.00;
        for (int i = 0; i < accounts.length; i++) {
            double balanceOfEachPerson = accounts[i].getBalance();
            totalsum = totalsum + balanceOfEachPerson;
        }
        System.out.println("Total balance of all accounts is: " + totalsum);

        try {
            account1.withDraw(300);
        } catch (MinimumBalanceNotMaintainedException e) {
            System.out.println("You dont have sufficient balance");
        }
        double y = account1.getBalance();
        System.out.println("Account1 balance after withdraw =  " + y);
    }

    // methods Overriding - when you have your requirments - you can create your own methods
    public void deposit(double amount) {
        balance = balance + amount + 10;
    }
}


