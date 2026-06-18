public class Main {
    public static void main(String[] args) {
        // Q: Store a roll number
        int a = 21;
        
        // Q: Store a persons name
        String name = "Ashish Sharma";

        //Q: store 5 roll numbers
        int roll1 = 1;
        int roll2 = 2;
        int roll3 = 6;

        // Arrays : An array is a collection of similar datatypes, objects and even complex data
        /*
            Syntax: 
            datatype[] variable_name = new datatype[size];
         */

        // Store 5 roll numbers:
        int[] rollNo = new int[5];
        // or directly
        int[] rollno = {23,43,11,54,32};

        int[] rons; //--> This is declaration of an array, meaning the rons is getting defined in the stack
        rons = new int[5]; //--> initialisation :   actually here the object is being created in the same memory (heap)

        // System.out.println(rons[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);

        for(String element : arr) {
            System.out.println(element);
        }
    }
}
