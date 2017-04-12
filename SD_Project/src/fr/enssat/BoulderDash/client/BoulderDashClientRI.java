package fr.enssat.BoulderDash.client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BoulderDashClientRI extends Remote {

    public void update() throws RemoteException;
}
