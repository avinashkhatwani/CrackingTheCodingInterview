package weekSevelObjectOrientedDesign;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import weekSevelObjectOrientedDesign.Q1Card.Suit;

public class Q1Card {
	public enum Suit{
		CLUBS(1),
		SPADES(2),
		HEARTS(3),
		DIAMONDS(4);
	
		int value;
		Suit(int val){
			value = val;
		}
	}

	private int faceValue;
	private Suit suit;
	
	Q1Card(int c, Suit s){
		faceValue = c;
		suit = s;
	}
	
	int getFaceValue() {
		return faceValue;
	}
	
	Suit getSuit() {
		return suit;
	}
	
	public void printCard(Q1Card card) {
		System.out.println(card.faceValue+" "+card.suit);
	}
	
	
	public static void main(String[] args) {
		Deck deck = new Deck(52);
		deck.initializeDeck();
		Q1Player player1 = new Q1Player(0, 4);
		player1.addCard(deck.dealCard());
		player1.addCard(deck.dealCard());
		player1.addCard(deck.dealCard());
		player1.addCard(deck.dealCard());
		player1.addCard(deck.dealCard());
		
		player1.showHand();
		deck.print();
	}

}


class Deck{

	private int size;
	private List<Q1Card> cardList;
	Deck(int deckSize) {
		size = deckSize;
		cardList = new ArrayList<>();
	}
	
	void initializeDeck() {
		for(int i=0; i<this.size; i++) {
			Suit curSuit = null;
			for(Suit s : Suit.values()) {
				if(s.value == (i%3)+1)
					curSuit = s;
			}
			Q1Card card = new Q1Card(((i%13)+1), curSuit);
			cardList.add(card);
		}
//		print();
	}
	
	void print() {
		for(Q1Card card : cardList) {
			System.out.println(card.getFaceValue()+" "+card.getSuit());
		}
	}
	
	Q1Card dealCard() {
		if(cardList.size()<1)
			throw new IllegalArgumentException("Empty ");
		
		int idx = new Random().nextInt(cardList.size());
		Q1Card card = cardList.get(idx);
		cardList.remove(idx);
		return card;
	}
	
	public void shuffleDeck() {
		Collections.shuffle(cardList);
	}
	
}
