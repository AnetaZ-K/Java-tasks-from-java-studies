// oblicz równanie 123 + 50 = x a następnie przedstaw je zapomocą systemu binarnego, oktalnego i heksalnego

package zadaniaDodatkowe;

public class ActionPresent {

    public static void main(String[] args) {

        int i = 123;
        int a = 50;
        int b = a + i;

        System.out.println(i + "+" + a + "=" + b);
        System.out.println(" ");
        System.out.println("binarnie");
        System.out.println(Integer.toBinaryString(123) + "+" + Integer.toBinaryString(50) + "=" + Integer.toBinaryString(b));
        System.out.println(" ");
        System.out.println("oktalnie");
        System.out.println(Integer.toOctalString(123) + "+" + Integer.toOctalString(50) + "=" + Integer.toOctalString(b));
        System.out.println(" ");
        System.out.println("heksalnie");
        System.out.println(Integer.toHexString(123) + "+" + Integer.toHexString(50) + "=" + Integer.toHexString(b));


    }

}
