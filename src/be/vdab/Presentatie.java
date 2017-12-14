package be.vdab;

public class Presentatie extends Document {

    public Presentatie(String bestandsnaam) {
           super(bestandsnaam);
    }
    
    @Override
    public void print() {
    System.out.println("een afdruk van een presentatie");
    }
    
    @Override
    public void printPreview() {
    System.out.println("een afdrukvoorbeeld van een presentatie");
    }
}