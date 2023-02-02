//Utwórz program, który zmienia datę urodzin w formacie DD/MM/RRRR (na przykład 29/04/2016) na trzy oddzielne teksty.

package changeDate;

import java.util.StringTokenizer;

public class ChangedDate2 {

    public static void main(String[] args) {

        StringTokenizer st1, st2, st3, st4;

        String mojeUrodziny = "23/11/1992";
        String mamyUrodziny = "11/03/1965";
        String tatyUrodziny = "09/10/1965";
        String staszkaUrodziny = "04/12/1985";

        st1 = new StringTokenizer( mojeUrodziny, "/");
        System.out.println( "moje urodziny są: " + st1.nextToken() + " " + st1.nextToken() + " " +st1.nextToken() + "r.");

        st2 = new StringTokenizer( mamyUrodziny, "/");
        System.out.println( "mamy urodziny są: " + st2.nextToken() + " " + st2.nextToken() + " " +st2.nextToken() + "r.");

        st3 = new StringTokenizer( tatyUrodziny, "/");
        System.out.println( "taty urodziny są: " + st3.nextToken() + " " + st3.nextToken() + " " +st3.nextToken() + "r.");

        st4 = new StringTokenizer( staszkaUrodziny, "/");
        System.out.println( "Staszka urodziny są: " + st4.nextToken() + " " + st4.nextToken() + " " +st4.nextToken() + "r.");





    }

}
