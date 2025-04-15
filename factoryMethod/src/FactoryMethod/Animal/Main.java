package FactoryMethod.Animal;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animal = new CatAnimal();
        Animal a = animal.getAnimal();
        a.speak();
    }
}