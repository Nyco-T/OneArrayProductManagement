package mercatis.com;

public
class Produkt {
    protected final int    fortlaufendenummer;
    protected        String titel;
    protected        String beschreibung;

    public
    Produkt ( int fortlaufendenummer , String titel , String beschreibung ) {
        this.fortlaufendenummer = fortlaufendenummer;
        this.titel              = titel;
        this.beschreibung       = beschreibung;
    }

    public
    String getTitel ( ) {
        return titel;
    }

    public
    void setTitel ( String titel ) {
        this.titel = titel;
    }

    public
    String getBeschreibung ( ) {
        return beschreibung;
    }

    public
    void setBeschreibung ( String beschreibung ) {
        this.beschreibung = beschreibung;
    }
    public
    String toString ( ) {
        String produkt = "Titel: " + titel + "\n" + "Beschreibung: " + beschreibung ;
        return produkt;
    }

}
