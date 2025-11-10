package classes;

public class Rectangle {
    private double width;
    private double height;
    private double lenght;

    public Rectangle(double width, double height, double lenght){
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void setLenght(double lenght){
        this.lenght = lenght;
    }

    public double getLenght(){
        return lenght;
    }

    public double getArea(){
        return lenght * width;
    }

    public double getPerimeter(){
        return 2*(lenght + width);
    }

    public double getVolume(){
        return lenght * width * height;
    }

    public void showInfo() {
        System.out.println("Rectangle info:");
        System.out.println("Length: " + lenght);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Volume: " + getVolume());
    }

    public static void main(String[] args) {
    Rectangle rect = new Rectangle(10, 5,3);

    rect.setHeight(4);
    rect.setLenght(12);
    rect.setWidth(8);

    rect.showInfo();
    }

}
