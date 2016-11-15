package com.mercacortex.decknetvisuals.model;

/**
 * Holds deck information. Information is runtime editable.
 */

import java.util.Map;

public class GameDeck {

    private int deckId;
    private User deckUser;
    private String deckName;
    private Map<GameCard, Integer> deckList;

    public GameDeck(int deckId, User deckUser, String deckName, Map<GameCard, Integer> deckList) {
        this.deckId = deckId;
        this.deckUser = deckUser;
        this.deckName = deckName;
        this.deckList = deckList;
    }

    public int getDeckId() { return deckId; }
    public void setDeckId(int deckId) { this.deckId = deckId; }
    public User getDeckUser() { return deckUser; }
    public void setDeckUser(User deckUser) { this.deckUser = deckUser; }
    public String getDeckName() { return deckName; }
    public void setDeckName(String deckName) { this.deckName = deckName; }
    public Map<GameCard, Integer> getDeckList() { return deckList; }
    public void setDeckList(Map<GameCard, Integer> deckList) { this.deckList = deckList; }

    //TODO: Deck editor functions needed for the adapter to use
}
