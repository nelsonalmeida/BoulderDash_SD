package fr.enssat.BoulderDash.server;

import fr.enssat.BoulderDash.Game;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * <p>Title: Projecto SD</p>
 * <p>Description: Projecto apoio aulas SD</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: UFP </p>
 * @author Rui Moreira
 * @version 1.0
 */
public interface BoulderDashSessionRI extends Remote {
    //public void startGame() throws RemoteException;
    public void newGame(GameW g) throws RemoteException;
    public void logout() throws RemoteException;
}
