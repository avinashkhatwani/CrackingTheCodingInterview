package weekSevelObjectOrientedDesign;

import java.util.ArrayList;

public class Q1Player {
	int id;
	int maxCards;
	ArrayList<Q1Card> playerCards;

	public Q1Player(int id, int max) {
		this.id = id;
		maxCards = max;
		playerCards = new ArrayList<>();
	}
	
	public int getId() {
		return id;
	}
	
	public void addCard(Q1Card card) {
		if(playerCards.size()>maxCards) {
			System.out.println("Max reached");
			return;
		}
		playerCards.add(card);
	}
	
	public void showHand() {
		System.out.println("The Cards for player "+id+" are ");
		for(Q1Card card : playerCards) {
			card.printCard(card);
		}
		System.out.println();
	}
	
	public int getPlayerHandsValue() {
		int score = 0;
		for(Q1Card card : playerCards) {
			score+=card.getFaceValue();
		}
		return score;
	}
	
	
}
