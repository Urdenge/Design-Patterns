package be.vdab;
public class SpeelgoedFactoryMain {

    public static void main(String[] args) {
        Speelgoed speelgoed = SpeelgoedFactory.INSTANCE.kiesSpeelgoed(15);
        System.out.println(speelgoed.getPrijs());
    }
}