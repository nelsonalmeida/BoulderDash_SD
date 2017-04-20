package fr.enssat.BoulderDash.server;

import fr.enssat.BoulderDash.client.BoulderDashObserverRI;
import fr.enssat.BoulderDash.controllers.GameKeyController;
import java.rmi.RemoteException;

public interface BoulderDashSubjectRI {

    public void attach(BoulderDashObserverRI o) throws RemoteException;
    
    public void detach(BoulderDashObserverRI o) throws RemoteException;
    
    public void setState(State s,GameKeyController gkc) throws RemoteException;
    
    public int getObservers() throws RemoteException;
    
    public String getObserverIndex(String id) throws RemoteException;
    
}
