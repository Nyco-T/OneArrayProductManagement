package mercatis.com;

public
class Notebook extends Produkt{
    private       int    speicherplatz;
    private       String prozessor;

    public
    Notebook (int fortlaufendenummer, String titel, String beschreibung, int speicherplatz , String prozessor ) {
        super(fortlaufendenummer, titel, beschreibung );
        this.speicherplatz      = speicherplatz;
        this.prozessor          = prozessor;

    }


    public
    int getSpeicherplatz ( ) { return speicherplatz; }

    public
    void setSpeicherplatz ( int speicherplatz ) {
        this.speicherplatz = speicherplatz;
    }

    public
    String getProzessor ( ) {
        return prozessor;
    }

    public
    void setProzessor ( String prozessor ) {
        this.prozessor = prozessor;
    }

    public
    String toString ( ) {
        String notebook = "Titel: " + getTitel ( ) + "\n" + "Beschreibung: " + getBeschreibung ( ) + "\n" + "Größe des Speichers: " + speicherplatz + "\n" + "Prozessor: " + prozessor;
        return notebook;
    }

}