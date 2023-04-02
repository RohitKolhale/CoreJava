 class Program33 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        float b = Float.parseFloat(args[1]);
        double c = Double.parseDouble(args[2]);
        int n = Integer.parseInt(args[3]);
        switch(n)
        {
            case 1: System.out.println("Addition of Integer, float and double is: " + (a + b + c));
                    break;
            case 2: System.out.println("Subtraction of Integer, float and double is: " + (a - b - c));
                    break;
            case 3: System.out.println("Multiplication of Integer, float and double is morethan 0 is: " + (a * b * c));
                    break;
            case 4: System.out.println("Division of Integer, float and double is: " + (a / b / c));
                    break;
            default: System.out.println("Invalid input");
                    break;
        }
    }
}