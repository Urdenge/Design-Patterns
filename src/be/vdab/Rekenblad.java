package be.vdab;

public class Rekenblad extends Document {

    public Rekenblad(String bestandsnaam) {
           super(bestandsnaam);
    }

    @Override
    public void print() {
    System.out.println("een afdruk van een rekenblad");
    }
    
    @Override
    public void printPreview() {
    System.out.println("een afdrukvoorbeeld van een rekenblad");
    }
}