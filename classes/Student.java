package classes;

public class Student {
    private String name;
    private int id;
    private double grade;

    public Student(String name, double grade, int id){
        this.name = name;
        this.grade = grade;
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return  name;
    }
    public void setGrade(double grade){
        this.grade = grade;
    }
    public double getGrade(){
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void showInfo() {
        System.out.println("Student Info:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);
    }
    public static void main(String[] args) {
        Student std = new Student(null, 0, 0 );

        std.setGrade(5.67);
        std.setId(12873681);
        std.setName("FUCKASSNIGGA");

        std.showInfo();
    }
}
