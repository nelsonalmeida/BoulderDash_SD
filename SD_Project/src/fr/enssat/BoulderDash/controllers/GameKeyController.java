package fr.enssat.BoulderDash.controllers;

import fr.enssat.BoulderDash.models.DisplayableElementModel;
import fr.enssat.BoulderDash.models.LevelModel;
import fr.enssat.BoulderDash.controllers.RockfordUpdateController;
import fr.enssat.BoulderDash.controllers.BoulderAndDiamondController;
import fr.enssat.BoulderDash.helpers.AudioLoadHelper;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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

    /**
     * Class constructor
     *
     * @param levelModel Level model
     */
    public GameKeyController(LevelModel levelModel, AudioLoadHelper audioLoadHelper) {
        this.levelModel = levelModel;
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
                DisplayableElementModel upElement = levelModel.getGroundLevelModel()[levelModel.getRockfordPositionX(0)][levelModel.getRockfordPositionY(0) - 1];

                if (upElement.getPriority() < levelModel.getRockford(0).getPriority()) {
                    this.updatePosRockford[0].moveRockford(levelModel.getRockfordPositionX(0), levelModel.getRockfordPositionY(0) - 1);
                    this.levelModel.getRockford(0).startRunningUp();
                }

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
            // Direction: UP
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

                break;
                
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
}
