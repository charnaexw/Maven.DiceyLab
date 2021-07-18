public class Simulation {
    int numberOfDice;
    int numberOfTosses;

    public Simulation (int numberOfTosses, int numberOfDice){
        this.numberOfTosses=numberOfTosses;
        this.numberOfDice=numberOfDice;
    }
    public Integer[] runSimulation(){
        Dice dice = new Dice(numberOfDice);
        Bins bins = new Bins(numberOfDice, numberOfDice*6);
        for(int i =0; i<numberOfTosses; i++){
            int diceRoll=dice.tossAndSum(numberOfDice);
            bins.incrementBin(diceRoll);
        }
        return bins.diceRolls;
    }
    public void printSimulation(){
        Integer[] diceRolls = runSimulation();
        StringBuilder builder = new StringBuilder();
        System.out.printf("***\nSimulation of %s dice tossed for %s times.\n***\n\n", numberOfDice, numberOfTosses);
        for (int i = 0; i < diceRolls.length; i++) {
            for (int j = 0; j < (diceRolls[i] / numberOfTosses) * 100; i++) {
                builder.append("*");
            }
            System.out.printf("%s :   %s:  %.2f  %s\n", i + numberOfDice, diceRolls[i], (double)diceRolls[i] / numberOfTosses, builder.toString());
            builder.delete(0, builder.length());
        }
    }

    public static void main(String[] args) {
        Simulation simulation = new Simulation(1000000, 2);
        simulation.printSimulation();

    }


}
