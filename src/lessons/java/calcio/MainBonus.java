package lessons.java.calcio;

import java.util.ArrayList;
import java.util.List;

public class MainBonus {
    public static void main(String[] args) {

        int etaAllenatore= Generatore.generaEta(40,81);
        Allenatore allenatore = new Allenatore(Generatore.generaNome(), Generatore.generaData(etaAllenatore), Generatore.generaStrategia());

        List<Giocatore> listaGiocatori = new ArrayList<>();
        for (int i=0; i<11; i++){
            int etaGiocatore= Generatore.generaEta(18,41);
            Giocatore giocatore = new Giocatore(Generatore.generaNome(), Generatore.generaData(etaGiocatore), Generatore.generaRuolo());
            listaGiocatori.add(giocatore);
        }

        Squadra squadra = new Squadra(listaGiocatori, allenatore);
        System.out.println("Ecco la tua squadra: " + squadra);


    }
}
