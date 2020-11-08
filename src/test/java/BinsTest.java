import org.junit.Assert;
import org.junit.Test;

public class BinsTest {
    //tests the Bins functionality
    @Test
    public void binsConstructorTest() {
        //given
        Integer minimumDieFaceValue = 2;
        Integer maximumDieFaceValue = 12;

        //when
        Bins bins = new Bins(minimumDieFaceValue, maximumDieFaceValue);

        //then
        for (Integer expectedFaceValue = minimumDieFaceValue; expectedFaceValue < maximumDieFaceValue; expectedFaceValue++) {
            Bin bin = bins.getBin(expectedFaceValue);   //getBin method test
            Integer actualFaceValue = bin.getDiceSumHeld();
            Assert.assertEquals(expectedFaceValue, actualFaceValue);

        }
    }
    @Test
    public void incrementBinTest(){
        //given
        Integer minimumDieFaceValue = 2;
        Integer maximumDieFaceValue = 12;
        Bins bins = new Bins(minimumDieFaceValue, maximumDieFaceValue);
        Bin binToIncrement = bins.getBin(8);
        int numberOfOccurrences = binToIncrement.getNumberOfOccurrences();
        int expected = numberOfOccurrences +1;
        int binDiceSumHeld = binToIncrement.getDiceSumHeld();
        Assert.assertEquals(8, binDiceSumHeld);
        Assert.assertEquals(0, numberOfOccurrences);

        //when
        binToIncrement.increment();
        int actual = binToIncrement.getNumberOfOccurrences();

        //then
        Assert.assertEquals(expected, actual);
    }
}
