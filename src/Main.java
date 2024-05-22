public class Main {
    public static void main(String[] args) {

        int base = 4;
        int altezza =3;

        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo();

        forma.calcolaArea(base,altezza);
        rettangolo.calcolaArea(base,altezza);
    }
}