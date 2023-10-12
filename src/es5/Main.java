package es5;


public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(7, 10);
        Triangolo triangolo = new Triangolo(7, 9);

        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}

//Scrivere un programma che contenga una interfaccia Forma ed un metodo chiamato calcolaArea().
//Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma ed implementano il metodo per il calcolo dell'area