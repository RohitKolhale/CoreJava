class Program9 {
  public static void main(String[] args) {
    Byte b = new Byte("1");
    byte bb = b.byteValue(); 
    short s = b.shortValue(); 
    int i = b.intValue(); 
    long l = b.longValue(); 
    float f = b.floatValue(); 
    double d = b.doubleValue(); 
    System.out.println("Byte: " + bb); 
    System.out.println("Short: " + s); 
    System.out.println("Int: " + i); 
    System.out.println("Long: " + l); 
    System.out.println("Float: " + f); 
    System.out.println("Double: " + d); 
  }
}