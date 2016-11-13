package com.mercacortex.decknetvisuals.model;

/**
 * Holds information for game cards
 */

public class GameCard {
    private String name, text;
    private int qtty;

    public GameCard(String name, String text, int qtty) {
        this.name = name;
        this.text = text;
        this.qtty = qtty;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    public int getQtty() { return qtty; }
    public void setQtty(int qtty) { this.qtty = qtty; }
    @Override
    public String toString() {
        return "GameCard{" +
                "name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", qtty=" + qtty +
                '}';
    }
}
