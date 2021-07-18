public class Dice {
    private int numberOfDice;

    public Dice(int numberOfDice){}

    public Integer getNumberOnDice() {
        return numberOfDice;
    }

    public void setNumberOfDice(int numberOfDice){
        this.numberOfDice=numberOfDice;
    }

    public int tossAndSum(int numberOfDice){
        int sum = 0;
        for (int i=0; i < numberOfDice; i++) {
            sum += (int) (Math.random() * 6) + 1;
        }
        return sum;
    }

    }

