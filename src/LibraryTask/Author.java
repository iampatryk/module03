package LibraryTask;

import java.util.Objects;

public class Author implements Comparable<Author> {

    private String name;
    private int age;
    private  String favouriteGenre;

    public Author(String name, int age, String favouriteGenre) {
        this.name = name;
        this.age = age;
        this.favouriteGenre = favouriteGenre;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Author o) {
        return 0;
    }
}
