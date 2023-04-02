class Program {
    public static void main(String args[]) 
    //Byte to String
    {
        byte b1 = 123 ;
        String str = Byte.toString(b1);
        System.out.println("Byte to String: "+str);
    
    //Byte value to Byte instance

        byte b2 = 120;
        byte b = Byte.valueOf(b2);
        System.out.println("Byte value to Byte instance: "+b);

    //String instance into byte instance

    String st = "Amay" ;
    byte []arr = st.getBytes();
    System.out.println("String instance to byte instance: "+arr);


    }

    
}

