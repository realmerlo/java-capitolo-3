package es3;

public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo(7, 4);
        Triangolo triangolo = new Triangolo(12, 8);

        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}
//A partire dal programma creato precedentemente in cui si richiedeva
// il calcolo dell'area aggiungere una ulteriore classe
// chiamata Triangolo supportando poi il calcolo dell'area per quest'ultima figura