package es5;

public class Triangolo implements Forma {
    private double base;

    private double altezza;

    public Triangolo (double base, double altezza){
        this.base = base;
        this.altezza = altezza;
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
}

