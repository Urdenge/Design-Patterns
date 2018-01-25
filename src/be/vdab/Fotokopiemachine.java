package be.vdab;
import java.util.Observable;

public class Fotokopiemachine extends Observable {
    private final static int ONDERHOUD_OM_DE_PAGINAS = 5_000;
    private final long serienummer;
    private int aantalPaginasSindsLaatsteOnderhoudsbeurt;

    public Fotokopiemachine(long serienummer) {
        this.serienummer = serienummer;
    }

    public void kopieer(int paginas) {
        System.out.println(paginas + " fotokopie(s)");
        aantalPaginasSindsLaatsteOnderhoudsbeurt += paginas;
        if (aantalPaginasSindsLaatsteOnderhoudsbeurt >= ONDERHOUD_OM_DE_PAGINAS) {
            setChanged();
            notifyObservers();
        }
    }
    
    public long getSerieNummer() {
        return serienummer;
    }
    
    public void doeOnderhoud() {
        aantalPaginasSindsLaatsteOnderhoudsbeurt = 0;
    }
}