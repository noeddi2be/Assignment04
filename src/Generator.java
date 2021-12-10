import java.util.Scanner;
import	java.util.Random;

public class Generator {



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

   // Random 
    Random num1 = new Random();
    final int MAX = 18;
    int count = 0;
    int calc1 = 0;
   
    for (; userIn < MAX && count < 3; count++) {

        calc1 = num1.nextInt(9)+1;
        userIn += calc1;
    } 

    // Even number    

    userIn = (int) Math.pow(userIn, 2);
    
    
    while (userIn % 2 == 0) {
        userIn = userIn / 2;   
    }

    
    // Array Array List Multidimensional Array
    String[] mySpecialAnimal =  new String[5];
    mySpecialAnimal[0] = "Bird";
    mySpecialAnimal[1] = "Camel";
    mySpecialAnimal[2] = "Bear";
    mySpecialAnimal[3] = "Frog";
    mySpecialAnimal[4] = "Lion";
    userIn = userIn % 5;
    
    String myAnimal = mySpecialAnimal[userIn];

    // Derive colour from a Static Method
    Colourmaker.Colour createColour = Colourmaker.chooseColour();

    // Create an Object
    RandomObject myObject = new RandomObject();
    myObject.setRandomUnevenNumber(userIn);  
    myObject.setRandomColour(createColour);
    myObject.setRandomAnimal(myAnimal);
    

    System.out.println("My random object has the number: " + myObject.getRandomEvenNumber());
    System.out.println("My random object comes in the form of a: " + myObject.getRandomAnimal());
    System.out.println("My random object has the colour: " + myObject.getRandomColour());
    Scanner scan2 = new Scanner(System.in);
    System.out.println("Do you like the colour of the object? (Enter 'yes' or 'no'");
    String answer = scan2.nextLine();
    switch (answer) {
        case "yes":
            System.out.println("Good for you");
            break;
        case "no":
            System.out.println("Your new colour is: " /* + myObject.getRandomColour().shuffle()*/);
            break;
        default:
            System.out.println("Please enter a valid answer!");
        }

    scan2.close();

    }
}



