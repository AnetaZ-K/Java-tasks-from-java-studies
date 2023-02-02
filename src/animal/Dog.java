package animal;

public class Dog extends Animal {


    public static void main(String[] args) {

        Animal dog = new Animal();

        int voice = 80;

        dog.run = 60;
        dog.eat = "meat";
        dog.voice = 80;


        System.out.println("Pies biegnie z prędkością " + dog.run);
        System.out.println("Pies je " + dog.eat);

        dog.checkVoice();

    }
}

