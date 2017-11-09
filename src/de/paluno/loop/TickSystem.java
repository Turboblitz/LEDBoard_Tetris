package de.paluno.loop;

import de.paluno.drawing.DrawSystem;
import de.paluno.objects.RowCollapseManager;
import de.paluno.objects.collision.CollisionHandler;

public class TickSystem {

    private CollisionHandler collisionHandler;
    private DrawSystem drawSystem;
    private RowCollapseManager rowCollapseManager;

    public TickSystem(CollisionHandler collisionHandler, DrawSystem drawSystem, RowCollapseManager rowCollapseManager) {
        this.collisionHandler = collisionHandler;
        this.drawSystem = drawSystem;
        this.rowCollapseManager = rowCollapseManager;
    }

    public void tick() {
        if (!collisionHandler.hasBody()) collisionHandler.addNewBody();
        collisionHandler.calculateGravity();
        rowCollapseManager.computeCollapses();
        drawSystem.draw();
    }
}
