public class MyClass {
    public static void main(String[] args) {
        int i = 5;
        double d = 10.00;
        long l = 15;
        float f = 15.00f;

        double dResult = i + d; // Widening conversion: int i is promoted to double
        long lResult = i + l;   // Widening conversion: int i is promoted to long
        float fResult = i + f;  // Widening conversion: int i is promoted to float

        System.out.println("double : " + dResult);
        System.out.println("long : " + lResult);
        System.out.println("float : " + fResult);
    }
}
