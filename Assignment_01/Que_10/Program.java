public class CharOperations {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("Please enter a single character as argument");
            return;
        }
        char c = args[0].charAt(0);
        if(Character.isDigit(c)) {
            System.out.println("Entered character is a digit");
            System.out.println("Value: " + c);
            System.out.println("Code point: " + (int) c);
        } else if(Character.isLetter(c)) {
            System.out.println("Entered character is a letter");
            if(Character.isLowerCase(c)) {
                System.out.println("Converted to uppercase: " + Character.toUpperCase(c));
                System.out.println("Code point: " + (int) Character.toUpperCase(c));
            } else {
                System.out.println("Entered character is already in uppercase");
                System.out.println("Code point: " + (int) c);
            }
        } else {
            System.out.println("Entered character is neither a digit nor a letter");
        }
    }
}
Here's how you can run this program from the command line and pass a character as argument:

css
Copy code
java CharOperations a
This will output:

less
Copy code
Entered character is a letter
Converted to uppercase: A
Code point: 65
If you pass a digit as argument:

Copy code
java CharOperations 7
This will output:

less
Copy code
Entered character is a digit
Value: 7
Code point: 55





