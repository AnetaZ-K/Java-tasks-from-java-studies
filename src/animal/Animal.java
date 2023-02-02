/*
Korzystając z mechanizmu dziedziczenia stwórz strukturę klas. Klasy Dog oraz Cat powinny dziedziczyć po klasie Animal i jednocześnie rozszerzać interfejs Voice.
 */
package animal;

public class Animal implements Voice {

    public int run;
    public String eat;
    public int voice;

    public void showAttributes() {
        System.out.println("Pożywienie: " + eat);
        System.out.println("Prędkość: " + run);
    }

    @Override
    public void checkVoice() {
        if (voice > 1) {
            System.out.println("To zwierze wydaje dzwięk w wysokości " + voice + " decybeli");

        }
    }
}
