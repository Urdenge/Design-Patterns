package be.vdab;

public class FactoryTestMain {

    public static void main(String[] args) {

        DocumentFactory factory=new DocumentFactory();
        Document document = factory.open("liedje.docx");
        document.printPreview();
        document.print();
    }
    
}
