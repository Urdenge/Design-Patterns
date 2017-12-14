package be.vdab;

import be.vdab.util.Magic8Ball;

public class Magic8BallMain {

    public static void main(String[] args) {

        System.out.println("\nWin ik morgen de lotto ?");
        System.out.println(Magic8Ball.INSTANCE.geefAntwoord());
        System.out.println("\nZal het morgen regenen ?");
        System.out.println(Magic8Ball.INSTANCE.geefAntwoord());
        
    }
    
}
