package be.vdab;

public class Coordinaat {

    private int x, y, z;
    
    public Coordinaat(int x, int y, int z) {

        this.x = x;
        this.y = y;
        this.z = z;

    }

    @Override
        public String toString() {
        return x + ", " + y + ", " + z;
        
    }



}