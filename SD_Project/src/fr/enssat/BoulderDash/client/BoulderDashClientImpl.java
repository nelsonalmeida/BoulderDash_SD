package fr.enssat.BoulderDash.client;

import fr.enssat.BoulderDash.server.BoulderDashServerRI;
import fr.enssat.BoulderDash.server.State;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class BoulderDashClientImpl implements BoulderDashClientRI {

    protected BoulderDashServerRI bdsRI;        //Observer: No exemplo da aula este é o subjectRI
    protected BoulderDashClient bdc;

    private State state;
    protected Login login;
    protected Welcome gui;

    //private String username;

    public BoulderDashClientImpl(BoulderDashServerRI bdsRI) throws RemoteException {
        export();
        this.bdsRI = bdsRI;

        // login do jogador
        this.login = new Login(this);
        login.setVisible(true);
    }
    
    /*
    public BoulderDashClientImpl(String username, Welcome gui, String args[]) throws RemoteException {
        System.out.println("ObserverImpl - ObserverImpl(): username = " + username);
        this.state = new State(username, "");
        this.gui = gui;
        //Export proxy for this observer
        export();
        //Get proxy for subject
        lookup(args);
    }
    */
    
    
    
 
    @Override
    public void update() throws RemoteException {
        this.state = this.bdc.bdsRI.getState();
        // todos os estados vao passar por aqui, decidir o que quero fazer
        // atualizar o chat - updateTextArea

        //this.gui.updateTextArea();
    }

    protected State getLastObserverState() {
        return this.state;
    }


    private void export() throws RemoteException {
        UnicastRemoteObject.exportObject(this, 0);
    }
    

    public Welcome getGui() {
        return gui;
    }

    public void setGui(Welcome gui) {
        this.gui = gui;
    }
    
    
}
