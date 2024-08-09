package mercatis.com;

import java.util.Objects;

public
class Notebook extends Produkt{
    private final int    speicherplatz;
    private final String prozessor;

    public
    Notebook (int fortlaufendenummer, String titel, String beschreibung, int speicherplatz , String prozessor ) {
        super(fortlaufendenummer, titel, beschreibung );
        this.speicherplatz      = speicherplatz;
        this.prozessor          = prozessor;

    }

    public
    String getProzessor ( ) {
        return prozessor;
    }

    public
    String toString ( ) {
        return "Titel: " + getTitel ( ) + "\n" + "Beschreibung: " + getBeschreibung ( ) + "\n" + "Größe des Speichers: " + speicherplatz + "\n" + "Prozessor: " + prozessor;
    }

    @Override
    public
    boolean equals ( Object object ) {
        if ( this == object ) return true;
        if ( ! ( object instanceof Notebook notebook ) ) return false;
        return speicherplatz == notebook.speicherplatz && Objects.equals ( prozessor , notebook.prozessor ) && Objects.equals ( titel , notebook.titel ) && Objects.equals ( beschreibung , notebook.beschreibung );
    }

    @Override
    public
    int hashCode ( ) {
        return Objects.hash ( speicherplatz , prozessor , titel , beschreibung );
    }
}