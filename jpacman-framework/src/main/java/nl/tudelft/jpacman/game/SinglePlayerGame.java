package nl.tudelft.jpacman.game;

import java.util.List;

import nl.tudelft.jpacman.level.Level;
import nl.tudelft.jpacman.level.Player;

import com.google.common.collect.ImmutableList;

/**
 * A game with one player and a single level.
 *
 * @author Jeroen Roosen
 */
public class SinglePlayerGame extends Game {

    /**
     * The player of this game.
     */
    private final Player player;

    /**
     * The level of this game.
     */
    private final Level level;

    /**
     * Game Indicator
     */
    private boolean isGameActive;

    /**
     * Create a new single player game for the provided level and player.
     *
     * @param player The player.
     * @param level  The level.
     */
    protected SinglePlayerGame(Player player, Level level) {
        assert player != null;
        assert level != null;

        this.player = player;
        this.level = level;
        this.level.registerPlayer(player);
        this.isGameActive = true;
    }

    @Override
    public List<Player> getPlayers() {
        return ImmutableList.of(player);
    }

    @Override
    public Level getLevel() {
        return level;
    }

    /**
     * Returns the player associated with this single player game.
     *
     * @return the player instance.
     */
    public Player getPlayerDirectly() {
        return player;
    }

    /**
     * See if PackMan is present
     *
     * @param isPresent
     *              Check if PackMan is present
     */
    public void getPackMan(boolean isPresent) {
        if (isPresent) {
            System.out.println("PackMan is present " + getPlayerDirectly());
        } else {
            System.out.println("PackMan is not present");
        }

    }
}
