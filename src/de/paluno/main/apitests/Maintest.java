package de.paluno.main.apitests;

import ledControl.BoardController;

public class Maintest {

    public static void main(String[] args) {
        BoardController controller = BoardController.getBoardController();
        Kaktus penis = new Kaktus(controller);
        penis.draw();
    }
}