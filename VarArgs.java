import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // fun(2,3,4,5,11,3,5,566,4,23,4);
        // multiple(12, 9, "Ashish","Kunal","Rahul");

        // demo(1,3,4,5,3,2,3);
        // demo(); // this is the case of ambiguous, meaning the varchar cannot be empty


    }

    static void demo(int ...a) {
        System.out.println(Arrays.toString(a));
        
    }

    static void demo(String ...a) {        
        System.out.println(Arrays.toString(a));
    }

    static void multiple(int a, int b, String ...s) { 

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
