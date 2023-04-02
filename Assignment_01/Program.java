import java.net.SocketPermission;
import java.util.Scanner;

 class Program {
    public static void main(String args[]){
        boolean b1 = true;
        String str = Boolean.toString( b1 );
        System.out.println("Boolean to string: "+str);

    //Boolean value into Boolean instance
        boolean value = false;
        Boolean b2 = Boolean.valueOf(value);
        System.out.println("Boolean value to Boolean instance: "+value);

    //String value into Boolean value
        String s1 = "Suraj";
        boolean b3 = Boolean.parseBoolean("s1");
        System.out.println("String value to Boolean value: "+b3);
        
    //String value into Boolean instance
    String s2 = "Suraj";
    boolean b4 = Boolean.valueOf("s2");
    System.out.println("String value to Boolean instance: "+b4);
    
    }
     
}

    

