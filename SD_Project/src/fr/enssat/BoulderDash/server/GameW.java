package fr.enssat.BoulderDash.server;

import java.io.Serializable;
import java.rmi.RemoteException;

/**
 *
 * @author Henrique
 * @author Joel
 */
public class GameW implements Serializable {
    private String name;

    public GameW(String name) throws RemoteException {
        this.name = name;
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
