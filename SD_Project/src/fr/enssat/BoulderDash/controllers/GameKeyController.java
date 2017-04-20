package fr.enssat.BoulderDash.controllers;

import fr.enssat.BoulderDash.client.BoulderDashObserverImpl;
import fr.enssat.BoulderDash.client.BoulderDashObserverRI;
import fr.enssat.BoulderDash.models.DisplayableElementModel;
import fr.enssat.BoulderDash.models.LevelModel;
import fr.enssat.BoulderDash.controllers.RockfordUpdateController;
import fr.enssat.BoulderDash.controllers.BoulderAndDiamondController;
import fr.enssat.BoulderDash.helpers.AudioLoadHelper;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.rmi.RemoteException;

/**
 * GameKeyController
 *
 * Manages the key events controller.
 *
 * @author Colin Leverger <me@colinleverger.fr>
 * @since 2015-06-19
 */
public class GameKeyController implements KeyListener {

    private LevelModel levelModel;
    private RockfordUpdateController updatePosRockford[] = {null, null};

    private BoulderDashObserverRI obs;

    /**
     * Class constructor
     *
     * @param levelModel Level model
     */
    public GameKeyController(LevelModel levelModel, AudioLoadHelper audioLoadHelper, BoulderDashObserverRI obs) {
        this.levelModel = levelModel;
        this.obs = obs;
        new BoulderAndDiamondController(levelModel, audioLoadHelper);
        this.updatePosRockford[0] = new RockfordUpdateController(0, levelModel);
        this.updatePosRockford[1] = new RockfordUpdateController(1, levelModel);
    }

    /**
     * Handles the 'key pressed' event
     *
     * @param e Key event
     */
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        switch (keyCode) {
            // Direction: UP
            case KeyEvent.VK_UP:

                try {
                    
                    obs.sendKey(keyCode, this);

                } catch (RemoteException ex) {
                }
                
                break;

            // Direction: DOWN
            case KeyEvent.VK_DOWN:
                try {
                    
                    obs.sendKey(keyCode, this);

                } catch (RemoteException ex) {
                }

                break;

            // Direction: LEFT
            case KeyEvent.VK_LEFT:
                try {
                    
                    obs.sendKey(keyCode, this);

                } catch (RemoteException ex) {
                }

                break;

            // Direction: RIGHT
            case KeyEvent.VK_RIGHT:
                try {
                    
                    obs.sendKey(keyCode, this);

                } catch (RemoteException ex) {
                }

                break;

            /* Direction: UP
            case KeyEvent.VK_W:
                DisplayableElementModel upElement1 = levelModel.getGroundLevelModel()[levelModel.getRockfordPositionX(1)][levelModel.getRockfordPositionY(1) - 1];

                if (upElement1.getPriority() < levelModel.getRockford(1).getPriority()) {
                    this.updatePosRockford[1].moveRockford(levelModel.getRockfordPositionX(1), levelModel.getRockfordPositionY(1) - 1);
                    this.levelModel.getRockford(1).startRunningUp();
                }

                break;

            // Direction: DOWN
            case KeyEvent.VK_S:
                DisplayableElementModel downElement1 = levelModel.getGroundLevelModel()[levelModel.getRockfordPositionX(1)][levelModel.getRockfordPositionY(1) + 1];

                if (downElement1.getPriority() < levelModel.getRockford(1).getPriority()) {
                    this.updatePosRockford[1].moveRockford(levelModel.getRockfordPositionX(1), levelModel.getRockfordPositionY(1) + 1);
                    this.levelModel.getRockford(1).startRunningDown();
                }

                break;

            // Direction: LEFT
            case KeyEvent.VK_A:
                DisplayableElementModel leftElement1 = levelModel.getGroundLevelModel()[levelModel.getRockfordPositionX(1) - 1][levelModel.getRockfordPositionY(1)];

                if (leftElement1.getPriority() < levelModel.getRockford(1).getPriority()) {
                    this.updatePosRockford[1].moveRockford(levelModel.getRockfordPositionX(1) - 1, levelModel.getRockfordPositionY(1));
                    this.levelModel.getRockford(1).startRunningLeft();
                }

                break;

            // Direction: RIGHT
            case KeyEvent.VK_D:
                DisplayableElementModel rightElement1 = levelModel.getGroundLevelModel()[levelModel.getRockfordPositionX(1) + 1][levelModel.getRockfordPositionY(1)];

                if (rightElement1.getPriority() < levelModel.getRockford(1).getPriority()) {
                    this.updatePosRockford[1].moveRockford(levelModel.getRockfordPositionX(1) + 1, levelModel.getRockfordPositionY(1));
                    this.levelModel.getRockford(1).startRunningRight();
                }

                break;*/
        }

    }

    /**
     * Handles the 'key released' event
     *
     * @param e Key event
     */
    @Override
    public void keyReleased(KeyEvent e) {
        this.levelModel.getRockford(0).startStaying();
    }

    /**
     * Handles the 'key typed' event
     *
     * @param e Key event
     */
    @Override
    public void keyTyped(KeyEvent e) {
        // Do nothing.
    }
    
    public void updateMultiplayer(int key, int player) throws RemoteException  {

        switch (key) {
            // Direction: UP
            case KeyEvent.VK_UP:

                DisplayableElementModel upElement = levelModel.getGroundLevelModel()[levelModel.getRockfordPositionX(player)][levelModel.getRockfordPositionY(player) - 1];

                if (upElement.getPriority() < levelModel.getRockford(player).getPriority()) {
                    this.updatePosRockford[player].moveRockford(levelModel.getRockfordPositionX(player), levelModel.getRockfordPositionY(player) - 1);
                    this.levelModel.getRockford(player).startRunningUp();
                }

                break;

            // Direction: DOWN
            case KeyEvent.VK_DOWN:
                DisplayableElementModel downElement = levelModel.getGroundLevelModel()[levelModel.getRockfordPositionX(player)][levelModel.getRockfordPositionY(player) + 1];

                if (downElement.getPriority() < levelModel.getRockford(player).getPriority()) {
                    this.updatePosRockford[player].moveRockford(levelModel.getRockfordPositionX(player), levelModel.getRockfordPositionY(player) + 1);
                    this.levelModel.getRockford(player).startRunningDown();
                }

                break;

            // Direction: LEFT
            case KeyEvent.VK_LEFT:
                DisplayableElementModel leftElement = levelModel.getGroundLevelModel()[levelModel.getRockfordPositionX(player) - 1][levelModel.getRockfordPositionY(player)];

                if (leftElement.getPriority() < levelModel.getRockford(0).getPriority()) {
                    this.updatePosRockford[player].moveRockford(levelModel.getRockfordPositionX(player) - 1, levelModel.getRockfordPositionY(player));
                    this.levelModel.getRockford(player).startRunningLeft();
                }

                break;

            // Direction: RIGHT
            case KeyEvent.VK_RIGHT:
                DisplayableElementModel rightElement = levelModel.getGroundLevelModel()[levelModel.getRockfordPositionX(player) + 1][levelModel.getRockfordPositionY(player)];

                if (rightElement.getPriority() < levelModel.getRockford(0).getPriority()) {
                    this.updatePosRockford[player].moveRockford(levelModel.getRockfordPositionX(player) + 1, levelModel.getRockfordPositionY(player));
                    this.levelModel.getRockford(player).startRunningRight();
                }

                break;
        }
    }
}
