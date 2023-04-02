 class Program {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a full name as an argument.");
        } else {
            String fullName = String.join(" ", args);
            System.out.println("Full Name: " + fullName);
        }
    }
}