//napisz program w którym wyświetlosz argumenty tablicy 3-elementowej w następując sposób:
//123
//a póżniej wyświetlisz elementy tej samej tablicy odwróconej kolejności

package zadaniaDodatkowe;

public class ZadanieB {


    public static void main(String[] args) {

        int[] liczbyCalkowite = new int[3];
        liczbyCalkowite[0] = 1;
        liczbyCalkowite[1] = 2;
        liczbyCalkowite[2] = 3;



        for (int i = 0; i < liczbyCalkowite.length; i++) {
            System.out.print(liczbyCalkowite[i]);

        }
        System.out.println("");

        for (int i = 0; i < liczbyCalkowite.length; i++) {
            if (i == 0){
                System.out.print(liczbyCalkowite[2]);
            }else if (i == 1){
                System.out.print(liczbyCalkowite[1]);
            } else if (i == 2) {
                System.out.print(liczbyCalkowite[0]);
            }

        }

    }


}