package es6;

public class Triangolo implements Forma {
    private double base;

    private double altezza;

    private formaGeometrica forma;

    public Triangolo (double base, double altezza, formaGeometrica forma){
        this.base = base;
        this.altezza = altezza;
        this.forma = forma;
    }

    @Override
    public void calcolaArea() {
        double area = base * altezza / 2;
        System.out.println("L'area del triangolo è = " + area);

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public formaGeometrica getForma() {
        return forma;
    }

    public void setForma(formaGeometrica forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "Triangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                ", forma=" + forma +
                '}';
    }
}

