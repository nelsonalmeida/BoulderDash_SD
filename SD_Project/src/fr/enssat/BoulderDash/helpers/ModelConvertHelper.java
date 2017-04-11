package fr.enssat.BoulderDash.helpers;

import fr.enssat.BoulderDash.exceptions.UnknownModelException;

import fr.enssat.BoulderDash.models.ExpandingWallModel;
import fr.enssat.BoulderDash.models.RockfordModel;
import fr.enssat.BoulderDash.models.DisplayableElementModel;
import fr.enssat.BoulderDash.models.EmptyModel;
import fr.enssat.BoulderDash.models.BrickWallModel;
import fr.enssat.BoulderDash.models.BoulderModel;
import fr.enssat.BoulderDash.models.DiamondModel;
import fr.enssat.BoulderDash.models.DirtModel;
import fr.enssat.BoulderDash.models.MagicWallModel;
import fr.enssat.BoulderDash.models.SteelWallModel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * ModelConvertHelper
 *
 * Provides model conversion services.
 *
 * @author Valerian Saliou <valerian@valeriansaliou.name>
 * @since 2015-06-22
 */
public class ModelConvertHelper {

    /**
     * Class constructor
     */
    public ModelConvertHelper() {
        // Nothing done.
    }

    /**
     * Gets the model associated to the string
     *
     * @param spriteName Sprite name
     * @return Model associated to given sprite name
     */
    public DisplayableElementModel toModel(String spriteName, boolean isConvertible) throws UnknownModelException {
        DisplayableElementModel element;

        //Logger.getLogger(ModelConvertHelper.class.getName()).log(Level.INFO, "spriteName = " + spriteName);
            
        // Instanciates the sprite element matching the given sprite name
        switch (spriteName) {
            case "black":
            case "Black":
                element = new EmptyModel();
                break;

            case "boulder":
            case "Boulder":
                element = new BoulderModel(isConvertible);
                break;

            case "brickwall":
            case "Brick Wall":
                element = new BrickWallModel();
                break;

            case "diamond":
            case "Diamond":
                element = new DiamondModel();
                break;

            case "dirt":
            case "Dirt":
                element = new DirtModel();
                break;

            case "magicwall":
            case "Magic Wall":
                element = new MagicWallModel();
                break;

            case "steelwall":
            case "Steel Wall":
                element = new SteelWallModel();
                break;

            case "expandingwall":
            case "Expanding Wall":
                element = new ExpandingWallModel();
                break;

            case "rockford0":
            case "Rockford0":
            case "rockford1":
            case "Rockford1":
                
                element = new RockfordModel(spriteName);
                break;

            default:
                throw new UnknownModelException("Unknown model element > " + spriteName);
        }

        return element;
    }

    /**
     * Gets the string associated to the model
     *
     * @return Model string name
     */
    public String toString(DisplayableElementModel model) {
        return model.getSpriteName();
    }
}
