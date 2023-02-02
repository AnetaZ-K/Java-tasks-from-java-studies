/*
Zaprojektuj hierarchię klas tak, aby:

    klasa constructor.C dziedziczyła po klasie constructor.B, a klasa constructor.B dziedziczyła po klasie constructor.A
    instrukcja new constructor.C(); lub new constructor.B(); lub new constructor.A(); wyświetliła kolejno informacje o wywoływaniu poszczególnych konstruktorów wszystkich klas
    instrukcja new constructor.C(true); lub new constructor.B(true); lub new constructor.A(true); utworzyła konkretny obiekt nie informując o wywołaniu konstruktorów
    instrukcja new constructor.C(false); lub new constructor.B(false); lub new constructor.A(false); utworzyła konkretny obiekt informując tylko o wywołaniu “pierwszego” konstruktora (konstruktory klas bazowych milczą)

 */
package constructor;

public class ConstructorTester {
    public static void main (String[] args) {
        new C(false);
    }
}

class A {
    public A() {
        System.out.println ("Konstruktor constructor.A()");
    }
    public A(boolean isSilent) {
        if (!isSilent) {
            System.out.println ("Konstruktor constructor.A()");
        }
    }
}

class B extends A {
    public B() {
        System.out.println ("Konstruktor constructor.B()");
    }
    public B(boolean isSilent) {
        super(true);
        if (!isSilent) {
            System.out.println ("Konstruktor constructor.B()");
        }
    }
}

class C extends B {
    public C() {
        System.out.println ("Konstruktor constructor.C()");
    }
    public C(boolean isSilent) {
        super(true);
        if (!isSilent) {
            System.out.println ("Konstruktor constructor.C()");
        }
    }
}

