package fr.enssat.BoulderDash.client;

import fr.enssat.BoulderDash.controllers.GameKeyController;
import fr.enssat.BoulderDash.controllers.RockfordUpdateController;
import fr.enssat.BoulderDash.models.DisplayableElementModel;
import fr.enssat.BoulderDash.models.LevelModel;
import fr.enssat.BoulderDash.server.BoulderDashSubjectRI;
import fr.enssat.BoulderDash.server.State;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.rmi.RemoteException;

public class BoulderDashObserverImpl implements BoulderDashObserverRI, KeyListener{

    private String id;
    private BoulderDashSubjectRI subject;

    private LevelModel levelModel;
    private RockfordUpdateController updatePosRockford[] = {null, null};

    public BoulderDashObserverImpl(String id, BoulderDashSubjectRI subject) {
        this.id = id;
        this.subject = subject;
    }
    
    public void update(int key, GameKeyController gkc) throws RemoteException  {

        switch (key) {
            // Direction: UP
            case KeyEvent.VK_UP:
                
                gkc.updateMultiplayer(key, Integer.parseInt(id));
                
                break;

            // Direction: DOWN
            case KeyEvent.VK_DOWN:
                DisplayableElementModel downElement = levelModel.getGroundLevelModel()[levelModel.getRockfordPositionX(0)][levelModel.getRockfordPositionY(0) + 1];

                if (downElement.getPriority() < levelModel.getRockford(0).getPriority()) {
                    this.updatePosRockford[0].moveRockford(levelModel.getRockfordPositionX(0), levelModel.getRockfordPositionY(0) + 1);
                    this.levelModel.getRockford(0).startRunningDown();
                }

                break;

            // Direction: LEFT
            case KeyEvent.VK_LEFT:
                DisplayableElementModel leftElement = levelModel.getGroundLevelModel()[levelModel.getRockfordPositionX(0) - 1][levelModel.getRockfordPositionY(0)];

                if (leftElement.getPriority() < levelModel.getRockford(0).getPriority()) {
                    this.updatePosRockford[0].moveRockford(levelModel.getRockfordPositionX(0) - 1, levelModel.getRockfordPositionY(0));
                    this.levelModel.getRockford(0).startRunningLeft();
                }

                break;

            // Direction: RIGHT
            case KeyEvent.VK_RIGHT:
                DisplayableElementModel rightElement = levelModel.getGroundLevelModel()[levelModel.getRockfordPositionX(0) + 1][levelModel.getRockfordPositionY(0)];

                if (rightElement.getPriority() < levelModel.getRockford(0).getPriority()) {
                    this.updatePosRockford[0].moveRockford(levelModel.getRockfordPositionX(0) + 1, levelModel.getRockfordPositionY(0));
                    this.levelModel.getRockford(0).startRunningRight();
                }

                break;
        }
    }

    public void sendKey(int key, GameKeyController gkc) throws RemoteException {

        this.subject.setState(new State(subject.getObserverIndex(id), key),gkc);

    }

    public String getID() throws RemoteException {
        return this.id;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
