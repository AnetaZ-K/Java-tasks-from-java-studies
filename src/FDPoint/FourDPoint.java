/*
Utwórz klasę dla czterowymiarowego punktu o nazwie FDPoint.FourDPoint, wg wytycznych:

    klasa FDPoint.FourDPoint powinna dziedziczyć po klasie Point z pakietu java.awt
    napisz statyczną metodę create(int x, int y, int z, int t) tworzącą obiekt klasy FDPoint.FourDPoint
    napisz metodę show() wypisującą wszystkie współrzędne
    stwórz przykładowy 4-wymiarowy punkt i wyświetl jego współrzędne

 */

package FDPoint;

import java.awt.*;

public class FourDPoint extends Point {
    int z;
    int t;

    static FourDPoint create(int x, int y, int z, int t){
        FourDPoint fourDPoint = new FourDPoint ();
        fourDPoint.x = x;
        fourDPoint.y = y;
        fourDPoint.z = z;
        fourDPoint.t = t;

        return fourDPoint;
    }

    void show() {
        System.out.println();
        System.out.println("x wynosi " + x);
        System.out.println("y wynosi " + y);
        System.out.println("z wynosi " + z);
        System.out.println("t wynosi " + t);
    }

    public static void main (String[] args) {
        FourDPoint fourDPoint = create (1, 2, 3, 4);
        fourDPoint.show();

        FourDPoint fourDPoint2 = create (41, 42, 43, 44);
        fourDPoint2.show();

        FourDPoint fourDPoint3 = create (61, 62, 63, 64);
        fourDPoint3.show();
    }
}