/*
Napisz program calculator.Calculator posiadający metody o nazwie add sumujące 2 lub 3 liczby typu int lub double.
 */

package calculator;

public class Calculator2 {
    public int add(int a, int b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return add(a, b) + c;
    }

    public double add ( double a, double b) {
    return   a + b;
    }

    public double add ( double a, double b, double c) {
        return add(a, b) + c ;
    }

    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();

        int result1 = calc.add(1,2);
        System.out.println("1 + 2 = " + result1);

        double result2 = calc.add(1.0, 2.3, 2.2);
        System.out.println(" 1.0 + 2.3 + 2.2 = " + result2);

        int result3 = calc.add(1, 2, 4);
        System.out.println("1 + 2 + 4 = " + result3);
    }

}
