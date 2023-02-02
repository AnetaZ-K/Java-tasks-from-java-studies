package human;

public class Boy extends Human {
    @Override
    public void eat() {
        System.out.println("human.Boy is eating");
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.eat();
    }
}
