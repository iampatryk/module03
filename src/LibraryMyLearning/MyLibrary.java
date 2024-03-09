package LibraryMyLearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyLibrary {

    private Map<String, List<MyBook>> myAuthorListMap = new HashMap<>();

    public void addMyAuthor(String myAuthor) {
        myAuthorListMap.put(myAuthor,new ArrayList<>());
    }

    public void addBookToMyAuthor(String myAuthor, MyBook myBook) {
        if(myAuthorListMap.containsKey(myAuthor)) {
            myAuthorListMap.get(myAuthor).add(myBook);
        }
    }

    List<MyBook> getBooksOfAuthor(String myAuthor) {
        if(myAuthorListMap.containsKey(myAuthor)) {
            return myAuthorListMap.get(myAuthor);
        } else {
            return new ArrayList<>();
        }
    }

    List<String> getAllAuthors() {
        return new ArrayList<>(myAuthorListMap.keySet());
    }

    List<MyBook> getAllBooks() {
        List<MyBook> allBooks = new ArrayList<>();
        for (List<MyBook> books : myAuthorListMap.values()) {
            allBooks.addAll(books);
        }
        return allBooks;
    }

    public void getAllAuthorsAndBooks() {
        Map<String, List<MyBook>> result = new HashMap<>();

        for (Map.Entry<String, List<MyBook>> entry : myAuthorListMap.entrySet()) {
            String myAuthor = entry.getKey();
            List<MyBook> myBooks = new ArrayList<>(entry.getValue());
            System.out.println("Authors: " + myAuthor.getName());
            System.out.println("Books: ");
            for (MyBook myBook : myBooks) {
                System.out.println("- " + myBook.getTitle());
            }
        }
    }
}





