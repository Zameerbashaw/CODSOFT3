import java.util.Scanner;
class ATM_machine {
        Savings_account account;

        public ATM_machine(Savings_account account) {
            this.account = account;
        }

        public void start() {
            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {
                System.out.println("\nATM Machine");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        withdraw(withdrawAmount);
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        deposit(depositAmount);
                        break;
                    case 3:
                        checkBalance();
                        break;
                    case 4:
                        running = false;
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
            scanner.close();
        }


        public void withdraw(double amount) {
            if (amount > account.bal) {
                System.out.println("Insufficient balance so Transaction failed.");
            } else if (amount <= 0) {
                System.out.println("Invalid amount so Transaction failed.");
            } else {
                account.Withdraw(amount);
                System.out.println("Withdrawal successful so Please collect your cash.");
            }
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid amount so Transaction failed.");
            } else {
                account.Deposit(amount);
                System.out.println("Deposit successful.");
            }
        }

        public void checkBalance() {
            System.out.println("Your current savings account balance is: ₹" + account.bal);
        }

    }





