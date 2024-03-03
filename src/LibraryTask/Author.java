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

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavouriteGenre() {
        return favouriteGenre;
    }

    public void setFavouriteGenre(String favouriteGenre) {
        this.favouriteGenre = favouriteGenre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return age == author.age && Objects.equals(name, author.name) && Objects.equals(favouriteGenre, author.favouriteGenre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, favouriteGenre);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", favouriteGenre='" + favouriteGenre + '\'' +
                '}';
    }


    @Override
    public int compareTo(Author o) {
        return 0;
    }
}
