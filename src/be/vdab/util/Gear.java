package be.vdab.util;


public enum Gear {
    
    EERSTE(1), TWEEDE(2), DERDE(3), VIERDE(4), VIJFDE(5), VRIJ(0), ACHTERUIT(-1);
    
    private final int schakelstand;

    Gear(int schakelstand) {
        this.schakelstand = schakelstand;
    }

    public int getGear() {
        return schakelstand;
    }
}
