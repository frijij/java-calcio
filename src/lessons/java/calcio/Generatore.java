package lessons.java.calcio;

import java.time.LocalDate;
import java.util.Random;

public class Generatore {
    // VARIABILI E METODI DI UTILITA'

    // ATTRIBUTI
    private static final String[] NOMI_COGNOMI_GIOCATORI = {
            "Marco Rossi", "Alessio Bianchi", "Lorenzo Russo", "Simone Ferrara", "Andrea Martini",
            "Luca Rossetti", "Davide Fontana", "Giovanni Ricci", "Filippo Bellini", "Nicolas De Luca",
            "Emanuele Gallo", "Matteo Rossi", "Paolo Marini", "Riccardo Leone", "Tommaso Vitale",
            "Enrico Longo", "Lorenzo Gatti", "Mattia Barbieri", "Pietro Greco", "Luigi Fiore",
            "Dario Lombardi", "Andrea Mariani", "Fabio Serra", "Stefano Ruggiero", "Davide Palumbo",
            "Nicola Lombardi", "Michele Russo", "Alessio D'Amico", "Gianluca Santoro", "Nicolas Lombardi",
            "Fabrizio Marino", "Simone Barone", "Daniele Pellegrini", "Roberto Mariani", "Andrea Rizzi",
            "Matteo Moretti", "Davide Barbieri", "Stefano Bianchi", "Pietro Marchetti", "Nicolas Santoro",
            "Marco Monti", "Giovanni Martino", "Lorenzo Galli", "Alessandro Marchetti", "Luca Coppola",
            "Davide Palmieri", "Giacomo Leone", "Matteo Santoro", "Fabrizio Marino", "Gianluca Fontana",
            "Alessandro De Angelis", "Leonardo Sorrentino", "Davide Farina", "Federico Romano",
            "Simone Rinaldi", "Francesco Esposito", "Luca Vitale", "Domenico Ferrara", "Antonio Martini",
            "Mario Rossetti", "Angelo Coppola", "Carmine Bellini", "Vincenzo Ricci", "Salvatore Greco",
            "Giovanni Marchetti", "Francesco Barbieri", "Raffaele Lombardi", "Federico Bianchi",
            "Emanuele Pellegrini", "Alessio Marino", "Stefano De Rosa", "Lorenzo Santoro",
            "Gianluca De Luca", "Alberto Monti", "Gabriele Martino", "Roberto Galli", "Matteo Ferri",
            "Alessandro Mariani", "Antonio Vitale", "Nicola Romano", "Massimo Palmieri", "Daniele Ferrari",
            "Vincenzo Greco", "Salvatore Moretti", "Davide Santoro", "Riccardo Marini", "Leonardo Fiore",
            "Angelo Ruggiero", "Carmine Sorrentino", "Emanuele Farina", "Francesco Rinaldi",
            "Luigi Esposito", "Domenico Vitale", "Antonio De Angelis", "Mario Barbieri", "Giovanni Marchetti",
            "Francesco Russo", "Raffaele Martini", "Federico Coppola", "Emanuele Bellini", "Alessio Ricci"
    };

    public static final String[] STRATEGIE = {"offensiva", "difensiva"};
    public static final String[] RUOLI = {"attaccante", "difensore", "portiere", "centrocampista"};

    // METODI
    public static String generaNome(){
        Random random = new Random();
       // int index = random.nextInt(0, NOMI_COGNOMI_GIOCATORI.length);
        String nomeRandom= NOMI_COGNOMI_GIOCATORI[random.nextInt(NOMI_COGNOMI_GIOCATORI.length)];
        return nomeRandom;
    }

    public static int generaEta(int min, int max){
        Random random = new Random();
        int etaRandom = random.nextInt(min,max);
        return etaRandom;
    }

    public static String generaRuolo(){
        Random random = new Random();
        String ruoloRandom= RUOLI[random.nextInt(RUOLI.length)];
        return ruoloRandom;
    }

    public static String generaStrategia(){
        Random random=new Random();
        String strategiaRandom= STRATEGIE[random.nextInt(STRATEGIE.length)];
        return strategiaRandom;
    }

   // generare data di nascita random
    public static LocalDate generaData(int eta){
        Random random= new Random();
        LocalDate dataRandom = LocalDate.now().minusYears(eta).minusDays(random.nextInt(-364,365));
        return dataRandom;
    }

}
