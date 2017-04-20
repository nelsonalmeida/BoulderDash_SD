package fr.enssat.BoulderDash.server;

import java.io.Serializable;

public class State implements Serializable{
    //private String gameName;
    private String playerName;
    private int key;

    public State(String playerName, int key) {
        this.playerName = playerName;
        this.key = key;
    }

    /**
     * @return the id
     */
    public String getId() {
        return playerName;
    }

    /**
     * @param playerName the id to set
     */
    public void setId(String playerName) {
        this.playerName= playerName;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "State{" + "id=" + playerName + ", key=" + key + '}';
    }
}