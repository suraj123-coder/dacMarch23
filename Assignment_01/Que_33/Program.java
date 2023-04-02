 class Program {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide three command-line arguments: <number1> <number2> <operation>");
            return;
        }
        
        double num1 = 0, num2 = 0, result = 0;
        try {
            num1 = Double.parseDouble(args[0]);
            num2 = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
            return;
        }
        
        char op = args[2].charAt(0);
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Division by zero!");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation: " + op);
                return;
        }
        
        System.out.println(num1 + " " + op + " " + num2 + " = " + result);
    }
}