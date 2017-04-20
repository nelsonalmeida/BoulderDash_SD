package fr.enssat.BoulderDash.server;

import fr.enssat.BoulderDash.client.BoulderDashObserverRI;
import fr.enssat.BoulderDash.controllers.GameKeyController;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class BoulderDashSubjectImpl extends UnicastRemoteObject implements BoulderDashSubjectRI{
    private ArrayList<BoulderDashObserverRI> observers = new ArrayList();
    private State state;
    
    public BoulderDashSubjectImpl(State s) throws RemoteException{
        this.state = s;
      
    }
    
    @Override
    public void setState(State s, GameKeyController gkc) throws RemoteException {
        System.out.println("SubjectImpl - setState(): state = " + s.toString());
        this.state = s;
        
        this.notifyAllObservers(s.getKey(), gkc);
    }
    
    private void notifyAllObservers(int key, GameKeyController gkc) throws RemoteException {
        System.out.println("SubjectImpl - notifyAllObservers(): this.observers.size() = " + this.observers.size());
        for (BoulderDashObserverRI o : this.observers){
            o.update(key, gkc);
        }
    }

    @Override
    public void attach(BoulderDashObserverRI o) throws RemoteException {
        this.observers.add(o);
    }

    @Override
    public void detach(BoulderDashObserverRI o) throws RemoteException {
        this.observers.remove(o);
    }

    @Override
    public int getObservers() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getObserverIndex(String id) throws RemoteException {
            //para saber o id de quem está a mexer
            for(int i=0;i<observers.size();i++){
            String obsID = observers.get(i).getID();
            if(obsID.equals(id))
                return ""+(i+1);
        }
        return ""+0;
    }
}
