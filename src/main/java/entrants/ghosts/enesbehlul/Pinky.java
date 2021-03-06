package entrants.ghosts.enesbehlul;

import pacman.controllers.IndividualGhostController;
import pacman.game.Constants;
import pacman.game.Game;

/**
 * Created by Piers on 11/11/2015.
 */
public class Pinky extends IndividualGhostController{

    GhostCommunication ghostCommunication;
    static int currentGhostLocation, pacmanLocation;

    public Pinky() {
        super(Constants.GHOST.PINKY);
        ghostCommunication = new GhostCommunication(Constants.GHOST.PINKY);
    }

    @Override
    public Constants.MOVE getMove(Game game, long timeDue) {
        return ghostCommunication.getMove(game, timeDue);
    }

}
