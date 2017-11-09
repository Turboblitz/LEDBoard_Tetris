package de.paluno.objects.tetrispieces;

import de.paluno.objects.collision.Body;

public class Tetrispiece {

    protected Body body;

    Tetrispiece(Body body) {
        this.body = body;
    }

    public Body getBody(){
        return this.body;
    }
}
