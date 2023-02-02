package matrix;

public class mx2 {

    public static void main(String[] args) {

        int n = 5;
        System.out.println("n = " + n + "   matrix");
        System.out.println("--------------");


        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n ; j++) {

                System.out.printf("%s", j+i + "  ");


            }
            System.out.println(" " );


        }
    }
}


