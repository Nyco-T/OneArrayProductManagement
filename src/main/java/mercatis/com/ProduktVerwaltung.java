package mercatis.com;

import java.util.ArrayList;

public
class ProduktVerwaltung {

    private static  ArrayList < Produkt > produktListe = null;

    public ArrayList < Produkt > ProduktVerwaltung() {
         ArrayList < Produkt > produktListe       = new ArrayList <> ( );
         return produktListe;
    }

    public void addBook(Buch buch ){
        produktListe.add ( buch );
    }


}