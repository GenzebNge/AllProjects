package allProject;

import java.util.ArrayList;
import java.util.Random;

public class RandumArrayListGenerator {

    public static void main(String[] args) {
        acountNumber();

    }


    public static ArrayList acountNumber() {
       ArrayList account[];
        Random r = new Random();

        int[] accounts = new int[3];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = r.nextInt(100000);
        }

        for (int i : accounts) {
            System.out.print(i + " ");
        }


        return null;
    }
}





