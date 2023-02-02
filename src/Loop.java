public class Loop {

    public static void main(String[] args) {

        char grade = 'F';
        /* dostępne dla zmiennych:
        byte, Byte
        short, Short
        int, Integer
        char, Character
        String
        enum
         */

        switch (grade) {
            case 'A':
                System.out.println("Wspaniale!");
                System.out.println("a");
                System.out.println("b");
                System.out.println("c");
                break;
            case 'B':
                System.out.println("Dobrze!");
                break;
            case 'C':
                System.out.println("Mogło by być lepiej!");
                break;
            default:
                System.out.println("Rozważ oszukiwanie!");
        }
        System.out.println("---------------------------------");

        

        if (grade =='A'){
            System.out.println("Wspaniale!");
        } else if ( grade == 'B') {
            System.out.println("Dobrze!");
        } else if ( grade == 'C') {
            System.out.println("Mogło by być lepiej!");
        } else {
            System.out.println("Rozważ oszukiwanie!");
        }

    }
}
