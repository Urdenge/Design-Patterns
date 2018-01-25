package be.vdab;
public class VervoerMain {
public static void main(String[] args) {
Vervoer vervoer = new Vervoer();
vervoer.doeEenOversteek(() -> System.out.println("Schaatsen over het ijs"));
System.out.println();
vervoer.doeEenOversteek(() -> System.out.println("Zeilen over het meer"));
}
}