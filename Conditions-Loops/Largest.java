import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Q. find the largest of the 3 numbers
        int max = a;
        if(b > max){
            max = b;
        }
        if (c > max) { 
            max = c;
        }

        System.out.println("Maximum value :"+ max);
    }
}
