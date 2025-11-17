// Parent class
class Animal {
    protected String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    // Method to be overridden by subclasses
    public void sound() {
        System.out.println("The animal makes a sound.");
    }
}

// Dog class extending Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public void sound() {
        System.out.println(name + " barks: Woof! Woof!");
    }
}

// Cat class extending Animal
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    
    @Override
    public void sound() {
        System.out.println(name + " meows: Meow! Meow!");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        // Create objects of different animal types
        Animal animal = new Animal("Generic Animal");
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");
        
        // Call sound method for each animal
        System.out.println("Animal sounds:");
        System.out.println("--------------");
        animal.sound();
        dog.sound();
        cat.sound();
    }
}