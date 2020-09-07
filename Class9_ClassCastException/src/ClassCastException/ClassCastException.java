package ClassCastException;
import java.lang.Exception;


class Animal {

}

class Dog extends Animal {

}

class Lion extends Animal {

}

public class ClassCastException extends Exception{

    public static void main(String[] args) {

        Animal animalOne = new Dog(); // At runtime the instance is dog
		Dog bruno = (Dog) animalOne; // Downcasting

		Animal animalTwo = new Lion(); // At runtime the instance is animal
		Dog tommy = (Dog) animalTwo; // Downcasting

    }

}
