import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*
         * Syntax of for loops:
         * for(initialization; condition; increment/decrement; ){
         * // body
         * }
         */

        // Q: print numbers from 1 to 5
        for (int num = 1; num <= 5; num++) {
            System.out.println(num);
        }


        // print numbers from 1 to n
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int num = 1; num <= n; num++) {
            System.out.println(num + " ");
        }

        // while loops
        /*
            Syntax:
            while(condition){
                body
            }
         */

         int num = 1;
         while (num <= 5) {
             System.out.println(num);
             num++;
         }

        // do while loop
        /*
            Syntax:
            do {
                 body
            } while (condition) {

             }
         */
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);
    }
}

// Practicing while and for loops