package lessons.java.calcio;

import java.util.List;

public class Squadra {

    // ATTRIBUTI: lista di oggetti di tipo Giocatore e un Allenatore
private List<Giocatore> listaGiocatori;
private Allenatore allenatore;

    // COSTRUTTORI
public Squadra(List<Giocatore> listaGiocatori, Allenatore allenatore){
    this.listaGiocatori = listaGiocatori;
    this.allenatore= allenatore;
}
    // GETTER E SETTER

    // METODI
    @Override
    public String toString() {
        return "Squadra{" +
                "allenatore: " + allenatore +
                ", lista giocatori: " + listaGiocatori +
                '}';
    }
}
