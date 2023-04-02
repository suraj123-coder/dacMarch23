 class Program {
    public static void main(String[] args) {
        long num = 123456789L;

        // Convert a long value to a String
        String numStr = Long.toString(num);
        System.out.println("Long value as String: " + numStr);

        // Convert a long value to a Long instance
        Long numObj = Long.valueOf(num);
        System.out.println("Long value as Long instance: " + numObj);

        // Convert a String instance to a Long instance
        String str = "987654321";
        Long strObj = Long.valueOf(str);
        System.out.println("String value as Long instance: " + strObj);

        // Convert a long value to binary, octal, and hexadecimal string
        String binaryStr = Long.toBinaryString(num);
        String octalStr = Long.toOctalString(num);
        String hexStr = Long.toHexString(num);
        System.out.println("Long value as binary string: " + binaryStr);
        System.out.println("Long value as octal string: " + octalStr);
        System.out.println("Long value as hexadecimal string: " + hexStr);
    }
}