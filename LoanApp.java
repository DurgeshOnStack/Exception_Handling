package BankAccounts;

import java.util.Scanner;
class LoanApp{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("====Welcome To Loan App====");
        System.out.println("Enter your amount:"); 
        double amount=sc.nextDouble();
        System.out.println("Enter your credit score:");
        int creditScore=sc.nextInt();
        LoanApproval c=new LoanApproval();
        try{
            c.applyLoan(amount,creditScore);
        }
        catch(InvalidLoanAmountException e){
            System.out.println(e.getMessage());
        }
         catch(InvalidCreditScoreException e){
            System.out.println(e.getMessage());
        }
         catch(LowCreditScoreException e){
            System.out.println(e.getMessage());
        }
        finally {
           System.out.println("Loan Processing Completed. Thank You!"); 
        }
    }
}
class InvalidLoanAmountException extends Exception{
    InvalidLoanAmountException(String message){
        super(message);
    }
}
class InvalidCreditScoreException extends Exception{
    InvalidCreditScoreException(String message){
        super(message);
    }
}
class LowCreditScoreException extends Exception{
    LowCreditScoreException(String message){
        super(message);
    }
}
class LoanApproval{
    public void applyLoan(double amount,int creditScore ) throws InvalidLoanAmountException,InvalidCreditScoreException,LowCreditScoreException{
        if(amount<0 || amount>1000000){
            throw new InvalidLoanAmountException("Error: Invalid Loan Amount");
        }
        else if(creditScore<300||creditScore>850){
            throw new InvalidCreditScoreException("Error: Invalid credit score");
        }
         else if(creditScore<600){
            throw new LowCreditScoreException("Error: Credit Score too low");
        }
        else{
            System.out.println("Loan approved.");
        }
    }
}
