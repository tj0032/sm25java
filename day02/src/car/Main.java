package car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start Application");
        Car car = new Car();
        car.go();
        car.stop();


        Car car1 = new Car("k1", "red", 1000);
        car1.go();
        car1.stop();


        System.out.println("End Application");
    }
}
