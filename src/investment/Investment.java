//Napisz program, który oblicza ile warta byłaby inwestycja na kwotę 14 000 zł,
// gdyby jej wartość zwiększyła się w pierwszym roku o 40%, w drugim roku zanotowała stratę w wysokości 1500 zł, a w trzecim roku zwiększyła się o 12%

package investment;

public class Investment {


    public static void main(String[] args) {

        int i0 = 14_000;

        double i1 = i0 * 1.4;

        double i2 = i1 - 1500;

        double i3 = i2 * 1.12;

        System.out.println("początkowa wartość inwestycji " + i0 + "zł");
        System.out.println("wartość inwestycji po pierwszym roku wynosi " + i1 + "zł");
        System.out.println("wartość inwestycji po drugim roku wynosi " + i2 + "zł");
        System.out.println("wartość inwestycji po trzecim roku wynosi " + i3 + "zł");





    }








}
