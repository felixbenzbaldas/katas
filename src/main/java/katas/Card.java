package katas;

public class Card {
	String cardString;
	
	public String getValue() {
		return cardString.substring(1);
	}

	public Card(String cardString) {
		super();
		this.cardString = cardString;
	}
}
