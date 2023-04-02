 class Program {
    public static void main(String[] args) {
        int num = 123456;

        // number of bits used to represent integer value
        int bits = Integer.SIZE;
        System.out.println("Number of bits used to represent integer value: " + bits);

        // number of bytes used to represent integer value
        int bytes = Integer.BYTES;
        System.out.println("Number of bytes used to represent integer value: " + bytes);

        // minimum value of integer
        int minValue = Integer.MIN_VALUE;
        System.out.println("Minimum value of integer: " + minValue);

        // maximum value of integer
        int maxValue = Integer.MAX_VALUE;
        System.out.println("Maximum value of integer: " + maxValue);
    }
}