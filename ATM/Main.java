public class Main {
    public static void main(String[] args) {

        Savings_account account = new Savings_account(1000000.987);
        ATM_machine atm = new ATM_machine(account);


        atm.start();
    }
}



