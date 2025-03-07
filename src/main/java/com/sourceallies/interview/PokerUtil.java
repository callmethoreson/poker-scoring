package com.sourceallies.interview;

public class PokerUtil {
    private final PokerHand whiteHand;
    private final PokerHand blackHand;

    PokerUtil(PokerHand white, PokerHand black) {
        this.whiteHand = white;
        this.blackHand = black;
    }

    public PokerHand getWhiteHand() {
        return this.whiteHand;
    }

    public PokerHand getBlackHand() {
        return this.blackHand;
    }

    static public PokerHand compareHands(PokerHand white, PokerHand black) {
        // what is required to compare hands?

        // cards are compared based on two things
        // 1. Rank
        // 2. HighCard of a given rank
        // ex. if two of a kind, the highest value of the pair wins
        // ex. if full house, broken by highest 3 of a kind

        // Observation
        // Cards should have knowlege of the highest value/tie break value in each case

        return white;
    }

}
