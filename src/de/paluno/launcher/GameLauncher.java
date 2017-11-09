package de.paluno.launcher;

import de.paluno.boardcontrol.BoardModifier;
import de.paluno.drawing.DrawSystem;
import de.paluno.loop.LoopManager;
import de.paluno.loop.TickSystem;
import de.paluno.objects.RowCollapseManager;
import de.paluno.objects.ScoreCalculator;
import de.paluno.objects.collision.CollisionHandler;
import de.paluno.objects.collision.GameBoard;
import de.paluno.objects.tetrispieces.Piecefactory;
import ledControl.BoardController;

public class GameLauncher {

    public static void main(String[] args) {
        GameLauncher launcher = new GameLauncher();
        launcher.launchNewGame();
    }

    private void launchNewGame() {
        BoardModifier boardModifier = new BoardModifier();
        DrawSystem drawSystem = new DrawSystem(boardModifier);
        GameBoard board = new GameBoard();
        Piecefactory pieceFactory = new Piecefactory(board, drawSystem);
        CollisionHandler collisionHandler = new CollisionHandler(board, pieceFactory);
        pieceFactory.setCollisionHandler(collisionHandler);
        ScoreCalculator scoreCalculator = new ScoreCalculator();
        RowCollapseManager rowCollapseManager = new RowCollapseManager(scoreCalculator, collisionHandler);
        TickSystem tickSystem = new TickSystem(collisionHandler, drawSystem, rowCollapseManager);
        LoopManager loopManager = new LoopManager(boardModifier, tickSystem);
        loopManager.runloop();
    }
}
