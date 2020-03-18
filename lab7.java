
import NrTelefoniczny.*;

import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class lab7 {
    public static void main(String[] args) {
        TreeMap<NrTelefoniczny,Wpis> map = new TreeMap<NrTelefoniczny,Wpis> ();

        NrTelefoniczny tel1 = new NrTelefoniczny(48, 226952900);
        Adres adres1 = new Adres("wiejska", 10, "Warszawa", "00-902");
        Osoba andrzej = new Osoba("Andrzej", "Duda", adres1, tel1);

        NrTelefoniczny tel2 = new NrTelefoniczny(48, 793101123);
        Adres adres2 = new Adres("Rynek", 10, "Piotrków Trybunalski", "97-300");
        Osoba antek = new Osoba("Antoni", "Macierewicz", adres2, tel2);

        NrTelefoniczny tel3 = new NrTelefoniczny(48, 111222333);
        Adres adres3 = new Adres("Bohdana Stefanowskiego", 18, "Łódź", "90-001");
        Firma firma1 = new Firma("Weeia", adres3, tel3);

        NrTelefoniczny tel4 = new NrTelefoniczny(48, 426313603);
        Adres adres4 = new Adres("Wólczańska", 215, "Łódź", "90-924");
        Firma firma2 = new Firma("Ftims", adres4, tel4);
        // map.put(firma1.nrTel,firma1);
        map.put(antek.nrTel, antek);
        map.put(andrzej.nrTel, andrzej);
        map.put(firma1.nrTel, firma1);
        map.put(firma2.nrTel, firma2);
        
        
        Set <Entry<NrTelefoniczny,Wpis>> entrySet = map.entrySet();
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();
            System.out.println("Klucz:   " + me.getKey());
            System.out.println("Wartosc: " + me.getValue());
            System.out.println("\n");
        }
    }
    
}