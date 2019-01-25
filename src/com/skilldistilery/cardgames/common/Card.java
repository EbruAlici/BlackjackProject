package com.skilldistilery.cardgames.common;

public class Card {
	private Rank rank;
	private Suit suit;

	private void Suit(Rank rank, Suit suit) {
		this.rank = rank;
		this.setSuit(suit);

	}
	

	private int getValue() {
		return rank.getValue();

	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	@Override
	  public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ((rank == null) ? 0 : rank.hashCode());
	    result = prime * result + ((suit == null) ? 0 : suit.hashCode());
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
	    Card other = (Card) obj;
	    if (rank != other.rank)
	      return false;
	    if (suit != other.suit)
	      return false;
	    return true;
	  }
	 @Override
	  public String toString() {
	    StringBuilder builder = new StringBuilder();
	    builder.append(rank);
	    builder.append(" of ");
	    builder.append(suit);
	    return builder.toString();
	  }
}
