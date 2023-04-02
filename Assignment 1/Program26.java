class Program26{
    public static void main(String [] args){
        System.out.println("minimum value of float:"+ Float.MIN_VALUE);
         System.out.println("maximum value of float:"+ Float.MAX_VALUE);

         float num1=1.5f;
         float num2=2.0f;
         
          // Adding two numbers using Float's static method
         float sum =Float.sum(num1,num2);
         System.out.println("Sum = "+ sum);
    }
}
