package allProject;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner grades = new Scanner(System.in);
        int x = 0;
        int g =0;



        System.out.println ("\n-----------------------------");
        System.out.println ("Email System - Display Students");
        System.out.println ("-----------------------------");
        System.out.format("%10s%15d%15s%15s%20s", "Grade", "Last Name", "First Name", "Student Number", "Parent Email");

//        while(true) {
//          //  System.out.println("What is the percentage of the student: ");
//            g = grades.nextInt();
//            if (x >= 0 && x <= 100)
//                break;
//            System.out.println("Please put in a percent from 0 - 100!\n");
//        }

        System.out.println("Please enter student id ");
        int id = grades.nextInt();
        System.out.println("Enter student name : ");
        String name = grades.next();
        System.out.println("Enter scour");
        g = grades.nextInt();
        x = (g*100)/50;

        if (x <= 100 && x >= 96) {
            System.out.println(id + name + "A+");
        }
        else if (x <= 95 && x >= 92) {
            System.out.println("A");
        }
        else if (x <= 91 && x >= 90) {
            System.out.println("A-");
        }
        else if (x <= 89 && x >= 50) {
            System.out.println("B+");
        }
        else if (x <= 49 && x >= 0) {
            System.out.println("B");
        }


    }
}
