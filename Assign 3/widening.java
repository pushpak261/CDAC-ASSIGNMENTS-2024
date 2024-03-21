public class widening {
    public static void main(String[] args) {
        int intValue = 10;
        double doubleValue = intValue;                                //// Performs a widening conversion from int to double
        
        System.out.println("Original int value: " + intValue);
        System.out.println("Widened double value: " + doubleValue);
    }
}

