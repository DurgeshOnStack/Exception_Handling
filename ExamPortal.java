package BankAccounts;
import java.util.Scanner;
class ExamPortal{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int attempts=sc.nextInt();
        ExamAccess c =new ExamAccess ();
        try{
            c.validateAccess(attempts);
        }
        catch(SecurityException e){
             System.out.println(e.getMessage());
        }
    }
}
class SecurityException extends Exception{
    SecurityException(String message){
        super(message);
    }
}
class ExamAccess{
    void validateAccess(int attempts) throws SecurityException{
        if(attempts>3){
            throw new SecurityException("Account locked due to multiple failed attempts");
        }
        else if(attempts<=0){
            System.out.println("Error! Try again ");
        }
        else{
            System.out.println("Access granted");
        }
    }
}