public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

public class VariableExample {
    public static void main(String[] args) {
        // Declaration and initialization of variables
        int number = 42;
        double pi = 3.14;
        String message = "Java Programming";

        // Printing variables
        System.out.println("Number: " + number);
        System.out.println("Pi: " + pi);
        System.out.println("Message: " + message);
    }
}


public class ConditionalExample {
    public static void main(String[] args) {
        int age = 25;

        // Conditional statement
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
    }
}


// Car class, representing the blueprint for creating cars
class Car {
    // Attributes
    private String color;
    private String model;

    // Constructor to initialize the car with color and model
    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    // Method to drive the car
    public void drive() {
        System.out.println("The " + color + " " + model + " is driving.");
    }

    // Method to honk the car horn
    public void honk() {
        System.out.println("Beep beep! The " + color + " " + model + " is honking.");
    }
}

// Main class to demonstrate the Car class
public class CarExample {
    public static void main(String[] args) {
        // Creating objects (cars) using the Car class
        Car redCar = new Car("Red", "Sedan");
        Car blueCar = new Car("Blue", "SUV");

        // Using methods to perform actions on the cars
        redCar.drive();
        blueCar.honk();
    }
}
