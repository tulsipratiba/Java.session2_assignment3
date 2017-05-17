import java.util.Scanner;  


 class Largestnumber {

	
	public static void main(String[] args)
	{
		 int x, y, z;
		 
	     System.out.println("Enter three integers "); 
	      
		Scanner s = new Scanner(System.in); // used to receive input from keyboard.
	 
	      x = s.nextInt();  // used to get integer type value from keyboard for x
	      y = s.nextInt();  //used to get integer type value from keyboard for y
	      z = s.nextInt();  //used to get integer type value from keyboard for z
	 
	      if ( x > y && x > z )
	         System.out.println("First number is largest :"+x); // display message on screen if condition met 
	      
	      else if ( y > x && y > z )
	         System.out.println("Second number is largest:"+y); // display message on screen if condition met
	      
	      else 
	         System.out.println("Third number is largest:"+z); //display message on screen if condition met
	      
	      

	}

}
