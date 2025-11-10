package classes;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }


    public void showInfo(){
        System.out.println("My name is " + getName() + " and i am " + getAge() + " years old.");
    }
}

class Athlete extends Person {
    private String sport;

    public Athlete(String sport, String name, int age) {
        super(name, age);
        this.sport = sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getSport() {
        return sport;
    }

    public void showInfo1() {
        System.out.println("My name is " + getName() + " and i am " + getAge() + " years old. I do " + getSport() + " in m free time perchance?");
    }
}
class Main{
    public static void main(String[] args) {
        Person person = new Person(null, 0);
        Athlete athlete = new Athlete(null, null, 0);


        person.setName("Fuckass Xeno bro");
        person.setAge(67);

        athlete.setName("Jordan");
        athlete.setAge(54);
        athlete.setSport("Basketball");

        person.showInfo();
        athlete.showInfo1();

    }
}
