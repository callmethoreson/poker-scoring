package com.sourceallies.interview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PokerUtilTest {
    @Test
    void shouldContainHands() {
        PokerHand whiteHand = new PokerHand("2H 3D 5S 9C KD");
        PokerHand blackHand = new PokerHand("2D 3H 5C 9S KH");
        PokerUtil util = new PokerUtil(whiteHand, blackHand);
        assertEquals(whiteHand, util.getWhiteHand());
        assertEquals(blackHand, util.getBlackHand());
    }
}