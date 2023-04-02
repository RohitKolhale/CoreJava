/**class Program24{
    public static void main(String [] args){
        Float value = 1.11f;
        String str = Float.toString(value);
        System.out.println("Converted float value into String :"+ str);
        
    }
}*/

/**class Program24{
    public static void main(String [] args){
        float f = 2.22f;
        Float Instance = Float.valueOf( f);
        System.out.println("Converted float value inti float instance:"+ Instance);
    }
}*/

/**class Program24{
    public static void main (String [] args){
        String str = "12.12";
        Float Instance = Float.valueOf(str);
        System.out.println("Converted String instance into Float instance:"+ Instance);
    }
}*/

class Program24{
    public static void main (String [] args){
        float f = 1.23f;
        String hexadecimalString = Float.toHexString(f);
        System.out.println("Converted float value into hexadecimal string:"+ hexadecimalString);
    }
}