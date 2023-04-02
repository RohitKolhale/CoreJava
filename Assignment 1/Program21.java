class Program21{
    public static void main(String[] args){
        Long Instance = new Long(100);
        byte b = Instance.byteValue();
        short s = Instance.shortValue();
        int i = Instance.intValue();
        long l = Instance.longValue();
        double d = Instance.doubleValue();
        float f = Instance.floatValue();

        System.out.println("b: "+ b);
        System.out.println("s: "+ s);
        System.out.println("i: "+ b);
        System.out.println("l: "+ l);
        System.out.println("d: "+ d);
        System.out.println("f: "+ f);
    }
}