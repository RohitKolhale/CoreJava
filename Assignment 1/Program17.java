class Program17{
    public static void main(String [] args){
        Integer integer = new Integer(10);

    byte b =integer.byteValue();
    short s =integer.shortValue();
    int i =integer.intValue();
    long l =integer.longValue();
    double d =integer.doubleValue();
    float f =integer.floatValue();

    System.out.println("b: "+ b);
    System.out.println("s: "+ s);
    System.out.println("i: "+ i);
    System.out.println("l: "+ l);
    System.out.println("d: "+ d);
    System.out.println("f: "+ f);

    }
}