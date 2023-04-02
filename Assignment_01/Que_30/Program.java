 class Program {
    public static void main(String[] args) {
        double num1 = 3.14;
        double num2 = 2.71;

        // Find minimum number
        double minNum = Double.min(num1, num2);
        System.out.println("Minimum number: " + minNum);

        // Find maximum number
        double maxNum = Double.max(num1, num2);
        System.out.println("Maximum number: " + maxNum);

        // Add two numbers
        double sum = Double.sum(num1, num2);
        System.out.println("Sum of the two numbers: " + sum);
    }
}