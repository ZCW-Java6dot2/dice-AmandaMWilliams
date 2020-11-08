
public class Bins {
    private final Bin[] bins;
    //need a method to track dice roll values (minumum: 2, maximum: however many dice rolled *6)
    private Integer binToBeAddedTo;

    // Bins Constructor
    public Bins(Integer minimumDieFaceValue, Integer maximumDieFaceValue) {
        Integer numberOfBins = maximumDieFaceValue - minimumDieFaceValue;
        this.bins = new Bin[numberOfBins];
        for (int i = 0; i < bins.length; i++) {
            Integer currentValue = minimumDieFaceValue + i;
            bins[i] = new Bin(currentValue);
        }
    }

    public void incrementBin(Integer binToBeAddedTo) {
        this.getBin(binToBeAddedTo).increment();
    }

    public Bin getBin(Integer binNumber) {
        for (int i = 0; i < bins.length; i++) {
            Bin bin = bins[i];
            Integer currentBinNumber = bin.getDiceSumHeld();
            if (currentBinNumber == binNumber) {
                return bin;
            }
        }
        return null;
    }

    public Bin[] getCompositeBinArray() {
        return this.bins;
    }
}
