package LibraryMyLearning;

public class MyBook implements Comparable<MyBook> {
    String title;
    String genre;
    int numberOfPages;

    public MyBook (String title, String genre, int numberOfPages) {
        this.title = title;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(MyBook o) {

        return Integer.compare(this.numberOfPages, o.getNumberOfPages());
    }
}
