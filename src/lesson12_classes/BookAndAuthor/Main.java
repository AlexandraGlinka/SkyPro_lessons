package lesson12_classes.BookAndAuthor;

import lesson12_classes.BookAndAuthor.Author;
import lesson12_classes.BookAndAuthor.Book;

public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой"); // создали объект класса со свойствами
        Author rowling = new Author("Джоан", "Роулинг");

        Book warAndPeace = new Book("Война и мир", tolstoy, 1870);
        Book harryPotter = new Book("Гарри Поттер", rowling, 1997);

        System.out.println("warAndPeace.getBookName() = " + warAndPeace.getBookName());
        System.out.println("warAndPeace.getAuthorName() = " + warAndPeace.getAuthorName());
        System.out.println("warAndPeace.getPublishedYear() = " + warAndPeace.getPublishedYear());

        warAndPeace.setPublishedYear(1867);

        System.out.println("warAndPeace.getPublishedYear() = " + warAndPeace.getPublishedYear());

        System.out.println();

        System.out.println("harryPotter.getBookName() = " + harryPotter.getBookName());
        System.out.println("harryPotter.getAuthorName() = " + harryPotter.getAuthorName());
        System.out.println("harryPotter.getPublishedYear() = " + harryPotter.getPublishedYear());

    }
}
