
/**
 * Write a description of class RenameThisClass here.
 *
 * @Yasin McCaskill
 * @version (a version number or a date)
 */
public class Dice

{
    Die6 die1;
    Die6 die2;

    public Dice() {
        die1 = new Die6();
        die2 = new Die6();
    }

    public int getValue() {
        return die1.getValue() + die2.getValue();
    }

    public void roll() {
        die1.roll();
        die2.roll();
    }

    public int rollAndGetValue() {
        this.roll();
        return getValue();
    }
    
}