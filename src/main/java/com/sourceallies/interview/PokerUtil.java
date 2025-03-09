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
        // Poker hands should have knowlege of the highest value/tie break value in each
        // case

        // hands have different ranks, find a way to comapre them
        // may want to do this with a comparable interface

        // if hands have same rank, need to tiebreak
        if (white.getRank() == black.getRank()) {
            // compare high cards
            if (white.getTieBreakCard().compareTo(black.getTieBreakCard()) == 0) {
                //
                System.out.println("Tie game!");
            } else if (white.getTieBreakCard().compareTo(black.getTieBreakCard()) == -1) {
                // white wins
                System.out.println("White wins - " + white.getRank());
            } else {
                // black wins
                System.out.println("Black wins - " + black.getRank() + " ");
            }
        }

        return white;
    }

    // Output Examples
    // Examples:
    // Input: Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH
    // Output: White wins - high card: Ace

    // Input: Black: 2H 4S 4C 3D 4H White: 2S 8S AS QS 3S
    // Output: White wins - flush

    // Input: Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C KH
    // Output: Black wins - high card: 9

    // Input: Black: 2H 3D 5S 9C KD White: 2D 3H 5C 9S KH
    // Output: Tie

}
