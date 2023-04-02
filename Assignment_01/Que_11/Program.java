 class Program {
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
                char upperCaseChar = Character.toUpperCase(c);
                System.out.println("Converted to uppercase: " + upperCaseChar);
                System.out.println("Code point: " + (int) upperCaseChar);
            } else {
                char lowerCaseChar = Character.toLowerCase(c);
                System.out.println("Converted to lowercase: " + lowerCaseChar);
                System.out.println("Code point: " + (int) lowerCaseChar);
            }
        } else {
            System.out.println("Entered character is neither a digit nor a letter");
        }
    }
}
