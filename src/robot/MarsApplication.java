//W metodzie main programu robot.MarsApplication dodaj kolejny obiekt klasy robot.MarsRobot o nazwie opportunity, skonfiguruj zmienne egzemplarza i wyświetl je.

package robot;

public class MarsApplication {
        public static void main(String[] arguments) {
            MarsRobot spirit = new MarsRobot();
            spirit.status = "eksploracja";
            spirit.speed = 2;
            spirit.temperature = -60;

            spirit.showAttributes();
            System.out.println("Zwiększanie prędkości do 3.");
            spirit.speed = 3;
            spirit.showAttributes();
            System.out.println("Zmiana temperatury na -90.");
            spirit.temperature = -90;
            spirit.showAttributes();
            System.out.println("Sprawdzenie temperatury.");
            spirit.checkTemperature();
            spirit.showAttributes();

            MarsRobot opportunity = new MarsRobot();
            opportunity.status = "eksploracja";
            opportunity.speed = 7;
            opportunity.temperature = 70;

            opportunity.showAttributes();
            opportunity.checkStatus();
        }

}
