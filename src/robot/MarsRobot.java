//W klasie robot.MarsRobot zdefiniuj nową metodę checkStatus() tak, aby wyświetlała bieżący status robota. Sprawdź jak działa dodana metoda

package robot;

public class MarsRobot implements Robot {

        public String status;
        public int speed;
        public float temperature;

        public void checkTemperature() {
            if (temperature < -80) {
                status = "powrót do domu";
                speed = 5;
            }
        }

        public void showAttributes() {
            System.out.println("Status: " + status);
            System.out.println("Prędkość: " + speed);
            System.out.println("Temperatura: " + temperature);
        }

        @Override
        public void checkStatus() {
            System.out.println("status: " + status);

    }
}

