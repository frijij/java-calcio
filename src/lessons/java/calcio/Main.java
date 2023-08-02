package lessons.java.calcio;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
    definire un array di nomi e un array con i possibili ruoli per i giocatori

    generare una Squadra formata da 11 giocatori creati in modo randomico:
    prelevare un nome casuale dall’array di nomi
    generare l’età in modo casuale
    prelevare un ruolo casuale dall’array di possibili ruoli
     */

    public static void main(String[] args) {

        // creo oggetto Allenatore
        Allenatore allenatore= new Allenatore(Generatore.generaNome(),
                Generatore.generaEta(40,81), Generatore.generaStrategia());

        // creo lista dei giocatori
        List<Giocatore> listaGiocatori=new ArrayList<>();
        for (int i=0; i<11; i++){
            Giocatore giocatore = new Giocatore(Generatore.generaNome(),
                    Generatore.generaEta(18,41), Generatore.generaRuolo());
            listaGiocatori.add(giocatore);
        }

        // creo la squadra
        Squadra squadra= new Squadra(listaGiocatori, allenatore);
        System.out.println("Ecco la tua squadra: " + '\n' + squadra);

    }
}
