package BankAccounts;
import java.util.Scanner;
class Developer {
 public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the duration ");
     int duration=sc.nextInt();
     TrainingClass c=new TrainingClass(duration);
     try{
         c.trainingDetails();
     }
     catch(TrainingInvalidException e){
         System.out.println(e.getMessage());
     }
 }
}
class TrainingClass{
 int duration;
 TrainingClass(int duration){
     this.duration=duration;
 }
 void trainingDetails() throws TrainingInvalidException{
     if(duration<2){
         throw new TrainingInvalidException("Training duration too short");
     }
     else{
         System.out.println("Training completed successfully");
     }
 }
 
 
}
class TrainingInvalidException extends Exception {
 TrainingInvalidException(String message){
     super(message);
 }
}