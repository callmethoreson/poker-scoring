package com.sourceallies.interview;

public enum PokerRank {
    HIGHCARD(0),
    PAIR(1),
    TWOPAIRS(2),
    THREEOFAKIND(3),
    FLUSH(4),
    STRAIGHT(5),
    FULLHOUSE(6),
    FOUROFAKIND(7),
    STRAIGHTFLUSH(8);

    private final int rank;

    PokerRank(int rank) {
        this.rank = rank;
    }

    public int getInt() {
        return rank;
    }

}