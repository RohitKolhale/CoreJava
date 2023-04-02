/**class Program6{
public static void main(String [] args) {

   // Declare a boolean variable
    boolean b = (true);

       // Convert boolean to String
    String str= String.valueOf(b);

     // Print the boolean value in String
    System.out.println("Boolean value as String:" + str);
  }
}*/


/**class Program6{
  public static void main(String [] args){

     // Declare a boolean variable
    Boolean Booleanvalue = true;

    // Convert Boolean value into Boolean Instance
    Boolean BooleanInstance = Boolean.valueOf(Booleanvalue);

    //Print the Boolean value into Boolean Instance
    System.out.println("Boolean value:" + Booleanvalue);
    System.out.println("Boolean Instance:" + BooleanInstance);
  }
}*/


class Program6{
  public static void main(String [] args){

    String str = "true";
    Boolean Booleanb =Boolean.parseBoolean(str);
    System.out.println("String value as Boolean:" + Booleanb);
  }
}