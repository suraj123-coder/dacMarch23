 class Program {
    public static void main(String[] args) {
        // convert short value to String
        short s = 12345;
        String shortString = Short.toString(s);
        System.out.println("Short value " + s + " converted to String: " + shortString);

        // convert short value to Short instance
        Short shortInstance = Short.valueOf(s);
        System.out.println("Short value " + s + " converted to Short instance: " + shortInstance);

        // convert String instance to Short instance
        String str = "54321";
        Short strToShort = Short.valueOf(str);
        System.out.println("String " + str + " converted to Short instance: " + strToShort);
    }
}