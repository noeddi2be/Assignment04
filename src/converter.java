import java.util.Scanner;
import java.lang.reflect.Array;
import	java.util.Random;



public class converter {


public static void main(String[] args) {

    // Read user input
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a number from 0 to 8 and press ENTER....");
    int userIn = scan.nextInt();

    	while ((userIn < 0) || (userIn > 8)) {

    		System.out.println("Please enter a number between 0 to 8 only!");
    		userIn = scan.nextInt();
    	}
 
    scan.close();


    // Increment
    userIn++;

    // Blackjack-Style //Random 
    Random num1 = new Random();
    final int MAX = 18;
    int count = 0;
    int calc1 = 0;
   
    for (; userIn < MAX && count < 3; count++) {

        calc1 = num1.nextInt(9)+1;
        userIn += calc1;
    } 

    // Roulette-style red black	    

    userIn = (int) Math.pow(userIn, 2);
    
    
    while (userIn % 2 == 0) {
        userIn = userIn / 2;   
    }

    
   
    // Objects Method Overloading This Reference (Setters and Getters)
    // Static Variables / Methods / (Privat Method)
    // Encapsulation

    
    
    // Math Random Wrapper Class Data Conversion


    
    	
    
    
    // Array Array List Multidimensional Array
    String[] mySpecialAnimal =  new String[5];
    mySpecialAnimal[0] = "Bird";
    mySpecialAnimal[1] = "Camel";
    mySpecialAnimal[2] = "Bear";
    mySpecialAnimal[3] = "Frog";
    mySpecialAnimal[4] = "Lion";

    userIn = userIn % 5;
    

    String myAnimal = mySpecialAnimal[userIn];

    System.out.println(myAnimal);

	
    // Boolean


       	
               	
        // Break, Continue Statements
        // Switch,

       	
    






	}
}


