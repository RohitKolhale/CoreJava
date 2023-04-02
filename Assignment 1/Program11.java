public Program11 {
    public static void main(String[] args) {
        char ch =args[0].charAt(0);
        //char ch1 =args[1].charAt(1);
        //String s1=Character.toString(ch);
        if (Character.isDigit(ch))
        //Determines if the specified character is a digit.
        {
            System.out.println("Entered input is Digit.");
           
        }
        else
        {
            if(Character.isLetter(ch))
            // Determines if the given character is character.
            {
                System.out.println("Entered input is Character");
                if( ch < 123 && ch > 96)
                {
                    System.out.println("Lower case");
                    System.out.println("Upper Case :"+Character.toUpperCase(ch));
                    //Uppercase remaining
                }
                if( ch > 64 && ch < 91)
                {
                    System.out.println("Upper Case");
                    // lowercase remaining
                    System.out.println("Lower Case : "+Character.toLowerCase(ch));
                }
            }
            else
            System.out.println("Entered input is Not Character Nor Digit");
        }
    }
    
}