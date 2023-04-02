 class Program {
    public static void main(String[] args) {
        Long longObj1 = Long.MAX_VALUE;
        Long longObj2 = Long.MIN_VALUE;

        System.out.println("Maximum value of long: " + Long.MAX_VALUE);
        System.out.println("Minimum value of long: " + Long.MIN_VALUE);

        long sum = Long.sum(longObj1, longObj2);
        System.out.println("Sum of " + longObj1 + " and " + longObj2 + " is " + sum);
    }
}