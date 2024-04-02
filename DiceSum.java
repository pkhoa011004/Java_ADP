package jdice;

public class DiceSum extends DieRoll {// change Dice-Sum to DiceSum
    private DieRoll r1;// change DieRollr1 to DieRoll r1
    private DieRoll r2;//delete comment
    public DiceSum(DieRoll r1,
		   DieRoll r2) {
	super(0,0,0);
	this.r1=r1; //add ";"
	this.r2=r2;
    }
    public RollResult makeRoll() {
	return r1.makeRoll().andThen(r2.makeRoll());
    }
    public String toString() {
	return r1.toString() + " & "+r2.toString();// add "." in r1.toString()
    }

}

