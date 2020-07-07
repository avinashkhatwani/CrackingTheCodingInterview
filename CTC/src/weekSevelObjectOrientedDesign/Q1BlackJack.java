package weekSevelObjectOrientedDesign;

public class Q1BlackJack extends Q1Card{

	Q1BlackJack(int c, Suit s) {
		super(c, s);
	}
	
	int getFaceValue() {
		int val = super.getFaceValue();
		if(val == 1)
			return 11;
		if(val<10)
			return val;
		return 10;
	}
	
	boolean isAce() {
		return super.getFaceValue() == 11;
	}
	


}
