public class Main {
    public static void main(String[] args) {

        int base = 4;
        int altezza =3;

        Rettangolo rettangolo = new Rettangolo(base,altezza);
        Triangolo triangolo = new Triangolo(base,altezza);

        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}