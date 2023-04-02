class Program {
    public static void main(String[] args) {
        Integer num = 42;

        // Integer instance to byte
        byte byteNum = num.byteValue();
        System.out.println("Integer instance to byte: " + byteNum);

        // Integer instance to short
        short shortNum = num.shortValue();
        System.out.println("Integer instance to short: " + shortNum);

        // Integer instance to int
        int intNum = num.intValue();
        System.out.println("Integer instance to int: " + intNum);

        // Integer instance to long
        long longNum = num.longValue();
        System.out.println("Integer instance to long: " + longNum);

        // Integer instance to float
        float floatNum = num.floatValue();
        System.out.println("Integer instance to float: " + floatNum);

        // Integer instance to double
        double doubleNum = num.doubleValue();
        System.out.println("Integer instance to double: " + doubleNum);
    }
}