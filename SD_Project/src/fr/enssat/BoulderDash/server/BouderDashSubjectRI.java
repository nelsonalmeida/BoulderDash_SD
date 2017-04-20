package fr.enssat.BoulderDash.server;

import fr.enssat.BoulderDash.client.BoulderDashClient;
import java.rmi.RemoteException;

public interface BouderDashSubjectRI {
    // observer
    public void attach(BoulderDashClient bdc) throws RemoteException;

    public void detach(BoulderDashClient bdc) throws RemoteException;

    public State getState() throws RemoteException;

    public void setState(State s) throws RemoteException;
}
