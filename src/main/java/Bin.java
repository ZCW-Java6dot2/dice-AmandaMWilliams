public class Bin {
    //Fields
    private Integer diceSumHeld;
    private Integer numberOfOccurrences;

    //Constructor
    public Bin(Integer diceSumHeld){
        this.diceSumHeld = diceSumHeld;
        this.numberOfOccurrences = 0;
    }

    //Getters
    public Integer getDiceSumHeld() {
        return diceSumHeld;
    }
    public Integer getNumberOfOccurrences(){
        return numberOfOccurrences;
    }

    //Mutator
    public void increment(){
        numberOfOccurrences++;
    }
}

