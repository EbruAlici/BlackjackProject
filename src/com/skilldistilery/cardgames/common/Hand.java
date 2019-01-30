package com.skilldistilery.cardgames.common;

import java.util.ArrayList;
import java.util.List;


public class Hand {
	private List<Card> cards = new ArrayList<>();

	public Hand() {

	}

	// what is the users hand value
	public Integer getHandValue() {
		int value = 0;
		for (int i = 0; i < cards.size(); i++) {
			value += cards.get(i).getValue();
			
		}
		return value;
				

	}

	// adds more cards to the table/hand
	public void addCard(Card card) {
		cards.add(card);
		
		

	}

	
	public void clearHand() {
		cards = new ArrayList<>();


	}

	
	public List<Card> getCards() {
		return cards;

	}


	@Override
	public String toString() {
		return "[cards=" + cards + "]";
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
