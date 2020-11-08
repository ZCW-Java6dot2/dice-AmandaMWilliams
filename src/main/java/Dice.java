import java.util.Random;


public class Dice {

    private final Die[] dice;

    public Dice(Integer numberOfDie) {    //number of die-objects to be contained (calls line 12)
        this(numberOfDie, 6);
    }

    public Dice(Integer numberOfDie, Integer numberOfFaces) {
        this.dice = new Die[numberOfDie]; // create new array
        // populate array with new die objects
        for (int currentIndex = 0; currentIndex < dice.length; currentIndex++) {// for every index
            Die die = new Die(numberOfFaces);// create a new die
            dice[currentIndex] = die; // place the die into the array
        }
    }

    public Integer getRollMin() {
        Integer numberOfDie = dice.length;
        Integer minimumValueToBeRolled = numberOfDie *1;
        return minimumValueToBeRolled;
    }

    public Integer getRollMax() {
        Die oneOfTheDie = dice[0]; // look at one of the die
        Integer numberOfFaces = oneOfTheDie.getNumberOfFaceOnDie(); // count number of faces
        Integer numberOfDie = dice.length; // count number of die
        Integer maximumValueToBeRolled = numberOfFaces * numberOfDie;
        return maximumValueToBeRolled;
    }
    public Integer rollAndSum() {
        Integer total = 0;
        // for each of the die in the array
        for (int currentIndex = 0; currentIndex < dice.length; currentIndex++) { // for every index
            Die currentElement = dice[currentIndex]; // get current element
            currentElement.roll(); // roll die
            int theValueRolled = currentElement.getCurrentFaceValue(); // look at face of die
            total += theValueRolled; // add based on the value rolled
        }
        return total;
    }

}
