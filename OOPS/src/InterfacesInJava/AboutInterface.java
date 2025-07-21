package InterfacesInJava;

import java.awt.*;

interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    double radius;
    Circle(double r) {
        this.radius = r;
        System.out.println("calculating Area of circle ⭕️");
    };
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square implements Shape {
    double side;
    Square(double side) {
        this.side = side;
        System.out.println("calculate area of square 🔳");
    };
    @Override
    public double calculateArea() {
        return side * side;
    }

}

public class AboutInterface {
    public static void main(String[] args) {
        Shape s1 = new Square(15.97);
        double ans = s1.calculateArea();
        System.out.println(ans);
    }
}
