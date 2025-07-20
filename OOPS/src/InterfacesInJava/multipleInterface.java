package InterfacesInJava;

interface Flyable {
    void fly();
}

interface Drivable {
    void drive();
}

class FlyingCar implements Flyable, Drivable {
    @Override
    public void fly() {
        System.out.println("Flying in the sky...");
    }
    @Override
    public void drive() {
        System.out.println("Driving on the road...");
    }
}

public class multipleInterface {
    public static void main(String[] args) {
        FlyingCar myCar = new FlyingCar();
        myCar.fly();
        myCar.drive();
    }
}
