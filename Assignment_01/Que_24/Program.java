 class Program {
    public static void main(String[] args) {
        // Convert float value to String
        float f = 123.456f;
        String strFloat = Float.toString(f);
        System.out.println("Float value as String: " + strFloat);

        // Convert float value to Float instance
        Float floatInstance = Float.valueOf(f);
        System.out.println("Float value as Float instance: " + floatInstance);

        // Convert String instance to Float instance
        String str = "789.012";
        Float floatInstance2 = Float.parseFloat(str);
        System.out.println("String value as Float instance: " + floatInstance2);

        // Convert float value to hexadecimal string
        String hexString = Float.toHexString(f);
        System.out.println("Float value as hexadecimal string: " + hexString);
    }
}
