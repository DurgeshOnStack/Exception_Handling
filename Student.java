package BankAccounts;

import java.util.Scanner;
public class Student{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student ID :");
        int id=sc.nextInt();
        StudentService s=new StudentService();
        try{
            s.getStudent(id);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class StudentService{
    public void getStudent(int id) throws Exception{
        if(id<=0){
            throw new Exception("Invalid student ID");
        }
        else{
            System.out.println("Student record fetched");
        }
    }
}
