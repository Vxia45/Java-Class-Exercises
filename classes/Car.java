package classes;

public class Car {
    private String model;
    private int year;
    private String brand;
    private double price;

    public Car(String brand, String model, int year, double price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void showInfo(){
        System.out.println("Brand: " + getBrand() + "\nModel: " +getModel()+"\nYear: " + getYear() + "\nPrice: " + getPrice() + " bgn");
    }

    public static void main(String[] args) {
        Car car = new Car(null, null, 0 , 0);

        car.setBrand("BMW");
        car.setModel("M3 competition");
        car.setYear(2023);
        car.setPrice(150000);

        car.showInfo();
    }

}
