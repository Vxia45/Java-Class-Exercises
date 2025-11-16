package fuckassclasses;

import java.util.ArrayList;

public class Pet {
    private  String name;
    private String animal;
    private String breed;
    private int age;

    public Pet(String name, String animal, String breed, int age) {
        this.name = name;
        this.animal = animal;
        this.breed = breed;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public String getAnimal() {
        return animal;
    }
    public String getBreed() {
        return breed;
    }
    public int getAge() {
        return age;
    }

    public static ArrayList<Pet> filterByAnimal(ArrayList<Pet> pets , String animal) {
        for(Pet pet : pets) {
            if(pet.getAnimal().equals(animal)) {
                System.out.println(pet);
            }
        }
        return pets;
    }
    public static ArrayList<Pet> filterByBreed(ArrayList<Pet> pets, String breed) {
        for(Pet pet : pets) {
            if(pet.getBreed().equals(breed)) {
                System.out.println(pet);
            }
        }
        return pets;
    }

    public static ArrayList<Pet> filterByAge(ArrayList<Pet> pets, int age) {
        for(Pet pet : pets) {
            if(pet.getAge()==age) {
                System.out.println(pet);
            }
        }
        return pets;
    }

    public void showInfo() {
        System.out.println("Name: " + name + " Animal: " + animal + " Breed: " + breed + " Age: " + age);
    }

    @Override
    public String toString() {
        return getName() + " " + getAnimal() + " " + getBreed() + " " + getAge();
    }
}
