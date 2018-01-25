package be.vdab;
public class Vervoer {

public void doeEenOversteek(Vervoermiddel vervoermiddel) {
    System.out.println("Inpakken");
    vervoermiddel.vervoer();
    System.out.println("Uitpakken");
}
}