/**class Program13{
    public static void main (String [] args) {

        //short value into string
        short value = 123;
        String str = Short.toString(value);
        System.out.println("The String value is :"+ str);

    }
}*/

/**class Program13{
    public static void main ( String [] args) {

        //short value into short instance
        short value = 100;
        short Instance = Short.valueOf(value);
        System.out.println("short Instance value is :"+ Instance);
    }
}*/

class Program13{
    public static void main (String [] args){
        String str = "132";
        Short Instance = Short.valueOf(str);
        System.out.println("The short Instance value is :" + Instance);
    }
}