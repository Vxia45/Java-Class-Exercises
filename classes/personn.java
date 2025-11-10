package classes;

public class personn {
    private int age;
    private String name;

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        personn person = new personn();
        person.setAge(16);
        person.setName("Andrey");
        System.out.println("Name: " +person.getName() + "\nAge: " + person.getAge() );
    }
}
