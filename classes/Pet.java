package classes;

public class Pet {
    private String breed;
    private int age;
    private String name;

    public Pet(int age, String breed, String name) {
        this.breed = breed;
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Pet cat = new Pet(0, null, null);
        Pet dog = new Pet(0, null, null);

        cat.setAge(6);
        cat.setBreed("Persian");
        cat.setName("Machka");


        dog.setAge(2);
        dog.setBreed("Golden retriever");
        dog.setName("67");

        System.out.println("The name of the cat is " + cat.getName() + " and its " + cat.getAge() + " years old. She is a " + cat.getBreed() + " cat");
        System.out.println("The name of the cat is " + dog.getName() + " and its " + dog.getAge() + " years old. She is a " + dog.getBreed() + " cat");
    }

}
