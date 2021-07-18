import org.junit.Assert;
import org.junit.Test;


public class DiceTest {
    @Test
    public void getNumberOfDiceTest(){
        Dice dice =new Dice(0);
        //given
        Integer expected =3;
        dice.setNumberOfDice(expected);

        //then
        Integer actual= dice.getNumberOnDice();
        //when
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tossAndSumTest1(){
        Dice dice =new Dice(0);
        //given
        Integer expected = 0;

        //then
        Integer actual= dice.tossAndSum(expected);
        //when
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void tossAndSumTest2(){
        Dice dice =new Dice(0);
        //given
        Integer expected = 2;

        //then
        Integer numberOfDice=3;
        Integer actual= dice.tossAndSum(numberOfDice);
        //when
        Assert.assertNotEquals(expected, actual);
    }
}
