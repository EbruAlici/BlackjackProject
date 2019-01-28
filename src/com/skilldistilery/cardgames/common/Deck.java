package com.skilldistilery.cardgames.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards;

	public Deck() {
		cards = createDeck();
	}

	public List<Card> createDeck() {
		List<Card> deckOfCards = new ArrayList<>(52);
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deckOfCards.add(new Card(rank, suit));

			}

		}
		Collections.shuffle(deckOfCards);
		return deckOfCards;
	}

	// returns the number of cards still in the deck.
	public Integer checkDeckSize(Integer checkSize) {
		return cards.size();

	}


	// removes a Card from the deck
	public Card dealCard() {
		if (cards.size() < 15) {
			List<Card> deckOfCards = createDeck();
			Collections.shuffle(deckOfCards);
			cards.addAll(deckOfCards);

		}
		return cards.remove(0);
	}

}
