package org.example.ClassWork.ExceptionHandling;
import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        String[] names={"md","javeed","khan"};
        Scanner obj=new Scanner(System.in);
        boolean run =true;
        do{
            System.out.println("Enter an index to get the name:");
            int index=obj.nextInt();
            try{
                System.out.println("Name at index "+index+" is: "+names[index]);
                run=false;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid index. Please try again.");
                System.out.println(e.getMessage());
            }
            System.out.print("Do you want to continue? [y/n] ");
            run=obj.nextBoolean();
        }while(run);

    }
}
