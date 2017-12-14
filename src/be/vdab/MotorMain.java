package be.vdab;

import be.vdab.util.Motor;

public class MotorMain {
    public static void main(String[] args) {

        Motor.INSTANCE.start();
        stopDeAuto();
    }

    public static void stopDeAuto() {
        Motor.INSTANCE.stop();
    }
}