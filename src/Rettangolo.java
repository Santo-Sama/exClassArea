public class Rettangolo extends Forma{

    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public void calcolaArea() {
        double res = base*altezza;
        System.out.println(res);
    }
}
