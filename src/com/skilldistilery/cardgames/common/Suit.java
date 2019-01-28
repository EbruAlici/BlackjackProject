package com.skilldistilery.cardgames.common;

public enum Suit {
	HEART("Heart"), 
	SPADES("Spades"), 
	CLUBS("Clubs"), 
	DIAMONDS("Diamonds");

	Suit(String d) {
		 name = d;
	}

	

	final private  String  name;

	@Override
	public String toString() {
		
		return name;

	}

	public String getName() {
		return name;
	}

	public boolean compareTo(Rank rank) {
		// TODO Auto-generated method stub
		return false;
	}

}
