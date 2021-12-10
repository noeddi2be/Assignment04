import java.util.Random;

public class Colourmaker {

	public enum Colour {
		BLUE, YELLOW, RED, LILA, GREEN, ORANGE
	}
	

	//sets Colours
	public static Colour chooseColour() {
		Random ran = new Random();
		int set = ran.nextInt(6)+1;
		Colour colour1 = Colour.BLUE;
		Colour colour2 = Colour.YELLOW;
		Colour colour3 = Colour.RED;
		Colour colour4 = Colour.LILA;
		Colour colour5 = Colour.GREEN;
		Colour colour6 = Colour.ORANGE;
		Colour finColour;

		if (set == 1) {
			finColour = colour1;
		} else if (set == 2) {
			finColour = colour2;
		} else if (set == 3) {
			finColour = colour3;
		} else if (set == 4) {
			finColour = colour4;
		} else if (set == 5) {
			finColour = colour5;
		} else {
			finColour = colour6;
		}

		return finColour;
	}	
}