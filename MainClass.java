// final class cannot be extended
final class AnimalInfo {
    final String type = "Mammal";  // final variable cannot change
}

// Parent class
class Animal {
    String name;
    int age;

    Animal() {
        this("Unknown", 0); // using "this" to call another constructor
    }

    // Overloaded constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void speak() {
        System.out.println("Animal speaks");
    }

    // Overloaded method
    void speak(String sound) {
        System.out.println("Animal makes sound: " + sound);
    }
}

// Child class extending Animal (inheritance)
class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age); // calling parent constructor
    }

    // overriding parent method
    @Override
    void speak() {
        System.out.println(name + " barks");
    }

    void showParentSpeak() {
        super.speak(); // calling parent version
    }
}

public class MainClass {
    public static void main(String[] args) {

        Animal a = new Animal("Generic", 5);
        a.speak();
        a.speak("Roar"); // overloaded method

        Dog d = new Dog("Rex", 3);
        d.speak();       // overridden method
        d.showParentSpeak();

        AnimalInfo info = new AnimalInfo();
        System.out.println("Type: " + info.type);
    }
}
