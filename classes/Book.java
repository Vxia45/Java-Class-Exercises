package classes;

public class Book {
    private String title;
    private String author;
    private int year;
    private String genre;
    private double price;

    public Book(String title, String author, int year, String genre, double price){
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void showInfo(){
        System.out.println("Title: " + getTitle()+ "\nAuthor: " + getAuthor() + "\nYear: " + getYear() + "\nGenre: " +getGenre()+ "\nPrice: " +getPrice());
    }

    public static void main(String[] args) {
        Book book = new Book(null, null, 0, null, 0);

        book.setTitle("Pod igoto");
        book.setAuthor("Vancho Vazov");
        book.setYear(1918);
        book.setGenre("Novel");
        book.setPrice(20);

        book.showInfo();

    }
}
