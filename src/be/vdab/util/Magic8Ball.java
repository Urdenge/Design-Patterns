package be.vdab.util;
public enum Magic8Ball {
    INSTANCE; 

    private String antwoord;
    private int randomGetal = 0;
    private int laatsteRandomGetal = 0;
    
//    String[] antwoorden = new String[16];
    
    String[] antwoorden = new String[]{
                        "Zoals ik het zie, ja",
                        "Het is zeker",
                        "Hoogst waarschijnlijk",
                        "Ziet er goed uit",
                        "Zonder twijfel",
                        "Ja",
                        "Zeker",
                        "Je mag er op rekenen",
                        "Vraag dit later nog eens",
                        "Dit wil je niet weten",
                        "Ik kan dit nu niet voorspellen",
                        "Concentreer je en stel je vraag opnieuw",
                        "Je moet er niet op rekenen",
                        "Nee",
                        "Ziet er niet goed uit",
                        "Zeer twijfelachtig"
                        };
    
    
    public String geefAntwoord() {
        
        while (laatsteRandomGetal == randomGetal){
            randomGetal = (int) (Math.random() * 16);
        }
        laatsteRandomGetal = randomGetal;
        
        return "Antwoord: " + antwoorden[randomGetal];
    }

    public int nummerAntwoord(){
        return randomGetal;
    }
    
}