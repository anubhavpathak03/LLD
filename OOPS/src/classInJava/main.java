package classInJava;

public class main {
    public static void main(String[] args) {
        // Creating an object of the Car class

        // object is an instance of class

        Car car1 = new Car("Red", "Toyota", "Corolla", 2020);
        Car car2 = new Car("Blue", "Ford", "Mustang", 2021);

        // Displaying information of each car
        car1.displayInfo();
        System.out.println("-----------------");
        car2.displayInfo();
    }
}