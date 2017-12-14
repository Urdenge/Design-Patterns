package be.vdab;

import be.vdab.util.Motor;
import be.vdab.util.VersnellingsException;
import be.vdab.util.Versnellingsbak;

public class VersnellingsbakMain {
    public static void main(String[] args) {

    try {
        Versnellingsbak.INSTANCE.hoger();
        Versnellingsbak.INSTANCE.lager();
    } catch (VersnellingsException ex) {
        System.out.println("verkeerde versnelling");
    }
    
    
    String[] antwoorden = new String[2];
    antwoorden[0] = "Blabla";
    
    for (String regel: antwoorden )
            System.out.println(regel);
    
}
}