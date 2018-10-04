package allProject;

import java.util.Scanner;

public class AvarageMarks {
    public static void main(String[] args) {
        int sum=0;  int num = 0;  int array[];  double avarage = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("The number of coures");
        num = scan.nextInt();
        array = new int[num];

        System.out.println("please enter all the scours");

        for (int i = 0; i < num; i++) {
            array[i] = scan.nextInt();
            sum += array[i];

            avarage = sum / num;

            printArrayList(array);
        }

    }

    public static void printArrayList(int arr[]){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");


        }
    }
}
