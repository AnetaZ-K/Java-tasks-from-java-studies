package zadaniaDodatkowe;

public class Dodatkowe {

    public static void main(String[] args) {
        int a = 1*8; // 10 tzn 1*8^1 i 0*8^0 -> ósemkowy
        int b = 1*16; // 10 tzn 1*16^1 i 0*16^0 -> szesnastkowy
        int c = 1*2; // 10 tzn 1*2^1 i 0*2^0 -> dwujkowy


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("");
        System.out.println( 10 + a - b );
        System.out.println("");
        System.out.println("Wynik z obliczeń jest równy zmienej c i wynosi: " + c );
    }
}