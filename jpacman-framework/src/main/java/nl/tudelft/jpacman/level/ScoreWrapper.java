package nl.tudelft.jpacman.level;

/**
 * This class encapsulates a Score object and provides methods to add to and retrieve
 * the score, with all operations adjusted by a multiplier. This multiplier could be
 * used to simulate bonuses, penalties, or difficulty-based adjustments.
 */
public class ScoreWrapper {
    private Score score;

    public ScoreWrapper(Score score) {
        this.score = score;
    }

    public int getPoints() {
        return score.getPoints();
    }

    public void addPoints(int points) {
        score.addPoints(points);
    }
}
