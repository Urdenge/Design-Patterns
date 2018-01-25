package be.vdab;
import be.vdab.util.CompositeArbeidsKost;
import be.vdab.util.CompositeGrondstofKost;
import be.vdab.util.CompositeProject;
import java.math.BigDecimal;

public class CompositeMain {
public static void main(String[] args) {

    CompositeProject project = new CompositeProject();
    project.addKost(new CompositeGrondstofKost(
    BigDecimal.valueOf(1000), BigDecimal.valueOf(3)));
    project.addKost(new CompositeArbeidsKost(
    BigDecimal.TEN, BigDecimal.valueOf(100)));
    CompositeProject subProject = new CompositeProject();
    subProject.addKost(new CompositeGrondstofKost(
    BigDecimal.valueOf(1000), BigDecimal.valueOf(4)));
    subProject.addKost(new CompositeArbeidsKost(
    BigDecimal.TEN, BigDecimal.valueOf(200)));
    
    project.addKost(subProject);
    System.out.println(project.getBedrag());
    }
}