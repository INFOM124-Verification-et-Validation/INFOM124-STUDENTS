package nl.tudelft.jpacman.level;

/**
 * This class acts as an intermediary between the Player and the Score, handling
 * score modifications and retrieval. The player's score can be adjusted based
 * on the difficulty level of the game.
 */
public class PlayerScoreManager {
    private final ScoreWrapper scoreWrapper;

    public PlayerScoreManager() {
        this.scoreWrapper = new ScoreWrapper(new Score(0));
    }

    public int getTotalPoints() {
        return scoreWrapper.getPoints();
    }

    public void addPoints(int points) {
        scoreWrapper.addPoints(points);
    }
}
