public class Simulation {
    private Integer numberOfDie;
    private Integer numberOfTosses;
    private Bins bins;

    public Simulation(Integer numberOfDie, Integer numberOfTosses) {
        this.numberOfDie = numberOfDie;
        this.numberOfTosses = numberOfTosses;
    }

    public void run(){
        Dice dice = new Dice(numberOfDie);
        this.bins = new Bins(dice.getRollMin(), dice.getRollMax());
        for (int i = 0; i<= numberOfTosses; i++){
            int sum = dice.rollAndSum();  //sum is equal to the bin number
            bins.incrementBin(sum);
        }
    }

    public double getPercentageOfOccurrences(Integer binNumber){
        Bin bin = bins.getBin(binNumber);
        Integer numberOfOccurrences = bin.getNumberOfOccurrences();
        double ratio = numberOfOccurrences.doubleValue() / numberOfTosses;
        double percentage = ratio * 100;
        return percentage;
    }
}
