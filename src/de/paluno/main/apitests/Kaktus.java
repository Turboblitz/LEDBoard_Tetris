package de.paluno.main.apitests;

import ledControl.BoardController;

public class Kaktus {

    private static final int LEFTMIDDLEOFBOARD = 5;
    private static final int RIGHTMIDDLEOFBOARD = LEFTMIDDLEOFBOARD + 1;
    private BoardController ledcontroller;
    private final int RED_VALUE = 0;
    private final int GREEN_VALUE = 123;
    private final int BLUE_VALUE = 0;
    private int[] fillline = {1,2,2,2,2,2,2,5,6,6,5,3};


    public Kaktus(BoardController ledcontroller) {
        this.ledcontroller = ledcontroller;
    }

    public void draw(){
        /*for (int i = 0; i < 128; i++){
            ledcontroller.updateLedStripe();
            ledcontroller.sleep(10);
        }*/
        ledcontroller.setBoardColor(127,127,127);
        for (int y = 0; y < fillline.length; y++) {
            for(int xoffset = 0;xoffset<fillline[y]; xoffset++){
                ledcontroller.setColor(LEFTMIDDLEOFBOARD - xoffset,y, RED_VALUE, GREEN_VALUE, BLUE_VALUE);
                ledcontroller.setColor(RIGHTMIDDLEOFBOARD + xoffset,y, RED_VALUE, GREEN_VALUE, BLUE_VALUE);
            }
        }
        ledcontroller.setColor(3,7, 127, 127, 127);
        ledcontroller.setColor(8,7, 127, 127, 127);
        ledcontroller.updateLedStripe();
    }
}
