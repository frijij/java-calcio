package lessons.java.calcio;

import java.time.LocalDate;

public class Allenatore extends Persona{

    // ATTRIBUTI: strategia (es: difensiva o offensiva)
    private String strategia;

    // COSTRUTTORI
public Allenatore(String nome, int eta, String strategia){
    super(nome, eta);
    this.strategia=strategia;
}

public Allenatore(String nome, LocalDate dataDiNascita, String strategia){
    super(nome, dataDiNascita);
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
