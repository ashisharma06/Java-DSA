public class Overloading {
    public static void main(String[] args) {
        // fun(43); 
        // fun("ashish");

        int ans = sum(4, 3, 23);
        System.out.println(ans);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("First one");
        System.out.println(a);

    }

    static void fun(String a) {
        System.out.println("Second One");
        System.out.println(a);
    } 
}
