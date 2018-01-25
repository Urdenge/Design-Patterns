package be.vdab;

public class TechniekerMain {
public static void main(String[] args) {

    Fotokopiemachine machine = new Fotokopiemachine(123);
    Technieker technieker1 = new Technieker(1);
    Technieker technieker2 = new Technieker(2);
    machine.addObserver(technieker1);
    machine.addObserver(technieker2);
    machine.kopieer(5000);
    machine.kopieer(5000);
}
}