package FactoryMethod.Animal;

public class DogAnimal extends Dog{

    public Animal createAnimal() {
        return new Dog();
    }
}
