package fr.enssat.BoulderDash.server;

import fr.enssat.BoulderDash.Game;
import java.io.Serializable;
import java.rmi.RemoteException;

/**
 *
 * @author Henrique
 * @author Joel
 */
public class GameW implements Serializable {
    private String name;
    private Game game;

    public GameW(String name) throws RemoteException {
        this.name = name;
        this.game = game;
    }
    
    /**
     * Get name
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set name
     * 
     * @param name name of game
     */
    public void setName(String name) {
        this.name = name;
    }

}
