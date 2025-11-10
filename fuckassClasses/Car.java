package fuckassClasses;

public class Car {
    private String brand;
    private int year;
    private String model;
    private String color;

    public Car(String brand, int year, String model, String color) {
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.color = color;
    }
    public String getBrand(){
        return  brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel(){
        return  model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public static void main(String[] args) {
        Car c = new Car("BWM", 2024, "M4", "Blue");


        System.out.println(c.getBrand() + " " + c.getYear() + " " + c.getModel() + " " + c.getColor());

    }

}
