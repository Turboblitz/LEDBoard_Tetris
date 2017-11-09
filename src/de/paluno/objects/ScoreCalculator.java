package de.paluno.objects;

public class ScoreCalculator {

    private int score;

    public ScoreCalculator() {
        this.score = 0;
    }

    public void addScore(int addedScore) {
        this.score += addedScore;
    }
}
