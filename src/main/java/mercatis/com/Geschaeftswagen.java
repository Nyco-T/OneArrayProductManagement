package mercatis.com;

public
class Geschaeftswagen extends Produkt {
    private       int    kmStand;
    private       String parkplatz;

    public
    Geschaeftswagen (int fortlaufendenummer, String titel, String beschreibung, int kmStand , String parkplatz ) {
        super(fortlaufendenummer, titel, beschreibung );
        this.kmStand            = kmStand;
        this.parkplatz          = parkplatz;

    }

    public
    int getKmStand ( ) { return kmStand; }

    public
    void setKmStand ( int kmStand ) {
        this.kmStand = kmStand;
    }

    public
    String getParkplatz ( ) {
        return parkplatz;
    }

    public
    void setParkplatz ( String parkplatz ) {
        this.parkplatz = parkplatz;
    }

    public
    String toString ( ) {
        String auto = "Name: " + getTitel ( ) + "\n" + "Farbe: " + getBeschreibung ( ) + "\n" + "Kilometerstand: " + kmStand + "\n" + "Standort des Autos: " + parkplatz;
        return auto;
    }


}