package com.skilldistillery.cardgames.blackjack;

public class BlackJackHand {

	int[] deck = new int[52];

	public void BlackjackHand() {
		
		
	}
	
	
	public int getHandValue() {
		int f = 0;
		for (int i = 0; i < deck.length; i++) {
		}
		if (f == 21 || f > 21) {
			System.out.println("Game Over");
		} else if (f < 21) {
			System.out.println("Hold or Draw");
		}

		return 0;
	}
	
	
	public void addCard() {
		
	}
	public void getCards() {
		
	}
	
}







