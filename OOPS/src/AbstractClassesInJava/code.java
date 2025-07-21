package AbstractClassesInJava;

abstract class Animals {
    public abstract void makesound(); // abstract method

    public void sleep() {
        System.out.println("Animal is Sleeping.....");
    }
}

class Dog extends Animals {
    Dog() {
        System.out.println("Hey hey my Dog😌");
    }
    @Override
    public void makesound() {
        System.out.println("Woof!!!");
    }
}

class Cat extends Animals {
    Cat() {
        System.out.println("hey hey I don't likes Cat 🤣");
    }
    @Override
    public void makesound() {
        System.out.println("meow meow!!");
    }
}

public class code {
    public static void main(String[] args) {
        Cat myCat = new Cat();
    }
}
