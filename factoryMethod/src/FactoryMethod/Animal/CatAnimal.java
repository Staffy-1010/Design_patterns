package FactoryMethod.Animal;

public class CatAnimal extends AnimalFactory{
    public Cat createAnimal(){
        return new Cat();
    }
}
