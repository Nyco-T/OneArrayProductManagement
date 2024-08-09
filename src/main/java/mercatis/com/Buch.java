package mercatis.com;

import java.util.Date;
import java.util.Objects;

public
class Buch extends Produkt {
    private final String autorVorname;
    private final String autorNachname;
    private final String buchSprache;
    private final String isbn;
    private final Date   erscheinungsdatum;


    public
    Buch ( int fortlaufendenummer , String titel , String beschreibung , String autorVorname , String autorNachname , String buchSprache , String isbn , Date erscheinungsdatum ) {
        super ( fortlaufendenummer , titel , beschreibung );
        this.autorVorname      = autorVorname;
        this.autorNachname     = autorNachname;
        this.buchSprache       = buchSprache;
        this.isbn              = isbn;
        this.erscheinungsdatum = erscheinungsdatum;
    }

    public
    String getAutorVorname ( ) {
        return autorVorname;
    }

    public
    String getAutorNachname ( ) {
        return autorNachname;
    }

    public
    String getIsbn ( ) {
        return isbn;
    }

    public
    String toString ( ) {
        return "Titel: " + getTitel ( ) + "\n" + "Beschreibung: " + getBeschreibung ( ) + "\n" + "Autor: " + autorVorname + " " + autorNachname + "\n" + "Sprache: " + buchSprache + "\n" + "ISBN: " + isbn + "\n" + "Erscheinungsdatum: " + erscheinungsdatum;
    }

    @Override
    public
    boolean equals ( Object object ) {
        if ( this == object ) return true;
        if ( ! ( object instanceof Buch buch ) ) return false;
        return Objects.equals  ( isbn , buch.isbn );
    }

    @Override
    public
    int hashCode ( ) {
        return Objects.hash ( isbn );
    }


}


