package de.paluno.objects;

import de.paluno.objects.collision.CollisionHandler;

import java.util.ArrayList;
import java.util.List;

public class RowCollapseManager {

    private final ScoreCalculator score;
    private final CollisionHandler collisionHandler;

    public RowCollapseManager(ScoreCalculator score, CollisionHandler collisionHandler) {
        this.score = score;
        this.collisionHandler = collisionHandler;
    }

    public void computeCollapses(){
        //check for collapsing rows by getting their y-coords as a List
        List<Integer> collapsingRows = this.collisionHandler.getAllCollapsingRows();
        //calc the score by checking for double-collapses etc.
        score.addScore(calculateScore(collapsingRows));
        //remove the collapsed rows
        for (Integer collapsingRow : collapsingRows) {
            this.collisionHandler.removeRow(collapsingRow);
        }

    }

    private int calculateScore(List<Integer> collapsingRows) {
        return 0;
    }
}
