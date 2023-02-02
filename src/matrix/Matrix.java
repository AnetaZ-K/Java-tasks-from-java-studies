//Napisz program, który dla dowolnej liczby całkowitej n z przedziału (1 ≤ n ≤ 30) wypisuje macierz jak w poniższych przykładach. Użyj dwóch zagnieżdżonych pętli.

package matrix;

public class Matrix {

    public static void main(String[] args) {

        int n = 5;
        System.out.println("n = " + n + "   matrix");
        System.out.println("--------------");

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {

                System.out.printf( "%3s", j + i +" ");
            }
            System.out.println(" ");

        }


    }
}
