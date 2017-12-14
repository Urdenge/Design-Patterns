package be.vdab;

public class DocumentFactory {

public Document open(String bestandsnaam) {
    String extensie = bestandsnaam.substring(bestandsnaam.length() - 4);

    switch (extensie) {
        case "docx":
            return new Tekst(bestandsnaam);
        case "xlsx":
            return new Rekenblad(bestandsnaam);
        case "pptx":
            return new Presentatie(bestandsnaam);
        default:
        throw new IllegalArgumentException();
    }
}
}