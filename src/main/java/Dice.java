import java.util.Random;


public class Dice {

    // need a method to roll dice
    // need something to determine how many dice to roll (n)

    private Integer numberOfFaces;
    private Integer currentFaceValue;


    public void roll(){
        Random roll = new Random() ;   //pick a random value between 1 - 6
        int result = roll.nextInt(6);  // random gives a result between 0 and 5
        result += 1 ; // result is now between 1 and 6
    }


}
