/*
Napisz program obliczający pole powierzchni, obwód oraz długość przekątnej dla kwadratów o następujących długościach boku: 2, 7, 11 oraz 19.
Podpowiedź: do wyznaczenia pierwiastka kwadratowego z liczby użyj metody sqrt() z klasy Math np. Math.sqrt(16);
*/

package squares;

public class Squares {

    public int bok;
    public int liczba_bokow = 4;

    public static void main(String[] arguments) {

        Squares kwadratA = new Squares();
        kwadratA.bok = 2;

        System.out.println("pole powierzchni kwadratu o długości boku " + kwadratA.bok + " wynosi " + kwadratA.bok * kwadratA.bok);
        System.out.println("obwód kwadratu o długości boku " + kwadratA.bok + " wynosi " + kwadratA.bok * kwadratA.liczba_bokow);
        System.out.println("długość przekątnej kwadratu o długości boku " + kwadratA.bok + " wynosi " + kwadratA.bok * Math.sqrt(2));


        Squares kwadratB = new Squares();
        kwadratB.bok = 7;

        System.out.println("pole powierzchni kwadratu o długości boku " + kwadratB.bok + " wynosi " + kwadratB.bok * kwadratB.bok);
        System.out.println("obwód kwadratu o długości boku " + kwadratB.bok + " wynosi " + kwadratB.bok * kwadratB.liczba_bokow);
        System.out.println("długość przekątnej kwadratu o długości boku " + kwadratB.bok + " wynosi " + kwadratB.bok * Math.sqrt(2));

        Squares kwadratC = new Squares();
        kwadratC.bok = 11;

        System.out.println("pole powierzchni kwadratu o długości boku " + kwadratC.bok + " wynosi " + kwadratC.bok * kwadratC.bok);
        System.out.println("obwód kwadratu o długości boku " + kwadratC.bok + " wynosi " + kwadratC.bok * kwadratC.liczba_bokow);
        System.out.println("długość przekątnej kwadratu o długości boku " + kwadratC.bok + " wynosi " + kwadratC.bok * Math.sqrt(2));

        Squares kwadratD = new Squares();
        kwadratD.bok = 19;

        System.out.println("pole powierzchni kwadratu o długości boku " + kwadratD.bok + " wynosi " + kwadratD.bok * kwadratD.bok);
        System.out.println("obwód kwadratu o długości boku " + kwadratD.bok + " wynosi " + kwadratD.bok * kwadratD.liczba_bokow);
        System.out.println("długość przekątnej kwadratu o długości boku " + kwadratD.bok + " wynosi " + kwadratD.bok * Math.sqrt(2));


    }







}
