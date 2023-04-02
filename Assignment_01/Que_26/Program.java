 class Program {
    public static void main(String[] args) {
        float num1 = 3.14f;
        float num2 = 5.5f;

        // Find minimum and maximum numbers
        float min = Float.MIN_VALUE;
        float max = Float.MAX_VALUE;

        System.out.println("Minimum float value: " + min);
        System.out.println("Maximum float value: " + max);

        // Add two float numbers
        float sum = Float.sum(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}