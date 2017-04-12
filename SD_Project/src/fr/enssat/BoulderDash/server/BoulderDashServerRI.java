package fr.enssat.BoulderDash.server;

import fr.enssat.BoulderDash.client.BoulderDashClientRI;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface BoulderDashServerRI extends Remote {

    // session
    public boolean register(BoulderDashClientRI session, String u, String p) throws RemoteException;
    
    public boolean login(BoulderDashClientRI session, String u, String p) throws RemoteException;
    
    public void logout() throws RemoteException;
    
    // factory
    public void newGame(CurrentGames g) throws RemoteException;

    public CurrentGames[] viewGames() throws RemoteException;

    // observer
   
    public void attach(BoulderDashClientRI bdc) throws RemoteException;

    public void detach(BoulderDashClientRI bdc) throws RemoteException;

    public State getState() throws RemoteException;

    public void setState(State s) throws RemoteException;
   
}
