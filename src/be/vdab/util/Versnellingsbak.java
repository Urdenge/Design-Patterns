package be.vdab.util;

public enum Versnellingsbak {
    INSTANCE; 

    private int versnelling;
        
    public void hoger() {
        if (versnelling == Gear.VIJFDE.getGear()) {
            throw new VersnellingsException();
        }
        versnelling++;
    }
    
    public void lager() {
        if (versnelling == Gear.ACHTERUIT.getGear()) {
            throw new VersnellingsException();
        }
        versnelling--;
    }
    
}