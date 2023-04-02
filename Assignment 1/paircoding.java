class paircoding {
	public static void main(String[]args) {
		double minutes = 3456789; 
		int years ; 
		int days ; 

        years = (int) (minutes/(60*24*365));
        days = (int) (minutes/60/24)%365;
		
		System.out.println( years  + " years and " + days + " days  " );
	}
}