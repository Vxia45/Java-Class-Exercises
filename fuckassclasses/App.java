package fuckassclasses;

import java.util.ArrayList;

public class App {
    static void main() {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Pod igoto", "Ivan Vazov", "Roman",  1893, 20.0));
        books.add(new Book("Bai Ganyo", "Aleko Konstantinov", "Putepis",  1910, 32.0));
        books.add(new Book("Tyutyun", "Dimitur Dimov", "Roman" ,1901, 19.99));
        books.add(new Book("Opulchencite na shipka", "Ivan Vazov", "Stihotvorienie" , 1885, 15.5));
        books.add(new Book("Maice si", "Hristo Botev", "Stihotvorenie",  1862, 15.5));

        System.out.println("===== All books ======");
        for (Book book : books) {
            book.showInfo();
        }

        System.out.println("\n===== Filtered by title ======");
        Book.filterByTitle(books, "Pod igoto", "Ivan Vazov");

        System.out.println("\n===== Filtered by author ======");
        Book.filterByAuthor(books, "Ivan Vazov");

        System.out.println("\n===== Filtered by genre ======");
        Book.filterByGenre(books, "Roman");

        System.out.println("\n===== Filtered by price======");
        Book.filterByPrice(books, 15.5);
    }
}
