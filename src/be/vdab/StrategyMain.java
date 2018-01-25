package be.vdab;

public class StrategyMain {
public static void main(String[] args) {
    Persoon[] personen=new Persoon[] {
    new Persoon("Jean", "Smits", "heer"),
    new Persoon("Jeanine", "Desmet", "mevrouw")};

    // briefhoofdingen met informele aansprekingen:
    for (Persoon persoon : personen) {
        System.out.println(persoon.maakBriefHoofding((pers) ->
        "Dag " + pers.getVoornaam()));
    }

    // briefhoofdingen met formele aansprekingen:
    for (Persoon persoon : personen) {
        System.out.println(persoon.maakBriefHoofding((pers) ->
        "Geachte " + pers.getTitel() + ' '+ pers.getFamilienaam()));
    }
    }
}