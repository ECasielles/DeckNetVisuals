package com.mercacortex.decknetvisuals.model;

/**
 * Holds information for game cards. Information is readonly.
 */

public class GameCard {
    private final int cardId;
    private final String cardName, cardText;
    private final int cardQuantity;

    public GameCard(int cardId, String name, String text, int quantity) {
        this.cardId = cardId;
        this.cardName = name;
        this.cardText = text;
        this.cardQuantity = quantity;
    }

    public int getCardId() { return cardId; }
    public String getCardName() { return cardName; }
    public String getCardText() { return cardText; }
    public int getCardQuantity() { return cardQuantity; }

    @Override
    public String toString() {
        return  "cardName='" + cardName + '\'' +
                ", cardText='" + cardText + '\'' +
                ", cardQuantity=" + cardQuantity;
    }
}
