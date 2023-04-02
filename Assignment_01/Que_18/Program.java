public class Program {
    public static void main(String[] args) {
        int num1 = 42;
        int num2 = 69;

        // Find the minimum number
        int minNum = Integer.min(num1, num2);
        System.out.println("Minimum number: " + minNum);

        // Find the maximum number
        int maxNum = Integer.max(num1, num2);
        System.out.println("Maximum number: " + maxNum);

        // Add the two numbers
        int sum = Integer.sum(num1, num2);
        System.out.println("Sum of the two numbers: " + sum);
    }
}
