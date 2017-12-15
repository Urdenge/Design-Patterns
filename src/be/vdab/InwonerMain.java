package be.vdab;

import be.vdab.util.InwonerBuilder;

public class InwonerMain {
    
public static void main(String[] args) {

    InwonerBuilder builder = new InwonerBuilder();

    Inwoner inwoner = builder.metVoornaam("Olivier")
                             .metFamilienaam("Gerard")
                             .metAantalKinderen(1)
                             .metAantalKerenVerhuisd(3)
                             .metGehuwd(true)
                             .metGescheiden(false)
                             .maakInwoner();
    
    System.out.println(inwoner);

}
}