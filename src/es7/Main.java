package es7;

public class Main {

    public static void main(String[] args) {
        MakeString newString = new MakeString("Luca Savini nuovo presidente", 5);

        System.out.println(newString.unicodeChar());
    }
}
//Scrivi un programma Java che abbia un metodo che prenda il carattere in Unicode
// in un indice specifico all'interno di una stringa e lo stampi.
//Il metodo dovrà avere nel costruttore una stringa ed una posizione
// e dovrà resituire il carattere in unicode o una stringa di errore.
//Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.