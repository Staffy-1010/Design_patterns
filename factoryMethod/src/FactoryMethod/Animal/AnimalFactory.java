package FactoryMethod.Animal;

public abstract class AnimalFactory {
    public Animal getAnimal(){
        Animal a = createAnimal();
        return a;
    }

    public abstract Animal createAnimal();
}
