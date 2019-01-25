package com.skilldistilery.cardgames.common;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.skilldistillery.enums.solutions.cards.Card;
import com.skilldistillery.enums.solutions.cards.Rank;
import com.skilldistillery.enums.solutions.cards.Suit;


public class Deck {
	private static final int ArrayList = 0;
	private List<Card> cards;

	public Deck() {
		cards = createDeck();
	}

	private	List<Card> createDeck() {
		List<Card> deckOfCards = new ArrayList<>(52);
		for(Suit suit : Suit.values()) {
		      for(Rank rank : Rank.values()) {
		       // deckOfCards.add(new Card(rank,suit));
		      }
		    }
		return deckOfCards;
	}
	
	public int checkDeckSize(){
		return cards.size();
		
	}
	public void shuffle() {
	    Collections.shuffle(cards);
	  }
	  
	  public Card dealCard() {
	    return cards.remove(0);
	  }


	public static int getArraylist() {
		return ArrayList;
	}

}
