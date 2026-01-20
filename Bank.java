package BankAccounts;
import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Welcome to IBank!");
       System.out.println("Enter balance");
       int balance=sc.nextInt();
       System.out.println("Enter amount");
       int amount=sc.nextInt();
       sc.close();
       Account b1=new Account(balance,amount);
       try{
        b1.withdraw();
       }
        catch (InsufficientBalanceException e){
System.out.println(e.getMessage());
        }
    }
}
class InsufficientBalanceException extends Exception{
      InsufficientBalanceException(String message){
        super(message);
      }
} 
class Account{
int balance;
int amount;
Account(int balance,int amount){
this.balance=balance;
this.amount=amount;
}
public void withdraw() throws InsufficientBalanceException{
       if(amount>balance){
        throw new InsufficientBalanceException("InsufficientBalanceException: Cannot withdraw Rs. "+amount+",balance Rs. "+balance);
       }
       else{
        System.out.println("Withdrawal successful");
       }
}
}