package katas;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Hand {
	private Set<String> cards = new HashSet<String>();

	public Hand(Collection<String> cards) {
		if (cards.size() > 2) {
			throw new IllegalArgumentException();
		}
		cards.addAll(cards);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cards == null) ? 0 : cards.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hand other = (Hand) obj;
		if (cards == null) {
			if (other.cards != null)
				return false;
		} else if (!cards.equals(other.cards))
			return false;
		return true;
	}
	
}