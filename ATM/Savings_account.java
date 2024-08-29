class Savings_account {
    double bal;

    public Savings_account(double initialBalance) {
        this.bal = initialBalance;
    }


    public void Withdraw(double amount) {
        if (amount <= bal) {
            bal -= amount;
        }
    }

    public void Deposit(double amount) {
        bal += amount;
    }
}

