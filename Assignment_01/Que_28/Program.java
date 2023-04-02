 class Program {
    public static void main(String[] args) {
        // convert double value to String
        double num1 = 3.14159;
        String str1 = Double.toString(num1);
        System.out.println("Double value " + num1 + " as String: " + str1);

        // convert double value to Double instance
        double num2 = 2.71828;
        Double doubleObj1 = Double.valueOf(num2);
        System.out.println("Double value " + num2 + " as Double instance: " + doubleObj1);

        // convert String instance to Double instance
        String str2 = "1.41421";
        Double doubleObj2 = Double.valueOf(str2);
        System.out.println("String " + str2 + " as Double instance: " + doubleObj2);

        // convert double value to binary, octal, and hexadecimal string
        double num3 = 42.424242;
        long num3Bits = Double.doubleToLongBits(num3);
        String binaryStr = Long.toBinaryString(num3Bits);
        String octalStr = Long.toOctalString(num3Bits);
        String hexStr = Long.toHexString(num3Bits);
        System.out.println("Double value " + num3 + " as binary string: " + binaryStr);
        System.out.println("Double value " + num3 + " as octal string: " + octalStr);
        System.out.println("Double value " + num3 + " as hexadecimal string: " + hexStr);
    }
}