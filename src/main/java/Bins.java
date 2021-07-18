import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bins {

    private int startingBin;
    private int endingBin;
    Integer[] diceRolls;

    public Bins(int startingBin, int endingBin) {
        this.startingBin = startingBin;
        this.endingBin = endingBin;
        diceRolls = new Integer[endingBin - (startingBin - 1)];
        Arrays.fill(diceRolls, 0);
    }

    public int getBin(int binNumber) {

        return diceRolls[binNumber - startingBin];
    }

    public void incrementBin(int binNumber) {
        diceRolls[binNumber - startingBin]++;
    }

    public int getStartingBin() {
        return startingBin;
    }

    public void setStartingBin(int startingBin) {
        this.startingBin = startingBin;
    }

    public int getEndingBin() {
        return endingBin;
    }

    public void setEndingBin(int endingBin) {
        this.endingBin = endingBin;
    }
}