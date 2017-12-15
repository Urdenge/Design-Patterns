package be.vdab;

public class Inwoner {

    private String voornaam;
    private String familienaam;
    private int aantalKinderen;
    private int aantalKeerVerhuisd;
    private boolean gehuwd;
    private boolean gescheiden;

    public Inwoner(String voornaam, String familienaam, int aantalKinderen,
                   int aantalKeerVerhuisd, boolean gehuwd, boolean gescheiden) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.aantalKinderen = aantalKinderen;
        this.aantalKeerVerhuisd = aantalKeerVerhuisd;
        this.gehuwd = gehuwd;
        this.gescheiden = gescheiden;
    }

    @Override
        public String toString() {
        return voornaam + ' ' + familienaam + "\n  Kinderen: " + aantalKinderen + "\n  Verhuisd: " + aantalKeerVerhuisd
                + " keer" + "\n  Gehuwd: " + gehuwd + "\n  Gescheiden: " + gescheiden;
    }
}