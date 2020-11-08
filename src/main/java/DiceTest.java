import org.junit.Assert;
import org.junit.Test;


public class DiceTest {
    //tests the dice roll methods


    @Test
    public void rollAndSumTest() {
        // given
        Integer numberOfDie = 1;
        Integer numberOfFaces = 6;
        Dice dice = new Dice(numberOfDie, numberOfFaces);

        // when
        Integer sum = dice.rollAndSum();

        // then
        Assert.assertTrue(sum >= dice.getRollMin());
        Assert.assertTrue(sum <= dice.getRollMax());

    }

}
