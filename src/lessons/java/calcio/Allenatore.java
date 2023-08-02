package lessons.java.calcio;

public class Allenatore extends Persona{

    // ATTRIBUTI: strategia (es: difensiva o offensiva)
    private String strategia;

    // COSTRUTTORI
public Allenatore(String nome, int eta, String strategia){
    super(nome, eta);
    this.strategia=strategia;
}
    // GETTER E SETTER
public String getStrategia(){
    return strategia;
}

    // METODI
    @Override
    public String toString() {
        return "Allenatore{" +
                "nome: '" + getNome() + '\'' +
                ", età: " + getEta() +
                ", strategia: '" + strategia + '\'' +
                '}';
    }
}
