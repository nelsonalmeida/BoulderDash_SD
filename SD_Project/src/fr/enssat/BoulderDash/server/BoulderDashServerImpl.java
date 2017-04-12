package fr.enssat.BoulderDash.server;

import fr.enssat.BoulderDash.client.BoulderDashClientRI;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BoulderDashServerImpl extends UnicastRemoteObject implements BoulderDashServerRI, Serializable {

    private final DB db;
    private State state;
    protected ArrayList<BoulderDashClientRI> sessions = new ArrayList();;

    public BoulderDashServerImpl() throws RemoteException {
        super();
        this.db = new DB();
        System.out.println("BoulderDashServerImpl - Constructor(): ...");
    }

    @Override
    public boolean register(BoulderDashClientRI newSession, String user, String pass) throws RemoteException {
        if (this.db.exists(user, pass)) {
            System.out.println("BoulderDashServerImpl - register(): User already exists! ");
            return false;
        } else {
            this.db.addUser(user, pass);
            this.sessions.add(newSession);
            System.out.println("BoulderDashServerImpl - register(): Session Added");
            return true;
        }
    }

    @Override
    public boolean login(BoulderDashClientRI newSession, String user, String pass) throws RemoteException {
        System.out.println("BoulderDashServerImpl - login(): user=" + user + " pass=" + pass);
        if (this.db.exists(user, pass)) {
            this.sessions.add(newSession);
            System.out.println("BoulderDashServerImpl - login(): Session Added");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void logout() throws RemoteException {
        System.out.println("BoulderDashServerImpl - logout(): ");
        boolean removed = this.sessions.remove(this);
    }

    @Override
    public CurrentGames[] viewGames() throws RemoteException {
        return this.db.selectGames();
    }
    
    @Override
    public void newGame(CurrentGames game) throws RemoteException {
        this.db.insertGame(game);
    }

    
    //Observer
    @Override
    public void attach(BoulderDashClientRI bdc) throws RemoteException {
        this.sessions.add(bdc);
    }

    @Override
    public void detach(BoulderDashClientRI bdc) throws RemoteException {
        this.sessions.remove(bdc);
    }

    @Override
    public State getState() throws RemoteException {
        System.out.println("SubjectImpl - getState(): state = " + this.state.toString());
        return this.state;
    }

    @Override
    public void setState(State s) throws RemoteException {
        System.out.println("SubjectImpl - setState(): state = " + s.toString());
        this.state = s;
        this.notifyAllObservers();
    }

    private void notifyAllObservers() {
        System.out.println("SubjectImpl - notifyAllObservers(): this.sessions.size() = " + this.sessions.size());
        for (BoulderDashClientRI o : this.sessions) {
            try {
                o.update();
            } catch (RemoteException ex) {
                Logger.getLogger(BoulderDashServerImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
