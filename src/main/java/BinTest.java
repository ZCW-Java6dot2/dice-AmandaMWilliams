import org.junit.Assert;
import org.junit.Test;

public class BinTest {

    @Test
    public void binConstructorTest() {
        //Given
        Integer diceSumHeld = 4;
        Integer expected = diceSumHeld;

        //When
        Bin bin = new Bin(diceSumHeld);
        Integer actual = bin.getDiceSumHeld();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDiceSumHeldTest() {
        //Given
        //When
        //Then
    }

    @Test
    public void numberOfOccurrencesTest() {
        //Given
        //When
        //Then
    }

    @Test
    public void incrementTest() {
        //Given

        //When
        //Then
    }

}
