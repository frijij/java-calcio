package lessons.java.calcio;

import java.time.LocalDate;

public class Giocatore extends Persona {
    // ATTRIBUTI: ruolo
private String ruolo;
    // COSTRUTTORI
public Giocatore(String nome, int eta, String ruolo){
    super(nome, eta);
    this.ruolo= ruolo;
}

public Giocatore(String nome, LocalDate dataDiNascita, String ruolo){
    super (nome, dataDiNascita);
    this.ruolo=ruolo;
}
    // GETTER E SETTER
public String getRuolo(){
    return ruolo;
}
    // METODI
   /* @Override
    public String toString() {
        return "Giocatore{" +
                "nome: '" + getNome() + '\'' +
                ", età: " + getEta() +
                ", ruolo: '" + ruolo + '\'' +
                '}';
    }*/

    @Override
    public String toString(){
    return "Giocatore{" +
            "nome: " + getNome() +
            ", data di nascita: " + getDataDiNascita() +
            ", ruolo: " + ruolo + "}";
    }
}
