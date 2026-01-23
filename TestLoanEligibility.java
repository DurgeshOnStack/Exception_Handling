package BankAccounts;
import java.util.Scanner;
class TestLoanEligibility{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age ");
        int age=sc.nextInt();
         System.out.println("Enter your salary ");
        int salary=sc.nextInt();
        LoanEligibility c=new LoanEligibility();
        try{
            c.checkEligibility(age,salary);
        }
        catch (LoanEligibilityException e){
            System.out.println(e.getMessage());
        }
    }
}
class LoanEligibilityException extends Exception{
    LoanEligibilityException(String message) {
        super(message);
    }
}
class LoanEligibility{
    void checkEligibility(int age, int salary) throws LoanEligibilityException{
        if( age<=18 || salary<=25000){
            throw new LoanEligibilityException("Not eligible for loan");
        }
        else{
            System.out.println("Loan approved");
        }
    }
}