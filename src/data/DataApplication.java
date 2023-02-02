//Utwórz klasę ze zmiennymi egzemplarza height, width, depth, będącymi liczbami całkowitymi. Utwórz aplikację, która korzysta z nowej klasy, ustawia zmienne w obiekcie a następnie je wyświetla.

package data;

public class DataApplication {

    public static void main(String[] args) {

        DataClass copy = new DataClass();
        copy.height = 215;
        copy.depth = 60;
        copy.width = 230;

        System.out.println("wysokość obiektu to: " + copy.height);
        System.out.println("głębokość obiektu to: " + copy.depth);
        System.out.println("szerokość obiektu to: " + copy.width);

    }




}
