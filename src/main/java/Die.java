import java.util.Random;

public class Die {

    private final Integer numberOfFaceOnDie;
    private Integer currentFaceValue;

    //Constructor
    public Die(Integer numberOfFaceOnDie) {
        this.numberOfFaceOnDie = numberOfFaceOnDie;
        this.currentFaceValue = null;
    }

    public Integer getNumberOfFaceOnDie() {
        return numberOfFaceOnDie;
    }

    public Integer getCurrentFaceValue() {
        return currentFaceValue;
    }

    public void roll(){
        Random roll = new Random() ;   //pick a random value between 1 - 6
        int result = roll.nextInt(numberOfFaceOnDie);  // random gives a result between 0 and 5
        result += 1 ; // result is now between 1 and 6
        this.currentFaceValue = result;
    }

}
