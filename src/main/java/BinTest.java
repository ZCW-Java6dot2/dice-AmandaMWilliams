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
    public void incrementTest() {
        //Given
        Bin bin = new Bin(7);
        Integer expected = 1;


        //When
        bin.increment();
        Integer actual = bin.getNumberOfOccurrences();


        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void incrementTest2() {
        //Given
        Bin bin = new Bin(7);
        Integer expected = 2;


        //When
        bin.increment();
        bin.increment();
        Integer actual = bin.getNumberOfOccurrences();


        //Then
        Assert.assertEquals(expected, actual);
    }

}
