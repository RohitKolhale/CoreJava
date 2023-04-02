/**class Program28{
    public static void main(String[]args){
        double value = 79;
        String str = Double.toString(value);
        System.out.println("Converted double value into String:"+ str);
    }
}*/

/**class Program28{
    public static void main(String [] args){
        double value = 97;
        double instance = Double.valueOf(value);
        System.out.println(" double value into Double instance:"+ instance);
    }
}*/

/**class Program28{
    public static void main (String[]args){
        String str = "7997";
        double instance = Double.valueOf(str);
        System.out.println("Converted String instance into Double instance:"+ instance);
    }
}*/

class Program28{
    public static void main(String [] args){
        double value = 7799;

         //Convert double to long bits
         long doubleToLong = Double.doubleToLongBits(value);

          //Convert double to binary
    String binaryString = Long.toBinaryString(doubleToLong);

      //Convert double to octal
    String octalString = Long.toOctalString(doubleToLong);

     //Convert double to hexadecimal
    String hexString = Long.toHexString(doubleToLong);

     //Print all converted values
    System.out.println("Converted Double value into Binary:"+ binaryString);
    System.out.println("Converted Double value into Octal:"+ octalString);
    System.out.println("Converted Double value into Hex:"+ hexString);
    }
}