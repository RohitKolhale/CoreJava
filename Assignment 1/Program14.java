
/**class Program14{
 public static void main(String[] args) {
        // Create a Short instance
        Short num = 123;

        // convert the Short instance to Byte
        byte b = num.byteValue();

        // print the Byte value
        System.out.println("Byte value: " + b);
    }
}*/

class Program14{
    public static void main (String []args){
        short value = 100;
        byte b = (byte) value;
        short s = value;
        long l = (long) value;
        int  i = (int) value;
        double d = (double) value;
        float f = (float) value;
        System.out.println("Converted byte value :"+ b);
        System.out.println("Converted short value :"+ s);
        System.out.println("Converted long value :"+ l);
        System.out.println("Converted int value :"+ i);
        System.out.println("Converted double value :"+ d);
        System.out.println("Converted float value :"+ f);
    }
}
