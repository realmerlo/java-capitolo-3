package es4;


public class Main {
    public static void main(String[] args) {
        es4.Rettangolo rettangolo = new Rettangolo(9, 14);
        Triangolo triangolo = new Triangolo(8, 3);

        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}
