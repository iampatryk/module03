package LibraryTask;

import java.util.Objects;

public class Book implements Comparable<Book> {

    private String title;
    private String genre;
    private int numberOfPages;

    public Book(String title, String genre, int numberOfPages) {
        this.title = title;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }


    @Override
    public int compareTo(Book o) {
        return 0;
    }
}
