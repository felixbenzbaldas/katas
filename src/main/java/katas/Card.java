package katas;

public class Card implements Comparable<Card> {
	private String cardString;
	
	public String getValue() {
		return cardString.substring(1);
	}

	public Card(String cardString) {
		super();
		this.cardString = cardString;
	}

	public int compareTo(Card o) {
		return new CardComparator().compare(this, o);
	}
	
	@Override
	public String toString() {
		return cardString;
	}
}