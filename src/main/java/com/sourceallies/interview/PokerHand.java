package com.sourceallies.interview;

import java.util.HashMap;

public class PokerHand {
    private String hand = "";
    private String[] handAsCards;
    private PokerRank rank;
    private HashMap<Character, Integer> counts;

    PokerHand(String hand){
        this.hand = hand;
        this.handAsCards = generateHand(this.hand);
        this.counts = generateCountsMap(this.handAsCards);
        calcRank();
    }

    private HashMap<Character, Integer> generateCountsMap(String[] handAsCards){
        HashMap<Character, Integer> counts = new HashMap<>();

        for(int i = 0; i < handAsCards.length; i++){
            var currentCardValue = handAsCards[i].charAt(0);
            var currentCount = counts.getOrDefault(currentCardValue, 0) + 1;
            counts.put(currentCardValue, currentCount);
        }

        return counts;
    }

    private void calcRank(){
        if(isThreeOfAKind()){
            this.rank = PokerRank.THREEOFAKIND;
        }else if(containsTwoPairs()){
            this.rank = PokerRank.TWOPAIRS;
        }else if(containsPair()){
            this.rank = PokerRank.PAIR;
        }else{
            this.rank = PokerRank.HIGHCARD;
        }
    }

    private boolean containsPair(){
        return countPairs() == 1;
    }

    private boolean containsTwoPairs(){
        return countPairs() == 2;
    }

    private boolean isThreeOfAKind(){
        for(Character key : this.counts.keySet()) {
            if(counts.get(key) == 3) return true;
        }

        return false;
    }

    //Getters and Setters
    public String getHand(){
        return hand;
    }

    public PokerRank getRank(){
        return rank;
    }

    //Helper Functions
    private int countPairs(){
        int pairCount = 0;
        for(Character key : this.counts.keySet()) {
            if(this.counts.get(key) == 2){
                pairCount++;
            }
        }
        return pairCount;
    }

    //Static Functions
    public static String[] generateHand(String handAsString){
        return handAsString.split(" ");
    }


}
