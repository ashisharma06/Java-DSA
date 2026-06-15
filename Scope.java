public class Scope {
    public static void main(String[] args) {
        int a = 10; 
        int b = 20;
        String fruit = "Apple";

        {
            // int a = 22; already initialised outside the block in the same method, hence you cannot initialised it again 
            int c = 43;
            fruit = "Mango";
            // System.out.println(fruit);
            a = 54; // reassign the original ref variable to some other value 
            // System.out.println(a);
            // value initialized in this block, will remain in block
        }
        
        // System.out.println(c); // cannot used outside the block
        // scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        // System.out.println(i);
    }

    static void num(){
        // System.out.println(a);
    }
}
