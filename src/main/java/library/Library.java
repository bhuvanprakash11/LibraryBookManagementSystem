package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
     List<Book> books = new ArrayList<Book>();
    void addBook(Book book){
       this.books.add(book);
    }
   public void removeBook(String isbn){
       Book removeBook = null;
        for(Book book: books){
            if(isbn.equals(book.getIsbn())){
                 removeBook = book;
            }
        }
        if(removeBook!=null)
            books.remove(removeBook);
        else
            System.out.println("no such book found in the collection");
   }

   public void displayBooks(){
        if(books.isEmpty())
            System.out.println("No books in the library");
        else
        for(Book book: books){
            System.out.println(book);
        }

   }

   public ArrayList<Book> getAvailableBooks(){
        ArrayList<Book> booksAvailable = new ArrayList<Book>();
        for(Book book: books){
            if(book.isCheckedOut()==false){
                booksAvailable.add(book);
            }
        }
        return booksAvailable;
   }

}
