/*Napisz program, który:

 konwertuje binarną liczbę całkowitą na postać dziesiętną,
 dane wejściowe są wprowadzane jako ciąg znaków,
 wynik powinien być zmienną typu long,
 nie korzystaj z gotowych rozwiązań.*/

package binary;

public class BinaryString {

    public static void main(String[] args) {

       String binary;
       binary = "11";

       long result = 0L;

       // 1 * 2^1 + 1 * 2^0
        // 0         1        index
        //1          1        liczba binarnie
        //1          0        odwrócony indeks czyli potęga

        for (int i = 0; i <binary.length() ; i++) {

            char c = binary.charAt(i);
            int bit = Character.getNumericValue(c);
            int reversIndex = binary.length() -i -1;

            result += bit * (long)Math.pow(2, reversIndex);


        }

        System.out.println("Binarnie " + binary + " to " + result + " dziesiętnie");

    }

}
