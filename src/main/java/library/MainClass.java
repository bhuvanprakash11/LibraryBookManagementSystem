package library;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Library library1 = new Library();
        Book book = new Book();
        book.setIsbn("aj035");
        book.setAuthor("kuvempu");
        book.setCheckedOut(true);
        book.setTitle("negila yogi");
        Book book1 = new Book();
        book1.setIsbn("aj036");
        book1.setAuthor("dara bandre");
        book1.setCheckedOut(true);
        book1.setTitle("americadhali ondhu rathri");
        library1.addBook(book);
      //  library1.displayBooks();
        library1.addBook(book1);
       // library1.displayBooks();
      //  library1.removeBook("aj035");
       // library1.displayBooks();
       // library1.removeBook("aj036");
       // library1.displayBooks();

       List<Book> availableBooksInLibrary = library1.getAvailableBooks();

            if(availableBooksInLibrary.size()==0)
                System.out.println("no books are available");
            else{
                for (Book book2 : availableBooksInLibrary) {
                    System.out.println(book2);
                }
            }


    }
}
