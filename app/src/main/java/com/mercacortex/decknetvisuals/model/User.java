package com.mercacortex.decknetvisuals.model;

import java.util.List;
import java.util.Map;

/**
 * Holds user information.
 */

public class User {
    private String username, password;
    // Cards and copies owned by the user
    private Map<GameCard, Integer> userCollection;
    private List<GameDeck> userDeck;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username; }

    public String getPassword() { return password; }

    //TODO: Collection functions needed

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
