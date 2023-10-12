package es4;

public class Rettangolo {
    private double base;

    private double altezza;

    public Rettangolo (double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }

    public void calcolaArea() {
        double area = base * altezza;
        System.out.println("L'area del rettangolo è = " + area);

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
}

