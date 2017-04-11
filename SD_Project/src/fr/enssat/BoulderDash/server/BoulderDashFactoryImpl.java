package fr.enssat.BoulderDash.server;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * <p>
 * Title: Projecto SD</p>
 * <p>
 * Description: Projecto apoio aulas SD</p>
 * <p>
 * Copyright: Copyright (c) 2009</p>
 * <p>
 * Company: UFP </p>
 *
 * @author Rui Moreira
 * @version 1.0
 */
public class BoulderDashFactoryImpl extends UnicastRemoteObject implements BoulderDashFactoryRI {

    protected BoulderDashDB db;
    protected ArrayList<BoulderDashSessionRI> sessions;

    // Uses RMI-default sockets-based transport
    // Runs forever (do not passivates) - Do not needs rmid (activation deamon)
    // Constructor must throw RemoteException due to export()
    public BoulderDashFactoryImpl() throws RemoteException {
        // Invokes UnicastRemoteObject constructor which exports remote object
        super();
        System.out.println("BoulderDashFactoryImpl - Constructor(): ...");
        db = new BoulderDashDB();
        sessions = new ArrayList<>();
    }

    @Override
    public BoulderDashSessionRI login(String u, String p) throws RemoteException {
        System.out.println("BoulderDashFactoryImpl - login(): user = " + u);
        if (this.db.exists(u, p)){
            BoulderDashSessionRI s = new BoulderDashSessionImpl(this);
            UnicastRemoteObject.exportObject(s,0);
            this.sessions.add(s);
            Thread t = new Thread((Runnable)s);
            t.start();
            System.out.println("BoulderDashFactoryImpl - login(): return session...");
            return s;
        } else {
            throw new RemoteException("User name or passwd are wrong!!");
        }   
    }
    @Override
    public boolean register(String u, String p) throws RemoteException {
       if (this.db.exists(u, p)){
           throw new RemoteException("User already exists!");
       }else{
           return this.db.register(u, p);
       }
    }
}
