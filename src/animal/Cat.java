package animal;

public class Cat extends Animal{

    public static void main(String[] args) {

        Animal cat = new Animal();

        int voice = 80;

        cat.run = 90;
        cat.eat = "meat";
        cat.voice = 40;


        System.out.println("Kot biegnie z prędkością " + cat.run);
        System.out.println("Kot je " + cat.eat);

        cat.checkVoice();

    }
}

