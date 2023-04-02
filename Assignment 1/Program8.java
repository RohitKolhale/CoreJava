/**class Program8{
    public static void main(String[]args){
        //byte value into String
        byte value = 123;
        String str = Byte.toString(value);
        System.out.println("The String value is: "+str);
    }
}*/

/**class Program8{
    public static void main(String [] args){
        // byte value into byte instance 
        Byte bytevalue =123;
        Byte byteInstance = Byte.valueOf(bytevalue);
        System.out.println("byte value" + " converted to byte Instance :" + byteInstance);
      }
    }*/

class Program8{
    public static void main(String [] args){
        String str = "123";
        Byte byteInstance = Byte.valueOf(str);
        System.out.println( "string instance converted into Byte instance :" + str);
    }
} 



