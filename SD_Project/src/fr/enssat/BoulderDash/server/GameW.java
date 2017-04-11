package fr.enssat.BoulderDash.server;

import fr.enssat.BoulderDash.Game;
import fr.enssat.BoulderDash.controllers.NavigationBetweenViewController;
import java.io.Serializable;
import java.rmi.RemoteException;
import javax.swing.SwingUtilities;


public class GameW implements Serializable {
    private String name;
    private Game game;

    public GameW(String name) throws RemoteException {
        this.name = name;
        this.game = game;
    }
    
    public void startGame(){
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

}
