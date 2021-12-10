public class RandomObject {

    private int randomUnevenNumber;
    private String randomAnimal;
    private Colourmaker.Colour randomColour;


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
