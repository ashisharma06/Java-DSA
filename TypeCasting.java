import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // System.out.println(num);

        // type casting
        // Compressing the bigger number into a smaller type
        // int num = (int) (67.54);
        // System.out.println(num);

        // automatic type promotion in expression
        // int a = 257;
        // byte b = (byte) (a);
        // System.out.println(b);

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = a * b / c;
        // System.out.println(d);

        // int number = 'A';
        // System.out.println(number);  // automatic type conversion i.e ASCII value of Capital A is 65

        // System.out.println("नमस्ते");

        // System.out.println(6 * 5.4);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d - s);
        // float + integer + double = double
        System.out.println((f * b) + " " + (i + c) + " " +  - (d - s));
        System.out.println(result);



    }
}
