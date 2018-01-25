package be.vdab.util;
import java.math.BigDecimal;

public class CompositeArbeidsKost implements CompositeKost {

    private BigDecimal uurloon;
    private BigDecimal aantalUren;
    public CompositeArbeidsKost(BigDecimal uurloon, BigDecimal aantalUren) {
    this.uurloon = uurloon;
    this.aantalUren = aantalUren;
    }
    
@Override
    public BigDecimal getBedrag() {
    return uurloon.multiply(aantalUren);
}
}