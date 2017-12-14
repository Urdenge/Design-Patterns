package be.vdab;

public abstract class Document {

    private final String bestandsnaam;

    public Document(String bestandsnaam) {
        this.bestandsnaam = bestandsnaam;
    }

    public abstract void print();
    public abstract void printPreview();
}