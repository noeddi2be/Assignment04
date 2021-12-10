import java.util.Random;


public class RandomObject implements ColourShuffle {

    private int randomUnevenNumber;
    private String randomAnimal;
    private Colourmaker.Colour randomColour;
    private Colourmaker.Colour newColour;

    // implementation from interface
    public void shuffle() {
		Random ran2 = new Random();
		int set = ran2.nextInt(6)+1;
		Colourmaker.Colour colour1 = Colourmaker.Colour.BLUE;
		Colourmaker.Colour colour2 = Colourmaker.Colour.YELLOW;
		Colourmaker.Colour colour3 = Colourmaker.Colour.RED;
		Colourmaker.Colour colour4 = Colourmaker.Colour.LILA;
		Colourmaker.Colour colour5 = Colourmaker.Colour.GREEN;
		Colourmaker.Colour colour6 = Colourmaker.Colour.ORANGE;
		Colourmaker.Colour finColour;

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

		this.newColour = finColour;
    }

    public Colourmaker.Colour getnewColour() {
        return newColour;
    }

    public void setRandomUnevenNumber(int number) {
        this.randomUnevenNumber = number;
    }
    
    public void setRandomAnimal(String animal) {
        this.randomAnimal = animal;
    }
    

    public void setRandomColour(Colourmaker.Colour colour) {
        this.randomColour = colour;
    }

    public int getRandomEvenNumber() {
        return randomUnevenNumber;
    }

    public String getRandomAnimal() {
        return randomAnimal;
    }

    public Colourmaker.Colour getRandomColour() {
        return randomColour;
    }
}
