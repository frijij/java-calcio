package lessons.java.calcio;

import java.time.LocalDate;

public class Persona {

    // ATTRIBUTI: nome ed età
private String nome;
private int eta;

private LocalDate dataDiNascita;

    // COSTRUTTORI
public Persona(String nome, int eta){
    this.nome=nome;
    this.eta= eta;
}

public Persona (String nome, LocalDate dataDiNascita){
    this.nome= nome;
    this.dataDiNascita=dataDiNascita;
}
    // GETTER E SETTER
    public String getNome() {
    return nome;
    }
    public int getEta() {
        return eta;
    }
    public LocalDate getDataDiNascita(){
    return dataDiNascita;
    }

// METODI


    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", età=" + eta +
                ", dataDiNascita=" + dataDiNascita +
                '}';
    }
}
