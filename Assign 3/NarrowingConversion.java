public class MyClass {
    public static void main(String[] args) {
        int i = 5;
        double d = 10.00;
        long l = 15;
        float f = 15.00f;

        double dResult = i + d;                       //This line performs an addition operation between i and d. Since d is a double and i is an integer, i is implicitly converted (widened) to a double before the addition.

        
        long lResult = i + l;                          // Similar to the previous line, here i is added to l. Since l is a long and i is an integer, i is implicitly converted (widened) to a long before the addition.
        float fResult = i + f;                        // Here, i is added to f. Since f is a float and i is an integer, i is implicitly converted (widened) to a float before the addition.   

        System.out.println("double : " + dResult);                      //Finally, the results of the addition operations are printed to the console.
        System.out.println("long : " + lResult);
        System.out.println("float : " + fResult);
    }
}
