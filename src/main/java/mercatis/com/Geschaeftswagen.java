package mercatis.com;

import java.util.Objects;

public
class Geschaeftswagen extends Produkt {
    private final int    kmStand;
    private final String parkplatz;

    public
    Geschaeftswagen (int fortlaufendenummer, String titel, String beschreibung, int kmStand , String parkplatz ) {
        super(fortlaufendenummer, titel, beschreibung );
        this.kmStand            = kmStand;
        this.parkplatz          = parkplatz;

    }

    public
    String getParkplatz ( ) {
        return parkplatz;
    }

    public
    String toString ( ) {
        return "Name: " + getTitel ( ) + "\n" + "Farbe: " + getBeschreibung ( ) + "\n" + "Kilometerstand: " + kmStand + "\n" + "Standort des Autos: " + parkplatz;
    }

    public
    boolean equals ( Object object ) {
        if ( this == object ) return true;
        if ( ! ( object instanceof Geschaeftswagen geschaeftswagen ) ) return false;
        return kmStand == geschaeftswagen.kmStand && Objects.equals ( parkplatz , geschaeftswagen.parkplatz ) && Objects.equals ( titel , geschaeftswagen.titel ) && Objects.equals ( beschreibung , geschaeftswagen.beschreibung );
    }

    public
    int hashCode ( ) {
        return Objects.hash ( kmStand , parkplatz , titel , beschreibung );
    }
}