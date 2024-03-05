package LibraryMyLearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyLibrary {

    Map<MyAuthor, List<MyBook>> myAuthorListMap = new HashMap<>();

    void addMyAuthor(MyAuthor myAuthor) {
        myAuthorListMap.putIfAbsent(myAuthor,new ArrayList<>());
    }

    void addBookToMyAuthor(MyAuthor myAuthor, MyBook myBook) {
        if(myAuthorListMap.containsKey(myAuthor)) {
            myAuthorListMap.get(myAuthor).add(myBook);
        }
    }

    List<MyBook> getBooksOfAuthor(MyAuthor myAuthor) {
        return myAuthorListMap.getOrDefault(myAuthor, new ArrayList<>());
    }

    List<MyAuthor> getAllAuthors() {
        return new ArrayList<>(myAuthorListMap.keySet());
    }

    List<MyBook> getAllBooks() {
        List<MyBook> allBooks = new ArrayList<>();
        for (List<MyBook> books : myAuthorListMap.values()) {
            allBooks.addAll(books);
        }
        return allBooks;
    }

    void getAllAuthorsAndBooks() {
        Map<MyAuthor, List<MyBook>> result = new HashMap<>();

        for (Map.Entry<MyAuthor, List<MyBook>> entry : myAuthorListMap.entrySet()) {
            MyAuthor myAuthor = entry.getKey();
            List<MyBook> myBooks = new ArrayList<>(entry.getValue());
            System.out.println("Authors: " + myAuthor.getName());
            System.out.println("Books: ");
            for (MyBook myBook : myBooks) {
                System.out.println("- " + myBook.getTitle());
            }
        }
    }
}




// pamietac o zmianie Stringa na MyAuthor gdyby nie dzialalo ale zobaczymy ...

