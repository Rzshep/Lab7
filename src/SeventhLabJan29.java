import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SeventhLabJan29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		String yesOrNo = "yes";
		
		System.out.println("Welcome to our Java class.");
		
		while (yesOrNo.equalsIgnoreCase("yes")) { // loop runs when yesOrNo.equalsIgnoreCase("yes")
			
			try { 
				System.out.println("Which student would you like to learn about? (Enter a number 1-10): ");
				int userNum = scan.nextInt();
				scan.nextLine();
				
				
				if (userNum > 10 || userNum < 1) {
					System.out.println("Invalid entry");
					continue;
				}
			}
		
		
			catch (InputMismatchException e) { // child exception must always be listed before the parent
				
				System.out.println("Please enter a valid integer!");
				scan.nextLine();
				continue; // this will take you back to the top of the while loop
				
			} 
			
			int[] studID = {314, 123, 876, 555, 854, 904, 315, 653, 878, 611};
		   	 String[] name = {"Johnny Williams", "Jane Thomas", "Alex Warren", "Scott Ocean", "Jeremiah Quinn", "Stella Banks", "Bob Smith", "Tommy Lawrence", "Katie Evans", "Morris Andrews" };
		   	 String[] major = {"Chem", "Psych", "Math", "Eng", "Bio", "Bio", "Eng", "Chem", "Math", "Eng", };
		   	 int[] level = {3, 1, 2, 2, 4, 3, 1, 3, 3, 3};
		    
		   	for ( int i = 0; i < studID.length; i++ ) 
		   	{
		   		 System.out.println();
		   	    System.out.print( studID[i] + "\t");  
		   	    System.out.println();
		   	    System.out.print( name[i] + "\t");  
		   	    System.out.println();
		   	    System.out.print( major[i] + "\t");
		   	    System.out.println();
		   	    System.out.print( level[i] );
		   	    System.out.println();
		  	 }
		  
		System.out.println("Would you like to learn about another student? (Enter yes or no): ");
			yesOrNo = scan.nextLine();
			
			
			
		} 
		System.out.println("Goodbye!");
		scan.close();
	}
}
		
		
		
			

	

			
	
			
		
		
			
			

	
	
		 


