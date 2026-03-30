package Session11;

class Car {
    int currentSpeed = 0;

    // 1. Tăng tốc mặc định
    public void accelerate() {
        currentSpeed += 10;
        System.out.println("Car accelerates by default: +10 km/h");
    }

    // 2. Tăng tốc theo speed
    public void accelerate(int speed) {
        currentSpeed += speed;
        System.out.println("Car accelerates by " + speed + " km/h");
    }

    // 3. Tăng tốc theo speed và time
    public void accelerate(int speed, int seconds) {
        int increase = speed * seconds;
        currentSpeed += increase;
        System.out.println("Car accelerates " + increase + " km/h (speed x time)");
    }

    // In trạng thái
    public void printStatus() {
        System.out.println("Current speed: " + currentSpeed + " km/h");
    }
}

public class Gioi2 {
    public static void main(String[] args) {
        Car car = new Car();

        car.accelerate();
        car.printStatus();

        car.accelerate(20);
        car.printStatus();

        car.accelerate(5, 3);
        car.printStatus();
    }
}