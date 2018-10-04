package allProject;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.Scanner;

public class Compar {
    public static void main(String[] args) {
        String newNumber ="";

        System.out.println("Enter the first number");
        Scanner userInput = new Scanner(System.in);
        int num1 = userInput.nextInt();

        System.out.println("Enter the first number");
        int num2=  userInput.nextInt();
        userInput.nextLine();

        System.out.println("Do you want to enter an other number?");
        newNumber  =  userInput.next();


        int NumMax = num1>num2 ? num1:num2;
        System.out.println("The max number is " + NumMax);
    }


    public void stringLIST() {
        for (int i = 0; i <= 10; i++) {

        }
    }
}
