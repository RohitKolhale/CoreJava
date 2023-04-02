/**class Program20{
    public static void main(String [] args){
        long Value=123456789;
        String str = Long.toString(Value);
        System.out.println("String value :"+str);
    }
}*/

/**class Program20{
    public static void main(String[] args){
        long value =123456789;
        long Instance = Long.valueOf(value);
        System.out.println("long value into long instance: "+ Instance);

    }
}*/

/**class Program20{
    public static void main(String[]args){
        String instance = "123";
        //The conversion from String to Long should be done using the "Long.parseLong()" method.
        Long Instance = Long.parseLong(instance);
        System.out.println("String instance into Long instance :"+ Instance);
    }
}*/

class Program20{
    public static void main (String [] args){
       long value = 147852369;
        String BinaryString = Long.toBinaryString(value);
        String OctalString =Long.toOctalString(value);
       String HexadecimalString =Long.toHexString(value);
       System.out.println("Long value into Binary; "+ BinaryString);
       System.out.println("Long value into Octal; "+ OctalString);
       System.out.println("Long value into Hexadecimal; "+ HexadecimalString);
    }
}