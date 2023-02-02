//Napisz wyrażenie logiczne, które sprawdza, czy dana liczba całkowita może być podzielona (bez reszty) przez 7 i 5 jednocześnie.

package dividesCompletely;

public class DividesCompletely {

    public static void main(String[] args) {

        int a;
        a = 35;
        boolean divided = (a % 5) == 0 && (a % 7) == 0;
        System.out.println( "czy liczba " + a + "dzieli się przez 5 i przez 7 jednoczesnie " + divided);





    }


}
