package com.sourceallies.interview;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

}
