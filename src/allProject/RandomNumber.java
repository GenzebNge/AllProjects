package allProject;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {


    Random r = new Random();

    int x = 1 + r.nextInt(50000000);



		System.out.println( "My random number is " + x );


        int num1 = 1 + r.nextInt(10);
        int num2 = 1 + r.nextInt(10);

        if ( num1 == num2 )
        {
            System.out.println( "The random numbers were the same! Weird." );
        }
        if ( num1 != num2 )
        {
            System.out.println( "The random numbers were different! Not too surprising, actually." );
        }

    }
}