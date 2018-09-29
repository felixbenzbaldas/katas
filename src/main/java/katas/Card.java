package katas;

public class Card implements Comparable<Card> {
	String cardString;
	
	public String getValue() {
		return cardString.substring(1);
	}

	public Card(String cardString) {
		super();
		this.cardString = cardString;
	}

	public int compareTo(Card o) {
		return new CardComparator().compare(this.cardString, o.cardString);
	}
}
