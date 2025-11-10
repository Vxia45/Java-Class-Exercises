package fuckassClasses;

import java.util.function.DoubleFunction;

public class Pet {
    private String name;
    private int age;
    private String breed;

    public Pet(String name, int age, String breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void makeSound(){
        System.out.println("The pet makes sound: ");
    }

    static class Dog extends Pet{
        public Dog(String name, int age, String breed){
            super(name, age, breed);
        }

        @Override
        public void makeSound(){
            System.out.println(getName() + "Woof!");
        }
    }

    static class Cat extends Pet{
        public Cat(String name, int age, String breed){
            super(name, age, breed);
        }

        @Override
        public void makeSound(){
            System.out.println(getName() + "Meow!");
        }
    }
    public static void main(String[] args) {
        Pet dog = new Dog("fuckass dog", 1 , "Golden nigger");
        Pet cat = new Cat("fuckass cat", 6 , "Britanigga");

        dog.makeSound();
        cat.makeSound();
    }

}

