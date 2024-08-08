package mercatis.com;

import java.util.Date;

public
class Buch extends Produkt
{
    private       String autorVorname;
    private       String autorNachname;
    private       String buchSprache;
    private       String isbn;
    private       Date   erscheinungsdatum;


    public
    Buch (int fortlaufendenummer, String titel, String beschreibung, String autorVorname , String autorNachname , String buchSprache , String isbn , Date erscheinungsdatum ) {
        super(fortlaufendenummer, titel, beschreibung );
        this.autorVorname       = autorVorname;
        this.autorNachname      = autorNachname;
        this.buchSprache        = buchSprache;
        this.isbn               = isbn;
        this.erscheinungsdatum  = erscheinungsdatum;
    }

    public
    String getAutorVorname ( ) {
        return autorVorname;
    }

    public
    void setAutorVorname ( String Avorname ) {
        this.autorVorname = autorVorname;
    }

    public
    String getAutorNachname ( ) {
        return autorNachname;
    }

    public
    void setAutorNachname ( String autorNachname ) {
        this.autorNachname = autorNachname;
    }

    public
    String getBuchSprache ( ) {
        return buchSprache;
    }

    public
    void setBuchSprache ( String buchSprache ) {
        this.buchSprache = buchSprache;
    }

    public
    String getIsbn ( ) {
        return isbn;
    }

    public
    void setIsbn ( String isbn ) {
        this.isbn = isbn;
    }

    public
    Date getErscheinungsdatum ( ) {
        return erscheinungsdatum;
    }

    public
    void setErscheinungsdatum ( Date erscheinungsdatum ) {
        this.erscheinungsdatum = erscheinungsdatum;
    }

    public
    String toString ( ) {
        String buch = "Titel: " + getTitel ( ) + "\n" + "Beschreibung: " + getBeschreibung ( ) + "\n" + "Autor: " + autorVorname + " " + autorNachname + "\n" + "Sprache: " + buchSprache + "\n" + "ISBN: " + isbn + "\n" + "Erscheinungsdatum: " + erscheinungsdatum;
        return buch;
    }


}


