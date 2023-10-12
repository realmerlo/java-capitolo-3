package es6;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(7, 10, formaGeometrica.rettangolo);
        Triangolo triangolo = new Triangolo(7, 9, formaGeometrica.triangolo);

        rettangolo.calcolaArea();
        triangolo.calcolaArea();

        System.out.println(rettangolo);
        System.out.println(triangolo);
    }
}

