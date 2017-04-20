package fr.enssat.BoulderDash.controllers;

import fr.enssat.BoulderDash.client.BoulderDashObserverRI;
import fr.enssat.BoulderDash.client.Welcome;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fr.enssat.BoulderDash.helpers.AudioLoadHelper;
import fr.enssat.BoulderDash.models.LevelModel;
import fr.enssat.BoulderDash.views.MenuView;
import fr.enssat.BoulderDash.controllers.LevelEditorController;
import fr.enssat.BoulderDash.controllers.GameController;
import fr.enssat.BoulderDash.server.CurrentGames;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Controller to navigate between the different views
 *
 * @author Colin Leverger <me@colinleverger.fr>
 *
 */
public class NavigationBetweenViewController {

    private LevelEditorController levelEditorController;
    private MenuView menuView;
    private AudioLoadHelper audioLoadHelper;
    private LevelModel levelModelForGame, levelModelForEditor;
    private GameController gameController;
    private String pickedLevelIdentifier;
    public CurrentGames currentgames;
    public String level;
    
    private BoulderDashObserverRI obs;

    /**
     * Class constructor
     */
    public NavigationBetweenViewController(String level, BoulderDashObserverRI obs) {
        
        this.level = level;
        this.obs = obs;
    
        this.audioLoadHelper = new AudioLoadHelper();

        // Play game music
        this.getAudioLoadHelper().startMusic("game");
        
        pickedLevelIdentifier = level;

        this.levelModelForGame = new LevelModel(pickedLevelIdentifier, audioLoadHelper);
        this.gameController = new GameController(levelModelForGame, audioLoadHelper, this, obs);
        if (levelEditorController != null) {
            this.levelEditorController.getLevelEditorView().setVisible(false);
        }

        this.gameController.getGameView().setVisible(true);
        this.gameController.getGameView().getGameFieldView().grabFocus();

    }

    /**
     * Action performed event handler
     *
     * @param event Action event
     
    @Override
    public void actionPerformed(ActionEvent event) {
        switch (event.getActionCommand()) {
            case "quit":
                System.exit(0);
                break;

            case "editor":
                // New blank model for editor
                this.levelModelForEditor = new LevelModel(audioLoadHelper);
                this.levelEditorController = new LevelEditorController(this.levelModelForEditor, this);

                this.levelEditorController.getLevelEditorView().setVisible(true);
                this.levelEditorController.getLevelEditorView().getLevelEditorGroundView().grabFocus();

                if (gameController != null) {
                    this.gameController.getGameView().setVisible(false);
                }

                break;

            case "game":
                // Reinit the levelModelForGame...
                pickedLevelIdentifier = this.menuView.getLevelIdentifier();

                 Logger.getLogger(NavigationBetweenViewController.class.getName()).log(Level.INFO, "event.getActionCommand() = " + event.getActionCommand());
          
                this.levelModelForGame = new LevelModel(pickedLevelIdentifier, audioLoadHelper);
                this.gameController = new GameController(levelModelForGame, audioLoadHelper, this);
                if (levelEditorController != null) {
                    this.levelEditorController.getLevelEditorView().setVisible(false);
                }

                this.gameController.getGameView().setVisible(true);
                this.gameController.getGameView().getGameFieldView().grabFocus();

                break;
        }

        this.menuView.setVisible(false);
    }
*/
    /**
     * Get the audio load helper
     *
     * @return Audio load helper
     */
    public AudioLoadHelper getAudioLoadHelper() {
        return this.audioLoadHelper;
    }

    /**
     * Get the first view
     *
     * @return First view
     */
    public MenuView getMenuView() {
        return this.menuView;
    }

    /**
     * Set the first view
     *
     * @param menuView
     * @return 
     */
    public MenuView setMenuView() {
        this.menuView = new MenuView(this);
        return menuView;
    }

    /**
     * Get the pickedLevel
     *
     * @return pickedLevelIdentifier Picked level identifier
     */
    public String getPickedLevelIdentifier() {
        return pickedLevelIdentifier;
    }

    /**
     * Set the pickedLevelIdentifier
     *
     * @param pickedLevelIdentifier Picked level identifier
     */
    public void setPickedLevelIdentifier(String pickedLevelIdentifier) {
        this.pickedLevelIdentifier = pickedLevelIdentifier;
    }

}
