package allProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayAvarage {
    public static void main(String[] args) {
        int sum =0;
        double avarage = 0;

        List<Integer> list = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        System.out.println(" How many numbers do you want to enter?");
        int num = scan.nextInt();
        int array[] = new int[num];

        System.out.println(" Enter the " + num + " numbers now.");

        for (int i = 0 ; i < array.length; i++ ) {
            array[i] = scan.nextInt();
            sum+= array[i];

            avarage = sum/num;

        }


        System.out.println(" These are the numbers you have entered : ");
        printArray(array);

        System.out.println(" The sume of th enumbers is : "  + sum);

        System.out.println(" The avarage of the numbers  is : " + avarage);
        scan.close();

    }


    public static void printArray(int arr[]){

        int n = arr.length;


        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
