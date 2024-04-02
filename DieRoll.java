package jdice;

import java.util.Random;

public class DieRoll {
    private int ndice;
    private int nsides;// delete comment
    private int bonus;
    private static Random rnd;
    static{
	rnd=new Random();
    }
    public DieRoll(int ndice,
		   int nsides,
		   int bonus) {
	this.ndice=ndice;
	this.nsides=nsides;
	this.bonus=bonus;
    }
    public RollResult makeRoll() {// change make Roll() to makeRoll()
	RollResult r=new RollResult(bonus);
	for(int i=0;i<ndice;i++) {
	    int roll=rnd.nextInt(nsides)+1;
	    r.addResult(roll); //change "," to "."
	}
	return r;// change returnr; to return r;
    }
    public String toString() {
	String ans =ndice+"d"+nsides;
	if(bonus>0) {
	    ans= ans+"+"+bonus;
	}
	else if(bonus<0) {
	    ans=ans+bonus;
	}
	return ans; //add ";"
    }

}


