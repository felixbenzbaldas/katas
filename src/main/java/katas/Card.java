package katas;

public class Card implements Comparable<Card> {
	
	private String cardString;
	
	public Card(String cardString) {
		super();
		this.cardString = cardString;
	}
	
	public String getValue() {
		return cardString.substring(1);
	}


	public int compareTo(Card o) {
		return new CardValueComparator().compare(this, o);
	}
	
	@Override
	public String toString() {
		return cardString;
	}
}