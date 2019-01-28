package com.skilldistillery.cardgames.blackjack;

import java.util.List;
import java.util.Scanner;

import com.skilldistilery.cardgames.common.Card;
import com.skilldistilery.cardgames.common.Deck;
import com.skilldistilery.cardgames.common.Hand;

public class BlackjackApp {

	public static void main(String[] args) {
		BlackjackApp d = new BlackjackApp();
		d.run();

	}

	private void run() {

		Scanner keyboard = new Scanner(System.in);
		int yesOrNo = 0;
		do {
			System.out.println("Do you want to play a roung of Blackjack?");
			System.out.println("Enter 1 to play or 2 to exit");
			yesOrNo = keyboard.nextInt();
			if (yesOrNo == 1) {
				System.out.println("Lets Play");
				runTurn(keyboard);
			} else {
				System.out.println("Good Bye");
			}

		} while (yesOrNo == 1);

	}

	public void runTurn(Scanner keyboard) {

		Hand dealerHand = new Hand();
		Hand playerHand = new Hand();
		Deck gameDeck = new Deck();
		int hitOrStay;

		dealerHand.addCard(gameDeck.dealCard());
		dealerHand.addCard(gameDeck.dealCard());
		playerHand.addCard(gameDeck.dealCard());
		playerHand.addCard(gameDeck.dealCard());

		do {
			System.out.println("your hand " + playerHand);
			System.out.println("dealer hand " + dealerHand);
			System.out.println("Enter 1 to hit or 2 to stay? ");
			hitOrStay = keyboard.nextInt();
			if (hitOrStay == 1) {
				playerHand.addCard(gameDeck.dealCard());
				if (playerHand.getHandValue() > 21) {
					break;
				}
			}
		} while (hitOrStay == 1);

		while (dealerHand.getHandValue() <= 17) {
			dealerHand.addCard(gameDeck.dealCard());
			if (dealerHand.getHandValue() > 21) {
				break;
			}

		}
		if (playerHand.getHandValue() > 21) {
			System.out.println("You lose ");

		} else if (dealerHand.getHandValue() > 21) {
			System.out.println("You win ");
		} else if (playerHand.getHandValue() == dealerHand.getHandValue()) {
			System.out.println("Player loses");
		}else if(playerHand.getHandValue() > dealerHand.getHandValue()) {
			System.out.println("Player wins");
			
		}else {
			System.out.println("Dealer wins");
		}
		
	}

}