 class Program {
    public static void main(String[] args) {
        Long longObj = Long.MAX_VALUE;
        System.out.println("Long Object value: " + longObj);

        byte byteValue = longObj.byteValue();
        System.out.println("Byte value: " + byteValue);

        short shortValue = longObj.shortValue();
        System.out.println("Short value: " + shortValue);

        int intValue = longObj.intValue();
        System.out.println("Integer value: " + intValue);

        long longValue = longObj.longValue();
        System.out.println("Long value: " + longValue);

        float floatValue = longObj.floatValue();
        System.out.println("Float value: " + floatValue);

        double doubleValue = longObj.doubleValue();
        System.out.println("Double value: " + doubleValue);
    }
}
