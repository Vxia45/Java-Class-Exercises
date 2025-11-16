package fuckassclasses;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int year;
    private double price;

    public Book(String name, String author, String genre , int year, double price) {
        this.title = name;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.year = year;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public static  ArrayList<Book> filterByTitle(ArrayList<Book> books, String title, String author){
        for(Book book : books){
            if(book.getTitle().equals(title) && book.getAuthor().equals(author)){
                System.out.println(book);
            }
        }
        return books;
    }

    public static ArrayList<Book> filterByPrice(ArrayList<Book> books, double price){
        for(Book book : books){
            if(book.getPrice() == price){
                System.out.println(book);
            }
        }
        return books;
    }
    public static ArrayList<Book> filterByAuthor(ArrayList<Book> books, String author){
        for(Book book : books){
            if(book.getAuthor().equals(author)){
                System.out.println(book);
            }
        }
        return books;
    }

    public static ArrayList<Book> filterByGenre(ArrayList<Book> books, String genre){
        for(Book book : books){
            if(book.getGenre().equals(genre)){
                System.out.println(book);
            }
        }
        return books;
    }

    public void showInfo(){
        System.out.println(this);
    }
    @Override
    public String toString(){
        return getTitle() + " " + getAuthor() + " "+ getGenre()+ " " + getYear() + " " + getPrice();
    }
}

