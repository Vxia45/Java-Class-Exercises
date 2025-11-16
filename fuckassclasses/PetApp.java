package fuckassclasses;

import java.util.ArrayList;

public class PetApp {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<Pet>();

        pets.add(new Pet("Nigga", "Dog", "German Shepherd", 3));
        pets.add(new Pet("Nigga1", "Cat", "Siamese", 1));
        pets.add(new Pet("Nigga2", "Dog", "German Shepherd", 2));
        pets.add(new Pet("Nigga3", "Cat", "British Shorthair", 3));
        pets.add(new Pet("Nigga4", "Dog", "Golden Retriever", 3));

        System.out.println("===== All pets ======");
        for (Pet pet : pets) {
            pet.showInfo();
        }
        System.out.println("\n===== Sorted by animal =====");
        Pet.filterByAnimal(pets, "Cat");

        System.out.println("\n===== Sorted by breed =====");
        Pet.filterByBreed(pets, "German Shepherd");

        System.out.println("\n===== Sorted by age =====");
        Pet.filterByAge(pets, 3);
    }
}
