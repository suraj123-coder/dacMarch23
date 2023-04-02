 class Program {
    public static void main(String[] args) {
        Float floatValue = 3.14159f;

        // Convert Float to byte
        byte byteValue = floatValue.byteValue();
        System.out.println("Float as byte: " + byteValue);

        // Convert Float to short
        short shortValue = floatValue.shortValue();
        System.out.println("Float as short: " + shortValue);

        // Convert Float to int
        int intValue = floatValue.intValue();
        System.out.println("Float as int: " + intValue);

        // Convert Float to long
        long longValue = floatValue.longValue();
        System.out.println("Float as long: " + longValue);

        // Convert Float to float
        float floatValue2 = floatValue.floatValue();
        System.out.println("Float as float: " + floatValue2);

        // Convert Float to double
        double doubleValue = floatValue.doubleValue();
        System.out.println("Float as double: " + doubleValue);
    }
}