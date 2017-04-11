package fr.enssat.BoulderDash.server;

import fr.enssat.BoulderDash.Game;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <p>Title: Projecto SD</p>
 * <p>Description: Projecto apoio aulas SD</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: UFP </p>
 * @author Rui Moreira
 * @version 1.0
 */
public class BoulderDashSessionImpl implements BoulderDashSessionRI, Runnable {
    private BoulderDashDB db;
    private BoulderDashFactoryImpl factory;
    private boolean keeprunning = true;
    
    public BoulderDashSessionImpl(BoulderDashFactoryImpl factory){
        this.factory = factory;
        this.db = factory.db;
        System.out.println("BoulderDashSessionImpl - Constructor(): ...");
    }

   /*
    public Book[] search(String a, String t) throws RemoteException { 
        Book[] books = this.factory.db.select(t, a);
        System.out.println("DigLibSessionImpl - search(): books.length = " + books.length);
        return books;
    
    }

*/
    @Override
    public void logout() throws RemoteException {
        
        System.out.println("BoulderDashSessionImpl - logout(): ");
        this.keeprunning = false;
        this.factory.sessions.remove(this);
        
        
    }
    

    @Override
    public  GameW[] viewGames() throws RemoteException{
        return this.db.selectGames();
    }
    
    @Override
    public void newGame(GameW g) throws RemoteException{
        this.db.insertGame(g);
        
    }

    @Override
    public void run() {
        while (keeprunning){
            try {
                Thread t = Thread.currentThread();
                System.out.println("BoulderDashSessionImpl - run(): running " + t.getName());
                t.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BoulderDashSessionImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
