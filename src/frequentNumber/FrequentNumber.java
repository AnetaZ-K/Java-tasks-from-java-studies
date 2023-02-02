//Napisz program, który znajdzie najczęściej występującą cyfrę w tablicy.

package frequentNumber;

public class FrequentNumber {
    public static void main(String[] args) {

        int [] arr = { 4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
        int [] counters = new int [10]; // 10, bo tyle mamy cyfr

        // 0  0  0  0  0  0  0  0  0  0
        // 0  1  2  3  4  5  6  7  8  9

        for (int i = 0; i < arr.length; i++) {
            counters[arr[i]]++;
        }
        int mostFrequent = 0;
        for (int i = 0; i < counters.length; i++) {
            if (counters[i]> counters[mostFrequent]) {
                mostFrequent = i;
            }
        }
        System.out.println(" Najczęściej występującą cyfrą w tablicy jest " + mostFrequent);
        System.out.println("i wystąpiła " + counters[mostFrequent] + " razy" );
    }

}
