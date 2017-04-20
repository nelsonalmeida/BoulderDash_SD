package fr.enssat.BoulderDash.client;

import fr.enssat.BoulderDash.controllers.GameKeyController;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BoulderDashObserverRI extends Remote{
    public void update(int key, GameKeyController gkc) throws RemoteException;
    public String getID() throws RemoteException;
    public void sendKey(int key, GameKeyController gkc) throws RemoteException;
}
