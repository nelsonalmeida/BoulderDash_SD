package fr.enssat.BoulderDash.server;

import fr.enssat.BoulderDash.client.BoulderDashObserverImpl;
import fr.enssat.BoulderDash.client.BoulderDashObserverRI;
import fr.enssat.BoulderDash.controllers.NavigationBetweenViewController;
import java.io.Serializable;
import java.rmi.RemoteException;
import javax.swing.SwingUtilities;


public class CurrentGames implements Serializable {
    private String name;
    private String level;
    private int nplayers = 0;
    private BoulderDashObserverRI obs;
    private BoulderDashSubjectRI subject;

    
    public CurrentGames(String name, String level, BoulderDashObserverRI obs) throws RemoteException {
        this.name = name;
        this.level = level;
        this.nplayers = 0;
        this.obs = obs;
        this.subject = new BoulderDashSubjectImpl(new State("",0));
        
        this.addPlayer(obs);
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NavigationBetweenViewController(level,obs);
            }
        });
               
    }
    
    
    public boolean addPlayer(BoulderDashObserverRI obs) throws RemoteException{
        if(nplayers<4){ //&& gameState == 0){
            this.subject.attach(obs);
            nplayers++;
            return true;
        }
        System.out.println("Game is Full!!! or Already started");
        return false;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    
    
    @Override
    public String toString() {
        //return "Name: " + name + " Level: " + level + " Players: " + nplayers ;
        return name;
    }
    
    
}
