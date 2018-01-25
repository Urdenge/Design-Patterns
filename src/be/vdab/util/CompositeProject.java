package be.vdab.util;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CompositeProject implements CompositeKost {
    private final List<CompositeKost> kosten = new ArrayList<>();

    public void addKost(CompositeKost kost) {
    kosten.add(kost);
    }
    @Override
    public BigDecimal getBedrag() {
    BigDecimal bedrag = BigDecimal.ZERO;
    for (CompositeKost kost : kosten) {
    bedrag = bedrag.add(kost.getBedrag());
    }
    return bedrag;
    }
}