class narrowing {
    public static void main(String[] args) {

        double d = 5.50;
        int i = (int) d;                        // Performs a narrowing conversion from double to int, explicitly casting d to int

        System.out.println(i);
    }
}
