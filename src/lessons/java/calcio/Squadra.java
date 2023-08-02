package lessons.java.calcio;

import java.util.ArrayList;
import java.util.List;

public class Squadra {

    // ATTRIBUTI: lista di oggetti di tipo Giocatore e un Allenatore
List<Giocatore> listaGiocatori;
Allenatore allenatore;
    // COSTRUTTORI
public Squadra(List<Giocatore> listaGiocatori, Allenatore allenatore){
    this.listaGiocatori = new ArrayList<>();
    this.allenatore= allenatore;
}
    // GETTER E SETTER
    public List<Giocatore> getListaGiocatori() {
        return listaGiocatori;
    }

    public Allenatore getAllenatore(){
    return allenatore;
    }
    // METODI
public void aggiungiGiocatore(Giocatore giocatore){
    listaGiocatori.add(giocatore);
}

}
