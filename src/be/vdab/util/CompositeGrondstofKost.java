package be.vdab.util;
import java.math.BigDecimal;

public class CompositeGrondstofKost implements CompositeKost {
    private BigDecimal eenheidsprijs;
    private BigDecimal hoeveelheid;
    
    public CompositeGrondstofKost(BigDecimal eenheidsprijs, BigDecimal hoeveelheid) {
        this.eenheidsprijs = eenheidsprijs;
        this.hoeveelheid = hoeveelheid;
    }
    
@Override
    public BigDecimal getBedrag() {
    return eenheidsprijs.multiply(hoeveelheid);
    }
}