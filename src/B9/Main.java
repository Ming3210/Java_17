package B9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Book> library = new HashSet<>();

        library.add(new Book(2035, "Java Programming", "John Doe", 1));
        library.add(new Book(2035, "Java Programming", "John Doe", 2));
        library.add(new Book(2035, "Java Programming", "John Doe", 3));
        library.add(new Book(2035, "Java Programming", "John Doe", 4));
        library.add(new Book(2035, "Java Programming", "John Doe", 5));
        library.add(new Book(2014, "Java Programming", "John Doe", 6));

        ArrayList<Book> filteredBooks = new ArrayList<>();
        for (Book book : library) {
            if (book.getYear() > 2015) {
                filteredBooks.add(book);
            }
        }

        Collections.sort(filteredBooks, Comparator.comparing(Book::getTitle));

        System.out.println("Sách xuất bản sau 2015 (sắp xếp theo tên):");
        filteredBooks.forEach(System.out::println);
    }
}
