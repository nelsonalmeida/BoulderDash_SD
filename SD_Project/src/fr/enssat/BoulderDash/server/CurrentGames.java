package fr.enssat.BoulderDash.server;

import fr.enssat.BoulderDash.controllers.NavigationBetweenViewController;
import java.io.Serializable;
import java.rmi.RemoteException;
import javax.swing.SwingUtilities;


public class CurrentGames implements Serializable {
    private String name;
    private int nplayers;
    
    public CurrentGames(String name, int nplayers) throws RemoteException {
        this.name = name;
        this.nplayers = nplayers;
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NavigationBetweenViewController();
            }
        });
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

    public int getNplayers() {
        return nplayers;
    }

    public void setNplayers(int nplayers) {
        this.nplayers = nplayers;
    }
    
    @Override
    public String toString() {
        return "Name=" + name + " Nº jogadores=" + nplayers ;
    }
    
    
}
