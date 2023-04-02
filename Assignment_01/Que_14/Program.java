 class Program{
    public static void main(String[] args) {
        Short shortValue = 12345;

        byte byteValue = shortValue.byteValue();
        System.out.println("Short value " + shortValue + " converted to byte: " + byteValue);

        short shortValue2 = shortValue.shortValue();
        System.out.println("Short value " + shortValue + " converted to short: " + shortValue2);

        int intValue = shortValue.intValue();
        System.out.println("Short value " + shortValue + " converted to int: " + intValue);

        long longValue = shortValue.longValue();
        System.out.println("Short value " + shortValue + " converted to long: " + longValue);

        float floatValue = shortValue.floatValue();
        System.out.println("Short value " + shortValue + " converted to float: " + floatValue);

        double doubleValue = shortValue.doubleValue();
        System.out.println("Short value " + shortValue + " converted to double: " + doubleValue);
    }
}