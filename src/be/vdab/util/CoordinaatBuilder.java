package be.vdab.util;

import be.vdab.Coordinaat;

public class CoordinaatBuilder {

    private int x, y, z;
    
    public CoordinaatBuilder metX(int x) {
    this.x = x;
    return this;
    }
    public CoordinaatBuilder metY(int y) {
    this.y = y;
    return this;
    }
    public CoordinaatBuilder metZ(int z) {
    this.z = z;
    return this;
    }
    
    public Coordinaat maakCoordinaat() {
    return new Coordinaat(x, y, z);
    }
}