package frequentNumber;//Napisz program, który znajdzie najczęściej występującą cyfrę w tablicy.

public class Modal {
    public static void main(String[] args) {

        int[] number = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3 };
        int a = 0; // krotność wartości 0
        int b = 0; // krotność wartości 1
        int c = 0; // krotność wartości 2
        int d = 0; // krotność wartości 3
        int e = 0; // krotność wartości 4
        int f = 0; // krotność wartości 5
        int g = 0; // krotność wartości 6
        int h = 0; // krotność wartości 7
        int i = 0; // krotność wartości 8
        int j = 0; // krotność wartości 9


        for (int x : number) {
            //System.out.println(x);

            if (x == 0) {
                a++;
            } else if (x == 1) {
                b++;
            } else if (x == 2) {
                c++;
            } else if (x == 3) {
                d++;
            } else if (x == 4) {
                e++;
            } else if (x == 5) {
                f++;
            } else if (x == 6) {
                g++;
            } else if (x == 7) {
                h++;
            } else if (x == 8) {
                i++;
            } else if (x == 9) {
                j++;
            }

        }
        if (a > b && a > c && a > d && a > e && a > f && a > g && a > h && a > i && a > j) {
            System.out.println("Wartośćią najczęściej występującą w tablicy jest 0" +  " i powtarza się " + a + " razy");
        } else if (b > a && b > c && b > d && b > e && b > f && b > g && b > h && b > i && b > j) {
            System.out.println("Wartośćią najczęściej występującą w tablicy jest 1" +  " i powtarza się " + b + " razy");
        } else if (c > a && c > b && c > d && c > e && c > f && c > g && c > h && c > i && c > j) {
            System.out.println("Wartośćią najczęściej występującą w tablicy jest 2" +  " i powtarza się " + c + " razy");
        } else if (d > a && d > c && d > b && d > e && d > f && d > g && d > h && d > i && d > j) {
            System.out.println("Wartośćią najczęściej występującą w tablicy jest 3" +  " i powtarza się " + d + " razy");
        } else if (e > a && e > c && e > d && e > b && e > f && e > g && e > h && e > i && e > j) {
            System.out.println("Wartośćią najczęściej występującą w tablicy jest 4" +  " i powtarza się " + e + " razy");
        } else if (f > a && f > c && f > d && f > e && f > b && f > g && f > h && f > i && f > j) {
            System.out.println("Wartośćią najczęściej występującą w tablicy jest 5" +  " i powtarza się " + f + " razy");
        } else if (g > a && g > c && g > d && g > e && g > f && g > b && g > h && g > i && g > j) {
            System.out.println("Wartośćią najczęściej występującą w tablicy jest 6" +  " i powtarza się " + g + " razy");
        } else if (h > a && h > c && h > d && h > e && h > f && h > g && h > b && h > i && h > j) {
            System.out.println("Wartośćią najczęściej występującą w tablicy jest 7" +  " i powtarza się " + h + " razy");
        } else if (i > a && i > c && i > d && i > e && i > f && i > g && i > h && i > b && i > j) {
            System.out.println("Wartośćią najczęściej występującą w tablicy jest 8" +  " i powtarza się " + i + " razy");
        } else if (j > a && j > c && j > d && j > e && j > f && j > g && j > h && j > i && j > b) {
            System.out.println("Wartośćią najczęściej występującą w tablicy jest 9" + " i powtarza się " + j + " razy");

        }
       // System.out.println(a + "," + b + "," + c + "," + d + "," + e + "," + f + "," + g + "," + h + "," + i + "," + j);
    }
}
