 class Program {
    public static void main(String[] args) {
        int num = 42;

        // int value to String
        String str = Integer.toString(num);
        System.out.println("Int value to String: " + str);

        // int value to Integer instance
        Integer integer = Integer.valueOf(num);
        System.out.println("Int value to Integer instance: " + integer);

        // String instance to Integer instance
        String strNum = "123";
        Integer integer2 = Integer.parseInt(strNum);
        System.out.println("String instance to Integer instance: " + integer2);

        // int value to binary string
        String binaryStr = Integer.toBinaryString(num);
        System.out.println("Int value to binary string: " + binaryStr);

        // int value to octal string
        String octalStr = Integer.toOctalString(num);
        System.out.println("Int value to octal string: " + octalStr);

        // int value to hexadecimal string
        String hexStr = Integer.toHexString(num);
        System.out.println("Int value to hexadecimal string: " + hexStr);
    }
}