package fuckassClasses;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int  age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public double getGrade(){
        return grade;
    }
    public void setGrade(double grade){
        this.grade = grade;
    }
    public void isPassing(){
        if (getGrade() >= 3.00){
            System.out.println("\nTrue");
        }else{
            System.out.println("\nFalse");
        }
    }
    public void showInfo(){
        System.out.println("Name:" + getName() + "\nAge: " + getAge() + "\nGrade: " + getGrade());
    }


    public static void main(String[] args) {
        Student stdnt = new Student("Andrey", 16 , 5.2);

        stdnt.showInfo();
        stdnt.isPassing();
    }

}
