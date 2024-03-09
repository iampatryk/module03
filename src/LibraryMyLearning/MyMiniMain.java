package LibraryMyLearning;

import java.util.Collections;
import java.util.List;

public class MyMiniMain {
    public static void main(java.lang.String[] args) {
        System.out.println(" ----- LIBRARY ----- " + "\n");

        MyLibrary myLibrary = new MyLibrary();

        String author1 = new String("J.K. Rowling",58,"Fantasy");
        String author2 = new String("J.R.R Tolkien",81,"Fantasy");
        String author3 = new String("C.S Lewis",65,"Fantasy");
        myLibrary.addMyAuthor(author1);
        myLibrary.addMyAuthor(author2);
        myLibrary.addMyAuthor(author3);

        System.out.println("===== ALL AUTHORS =====");
        List<String> authorList = myLibrary.getAllAuthors();
        for(String myAuthor : authorList) {
            System.out.println(myAuthor.name + " " + myAuthor.age + " " + myAuthor.favouriteGenre);
        }
        System.out.println("_____________________" + "\n");

        MyBook book1 = new MyBook("Wladca Pierscieni","Fantasy",656);
        MyBook book2 = new MyBook("Hobbit","Fantasy",853);
        MyBook book3 = new MyBook("Opowiesci z Narni","Fantasy",450);
        MyBook book4 = new MyBook("Harry Potter","Fantasy",763);
        MyBook book5 = new MyBook("Tytul Ksiazki","Dramat",250);
        MyBook book6 = new MyBook("Tytul Ksiazki Jeden","Romanse",233);
        myLibrary.addBookToMyAuthor(author1,book4);
        myLibrary.addBookToMyAuthor(author2,book1);
        myLibrary.addBookToMyAuthor(author2,book2);
        myLibrary.addBookToMyAuthor(author3,book3);
        myLibrary.addBookToMyAuthor(author3,book5);
        myLibrary.addBookToMyAuthor(author3,book6);

        System.out.println("===== BOOKS OF AUTHOR 1 =====");
        List<MyBook> authorBooks = myLibrary.getBooksOfAuthor(author1);
        for(MyBook myBook : authorBooks) {
            System.out.println(myBook.title + " " + myBook.genre + " " + myBook.numberOfPages);
        }
        System.out.println("_____________________" + "\n");

        System.out.println("===== BOOKS OF AUTHOR 2 =====");
        List<MyBook> authorBooks1 = myLibrary.getBooksOfAuthor(author2);
        for(MyBook myBook : authorBooks1) {
            System.out.println(myBook.title + " " + myBook.genre + " " + myBook.numberOfPages);
        }
        System.out.println("_____________________" + "\n");

        System.out.println("===== BOOKS OF AUTHOR 3 =====");
        List<MyBook> authorBooks2 = myLibrary.getBooksOfAuthor(author3);
        for(MyBook myBook : authorBooks2) {
            System.out.println(myBook.title + " " + myBook.genre + " " + myBook.numberOfPages);
        }
        System.out.println("_____________________" + "\n");

        System.out.println("===== ALL BOOKS =====");
        List<MyBook> allBooksList = myLibrary.getAllBooks();
        Collections.sort(allBooksList);
        for(MyBook myBook :allBooksList) {
            System.out.println(myBook.title + " " + myBook.genre + " " + myBook.numberOfPages);
        }
        System.out.println("_____________________" + "\n");

        System.out.println("===== ALL AUTHORS AND ALL BOOKS =====");
        myLibrary.getAllAuthorsAndBooks();

    }
}


