package com.skilldistillery.cardgames.blackjack;

import java.util.Scanner;

import com.skilldistilery.cardgames.common.Deck;
import com.skilldistilery.cardgames.common.Hand;

public class Player {

	private Hand playerHand = new Hand();

	public void givePlayerTwoCards(Deck gameDeck) {
		playerHand.addCard(gameDeck.dealCard());
		playerHand.addCard(gameDeck.dealCard());

	}

	public void runTurn(Scanner keyboard, Deck gameDeck, Dealer dealer) {
		int hitOrStay = 0;
		do {
			System.out.println("Your hand is " + playerHand);
			System.out.println("Dealer hand is " + dealer);
			System.out.println("Enter 1 to hit or 2 to stay? ");
			hitOrStay = keyboard.nextInt();
			if (hitOrStay == 1) {
				playerHand.addCard(gameDeck.dealCard());
				if (playerHand.getHandValue() > 21) {
					break;
				}
			}
		} while (hitOrStay == 1);

	}

	public Hand getPlayerHand() {
		return playerHand;
	}

	public void setPlayerHand(Hand playerHand) {
		this.playerHand = playerHand;
	}

}
