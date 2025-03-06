package com.sourceallies.interview.Card;

public enum CardValue {

    TWO('2'),
    THREE('3'),
    FOUR('4'),
    FIVE('5'),
    SIX('6'),
    SEVEN('7'),
    EIGHT('8'),
    NINE('9'),
    TEN('T'),
    JACK('J'),
    QUEEN('Q'),
    KING('K'),
    ACE('A');

    private final char value;
    private final String CARD_ORDER = "23456789TJQKA";

    CardValue(char value) {
        this.value = value;
    }

    public static CardValue init(char value) {
        CardValue res = CardValue.ACE; // Default
        for (CardValue c : CardValue.values()) {
            if (c.value == value) {
                res = c;
            }
        }
        return res;
    }

    public int getInt() {
        return CARD_ORDER.indexOf(this.value);
    }

}