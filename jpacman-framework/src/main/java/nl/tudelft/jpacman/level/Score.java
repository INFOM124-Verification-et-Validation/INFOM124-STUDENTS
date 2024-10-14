package nl.tudelft.jpacman.level;

public class Score {
    private int points;

    public Score(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int pointsToAdd) {
        this.points += pointsToAdd;
    }
}
