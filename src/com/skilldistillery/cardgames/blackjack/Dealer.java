package com.skilldistillery.cardgames.blackjack;

import com.skilldistilery.cardgames.common.Deck;
import com.skilldistilery.cardgames.common.Hand;

public class Dealer {

	@Override
	public String toString() {
		String faceUpCard = " [ **** ], "; 
		for (int i = 1; i < dealerHand.getCards().size(); i++) {
			faceUpCard += dealerHand.getCards().get(i);
		}
		return "Dealer [dealerHand= " + faceUpCard + "]";
	}

	private Hand dealerHand = new Hand();
	
public void giveDealerTwoCard(Deck gameDeck) {
	
	dealerHand.addCard(gameDeck.dealCard());
	dealerHand.addCard(gameDeck.dealCard());
}
	
	public void runTurn(Deck gameDeck) {


		while (dealerHand.getHandValue() <= 17) {
			dealerHand.addCard(gameDeck.dealCard());
			if (dealerHand.getHandValue() > 21) {
				break;
			}
		}
	}
	
	
	
	
	public Hand getDealerHand() {
		return dealerHand;
	}

	public void setDealerHand(Hand dealerHand) {
		this.dealerHand = dealerHand;
	}

}
