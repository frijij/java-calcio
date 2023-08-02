package lessons.java.calcio;

public class Giocatore extends Persona {
    // ATTRIBUTI: ruolo
private String ruolo;
    // COSTRUTTORI
public Giocatore(String nome, int eta, String ruolo){
    super(nome, eta);
    this.ruolo= ruolo;
}
    // GETTER E SETTER
public String getRuolo(){
    return ruolo;
}
    // METODI
    @Override
    public String toString() {
        return "Giocatore{" +
                "nome: '" + getNome() + '\'' +
                ", età: " + getEta() +
                ", ruolo: '" + ruolo + '\'' +
                '}';
    }
}
