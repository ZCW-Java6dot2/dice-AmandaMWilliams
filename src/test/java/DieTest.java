import org.junit.Assert;
import org.junit.Test;

public class DieTest {


    @Test
    public void constructorTest() {
        // given
        Integer expectedFaceValue = null;
        Integer expectedNumberOfFaces = 6;
        // when
        Die die = new Die(expectedNumberOfFaces);
        Integer actualFaceValue = die.getCurrentFaceValue();
        Integer actualNumberOfFaces = die.getNumberOfFaceOnDie();
        // then
        Assert.assertEquals(expectedFaceValue, actualFaceValue);
        Assert.assertEquals(expectedNumberOfFaces, actualNumberOfFaces);
    }

    @Test
    public void rollTest() {
        // given
        Integer numberOfFaces = 6;
        Integer unexpected = null;
        Die die = new Die(numberOfFaces);
        // when
        die.roll();
        Integer actual = die.getCurrentFaceValue();
        // then
        Assert.assertNotEquals(unexpected, actual);
    }
}
