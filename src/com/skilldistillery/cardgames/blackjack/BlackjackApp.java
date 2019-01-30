package com.skilldistillery.cardgames.blackjack;

import java.util.Scanner;

import com.skilldistilery.cardgames.common.Deck;

public class BlackjackApp {

	public static void main(String[] args) {
		BlackjackApp d = new BlackjackApp();
		d.run();

	}

	private void run() {

		Scanner keyboard = new Scanner(System.in);
		int yesOrNo = 0;
		do {
			System.out.println("Do you want to play a round of Blackjack?");
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
		Dealer dealer = new Dealer();
		Deck gameDeck = new Deck();

		Player player = new Player();
		player.givePlayerTwoCards(gameDeck);

		dealer.giveDealerTwoCard(gameDeck);
		player.runTurn(keyboard, gameDeck, dealer);
		dealer.runTurn(gameDeck);

		System.out.println("The dealers final hand is: " + dealer.getDealerHand());
		System.out.println("Your final hand is " + player.getPlayerHand());
		if (player.getPlayerHand().getHandValue() > 21) {
			System.out.println("You have over 21. You lose. ");

		} else if (dealer.getDealerHand().getHandValue() > 21) {
			System.out.println("The dealer is over 21. You win. ");
		} else if (player.getPlayerHand().getHandValue() == dealer.getDealerHand().getHandValue()) {
			System.out.println("The dealer has 21 points. You lose.");
		} else if (player.getPlayerHand().getHandValue() > dealer.getDealerHand().getHandValue()) {
			System.out.println("You beat the dealer score. ");

		} else {
			System.out.println("Dealer beat your score. ");
		}

	}

}
