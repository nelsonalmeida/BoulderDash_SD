package fr.enssat.BoulderDash.server;

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
public interface BoulderDashFactoryRI extends Remote {
    public BoulderDashSessionRI login (String u, String p) throws RemoteException;
    public boolean register(String u, String p) throws RemoteException;
}
