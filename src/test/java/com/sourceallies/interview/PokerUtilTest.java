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

    // @Test
    // void shouldReturnWhite_HighCardTieBreak() {
    // // white has straight, black has high card
    // PokerHand whiteHand = new PokerHand("2H 3D 4S 5C KD");
    // PokerHand blackHand = new PokerHand("2D 3H 5C 9S QH");
    // assertEquals(whiteHand, PokerUtil.compareHands(whiteHand, blackHand));
    // }

    // @Test
    // void shouldReturnTie_HighCard() {
    // // white has straight, black has high card
    // PokerHand whiteHand = new PokerHand("2H 3D 4S 5C KD");
    // PokerHand blackHand = new PokerHand("2D 3H 5C 9S QH");
    // assertEquals(null, PokerUtil.compareHands(whiteHand, blackHand));
    // }

    // @Test
    // void shouldReturnWhite_StraightVsHighCard() {
    // // white has straight, black has high card
    // PokerHand whiteHand = new PokerHand("2H 3D 4S 5C 6D");
    // PokerHand blackHand = new PokerHand("2D 3H 5C 9S KH");
    // assertEquals(whiteHand, PokerUtil.compareHands(whiteHand, blackHand));
    // }

    // @Test
    // void shouldReturnBlack() {
    // // white has high card, black wins with full house
    // PokerHand whiteHand = new PokerHand("2S 3D 5S 9C KD");
    // PokerHand blackHand = new PokerHand("2D 2H 2C 9S 9H");
    // assertEquals(blackHand, PokerUtil.compareHands(whiteHand, blackHand));
    // }
}