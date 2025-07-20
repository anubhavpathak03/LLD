package classInJava;

class A {
    void sayHello() {
        System.out.println("Hello From A");
    }
}

class B {
    void sayHi() {
        System.out.println("Hi from B");
    }
}

public class multipleClasses {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();

        objA.sayHello();
        objB.sayHi();
    }
}
