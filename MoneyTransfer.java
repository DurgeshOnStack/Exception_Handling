package BankAccounts;
import java.util.Scanner;
class MoneyTransfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter account number: ");
            long accountNumber = sc.nextLong();

            FinancialTransaction c = new FinancialTransaction();
            c.processTransaction(amount, accountNumber);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input: Please enter a valid number for transaction amount.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

class FinancialTransaction {
    public void processTransaction(double amount, long accountNumber) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Error processing transaction: Transaction amount must be positive."
            );
        }

        System.out.println(
            "Transaction successful: Amount Rs." + amount +
            " transferred to account " + accountNumber
        );
    }
}
