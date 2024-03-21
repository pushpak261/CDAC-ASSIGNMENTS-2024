public class WideningConversionDemo {
    public static void main(String[] args) {
       
        int intValue = 42;                                         // Initialize an int variable

        // Perform widening conversions and print the results
        
        double doubleValue = intValue;                               // Widening conversion to double
        float floatValue = intValue;                                // Widening conversion to float
        boolean booleanValue = (intValue != 0);                    // Widening conversion to boolean (non-zero int is true)
        String stringValue = String.valueOf(intValue);            // Widening conversion to String

        // Print the results
        System.out.println("Widening conversion from int to double: " + doubleValue);
        System.out.println("Widening conversion from int to float: " + floatValue);
        System.out.println("Widening conversion from int to boolean: " + booleanValue);
        System.out.println("Widening conversion from int to String: " + stringValue);
    }
}
