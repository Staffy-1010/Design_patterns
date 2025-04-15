package FactoryMethod.Animal;

public class CowAnimal extends AnimalFactory{
    public Cow createAnimal() {
        return new Cow();
    }
}
