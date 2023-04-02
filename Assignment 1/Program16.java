/**class Program16{
    public static void main (String [] args){
        int num = 123;
        String str = Integer.toString(num);
        System.out.println("int value into string : "+ str);

    }
}*/

/**class Program16{
    public static void main(String [] args){
    int num = 100;
    Integer instance = Integer.valueOf(num);
    System.out.println("Converted to Integer instance : "+ instance);
  }
}*/

/**class Program16{
    public static void main(String [] args){
        String str = "103";
        Integer instance = Integer.valueOf(str);
        System.out.println(" String instance into Integer instance: "+ instance);
    }
}*/

class Program16{
    public static void main (String [] args){
        int num = 132;
        String binarystr = Integer.toBinaryString(num);
         String hexastr = Integer.toHexString(num);
         String octastr = Integer.toOctalString(num);
        System.out.println("Converted integer value into binary: "+ binarystr);
        System.out.println("Converted integer value into hexadecimal: "+ hexastr);
        System.out.println("Converted integer value into octadecimal: "+ octastr);
    }
}