/*
Napisz aplikację z wykorzystaniem mechanizmu pakietów wg następujących wskazówek:

    stwórz trzy klasy o takiej samej nazwie PackageTester
    w każdej klasie umieść metodę wyświetlającą nazwę pakietu klasy o nazwie introduce()
    w klasie PackageTesterApp utwórz obiekty wszystkich klas i wywołaj na nich wspomnianą wyżej metodę
 */

package com.jwd;

public class PackageTesterApp {
    public static void main (String[] args) {

        com.jwd.a.PackageTester pt1 = new com.jwd.a.PackageTester();
        com.jwd.b.PackageTester pt2 = new com.jwd.b.PackageTester();
        com.jwd.c.PackageTester pt3 = new com.jwd.c.PackageTester();

        pt1.introduce();
        pt2.introduce();
        pt3.introduce();
    }
}
