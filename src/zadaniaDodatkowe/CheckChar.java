// napisz program który wypisze wartość podanych znaków ASCII w systemie dziesiętnym

package zadaniaDodatkowe;

public class CheckChar {

        public static void main(String[] args) {
            showInfo('a');
            showInfo('b');
            showInfo('A');
            showInfo('ą');
        }

        public static void showInfo(char c) {
            System.out.println("Kod znaku '" + c + "' to: " + (int)c);
        }

}
