package be.vdab;
import java.math.BigDecimal;

public class ObservableMain {
public static void main(String[] args) {
    Aandeel aandeel = new Aandeel("ORCL");
    Aandeelhouder larry = new Aandeelhouder("Larry");
    Aandeelhouder james = new Aandeelhouder("james");
    Aandeelhouder morris = new Aandeelhouder("Morris");
    Aandeelhouder epke = new Aandeelhouder("Epke");
    aandeel.addObserver(larry);
    aandeel.addObserver(james);
    aandeel.addObserver(morris);
    aandeel.addObserver(epke);
    aandeel.setKoers(BigDecimal.valueOf(39));
    System.out.println();
    aandeel.deleteObserver(james);
    aandeel.setKoers(BigDecimal.valueOf(40));
    System.out.println();
    aandeel.setKoers(BigDecimal.valueOf(100));
    System.out.println();
}
}