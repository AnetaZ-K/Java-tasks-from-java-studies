//Zdefiniuj dowolną trójwymiarową tablicę elementów dowolnego typu i wyświetl jej zawartość w sposób przedstawiony poniżej.

package arrays;

public class Arr3D {
    public static void main(String[] args) {

        int [][][] arr = new int[3][2][3];
        arr[0][0][0] =1;
        arr[0][0][1] =2;
        arr[0][0][2] =3;
        arr[0][1][0] =5;
        arr[1][0][0] =1;
        arr[2][0][0] =6;
        arr[2][1][0] =7;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                for (int k = 0; k <arr[i][j].length ; k++) {

                   if (arr [i][j][k] > 0){;
                    System.out.println("arr[" + i +"][" + j +"][" + k + "] " + "= "+ arr[i][j][k]);
                    }
                }
            }
        }
    }
}
