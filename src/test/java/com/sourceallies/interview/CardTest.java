package com.sourceallies.interview;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.sourceallies.interview.Card.*;

public class CardTest {
    @Test
    void initializeAceOfSpades() {
        var card = new Card("AS");
        assertEquals(CardValue.ACE, card.getValue());
        assertEquals(Suit.SPADES, card.getSuit());
    }

    @Test
    void initializeQueenOfHearts() {
        var card = new Card("QH");
        assertEquals(CardValue.QUEEN, card.getValue());
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    void checkComparableInterface() {
        var card1 = new Card("QH");
        var card2 = new Card("AS");
        var card3 = new Card("AH");

        // check int values
        assertEquals(CardValue.QUEEN.getInt(), card1.getValue().getInt());
        assertEquals(CardValue.ACE.getInt(), card2.getValue().getInt());

        // check comparison of card values
        assertFalse(card1.equals(card2));

        // check compare to
        assertEquals(-1, card1.compareTo(card2));
        assertEquals(-1, card1.compareTo(card2));
        assertEquals(0, card2.compareTo(card3));

        assertTrue(card2.equals(card3));
        assertFalse(card1.equals(card2));
        assertFalse(card1.equals(card3));
    }

}
