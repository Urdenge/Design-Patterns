package be.vdab;
import java.math.BigDecimal;

public enum SpeelgoedFactory {
INSTANCE;

public Speelgoed kiesSpeelgoed(int leeftijd) {
    if (leeftijd < 6) {
        return new Pop(BigDecimal.valueOf(15));
    } else if (leeftijd < 13) {
            return new Gezelschapsspel(BigDecimal.valueOf(25));
            } else {
                return new Boekenbon(BigDecimal.valueOf(30));
}
}
}