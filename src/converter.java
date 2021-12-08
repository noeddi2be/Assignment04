import java.util.Scanner;
import	java.util.Random;



public class converter {


public static void main(String[] args) {

    // Read user input
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a number from 0 to 8 and press ENTER....");
    int userIn = scan.nextInt();

    	while ((userIn < 0) || (userIn > 8))
    	{
    		System.out.println("Please enter a number between 0 to 8 only!");
    		userIn = scan.nextInt();
    	}
 
    System.out.println("You entered: " + userIn);

    // Increment
    userIn++;

    // Array Array List Multidimensional Array


    // Objects Method Overloading This Reference (Setters and Getters)
    // Static Variables / Methods / (Privat Method)
    // Encapsulation

    
    
    // Math Random Wrapper Class Data Conversion
    	// Blackjack-Style
    Random num1 = new Random();
    final int MAX = 18;
    int count = 0;
    int calc1 = 0;
    
    	for (; userIn < MAX && count < 3; count++)
    	{
    		calc1 = num1.nextInt(9)+1;
    		userIn += calc1;
    		
    		System.out.println("Intents: " + (count+1) + "\trandom no: " + calc1 + "\ttotal: " + userIn);	//Test
    
    		if (userIn > MAX)
    		{
    			System.out.println("you went overboard: " + userIn);										//Test - Idee noch ausbauen
    		}
    	}
    	
    	// Roulette-style red black	    
    int black = 0;
    int red = 1;
    userIn = (int) Math.pow(userIn, 4);
    
    	do
    	{
    		userIn = userIn / calc1;
    		System.out.println("do loop userIn: " + userIn + "\trandom no: " + calc1);						//Test
    	}
    	while ((userIn != 0) && (userIn != 1) && (calc1 != 1));												//Idee noch ausbauen
    	
       	System.out.println("final number:" + userIn);  

    //Random num2 = new Random();
	//int calc2 = num2.nextInt(2);
	
       	
       	
       	

	
     // Boolean
       	
               	
    // Conditionals and Loops
        // Break, Continue Statements
        // Switch,

       	
    // Comparing Values
    

    // Enum 





	}
}


