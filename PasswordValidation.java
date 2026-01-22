package BankAccounts;

import java.util.Scanner;
class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your password ");
        String  password=sc.nextLine();
         
        Authenticator c= new Authenticator (password);
        try{
        c.validatePassword();
        }
        catch(PasswordValidationException e){
            System.out.println(e.getMessage()); 
        }
    }
}
class PasswordValidationException extends Exception{
    PasswordValidationException (String message){
        super(message);
    }
}
class Authenticator{
    String password;
    Authenticator (String password){
        this.password=password;
      
    }
    void validatePassword() throws PasswordValidationException{
        if(password.length()<8){
            throw new PasswordValidationException(" Sorry! Password must be at least 8 characters");
        }
        else{
            System.out.println("Authentication successful");
        }
        
    }
}