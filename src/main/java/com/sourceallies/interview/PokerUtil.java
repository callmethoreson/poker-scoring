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
        return white;
    }

}
