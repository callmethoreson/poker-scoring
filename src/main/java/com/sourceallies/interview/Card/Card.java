package com.sourceallies.interview.Card;

public class Card implements Comparable<Card> {
    private final CardValue value;
    private final Suit suit;

    public Card(String cardString) {
        this.value = CardValue.init(cardString.charAt(0));
        this.suit = Suit.init(cardString.charAt(1));
    }

    @Override
    public int compareTo(Card otherCard) {
        if (this.value.getInt() == otherCard.value.getInt()) {
            return 0;
        } else if (this.value.getInt() < otherCard.value.getInt()) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Card)) {
            return false;
        }

        Card c = (Card) o;

        if (this.compareTo(c) == 0) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return Character.toString(this.value.getChar()) + Character.toString(this.suit.getChar());
    }

    public Suit getSuit() {
        return this.suit;
    }

    public CardValue getValue() {
        return this.value;
    }

}