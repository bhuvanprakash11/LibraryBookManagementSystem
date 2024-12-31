package library;

public class Book {

    public Book() {
       super();
    }
    public Book(String title){
        super();
        this.title=title;
    }
    public Book(String title,String author){
        super();
        this.author=author;
    }
    public Book(String title,String author,String isbn){
        super();
        this.author=author;
        this.title=title;
        this.isbn=isbn;
    }
    public Book(String title,String author,String isbn,boolean isCheckout){
        super();
        this.author=author;
        this.title=title;
        this.isbn=isbn;
        this.isCheckOut=isCheckout;
    }



    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                '}';
    }
    @Override
    public void Display(){
        System.out.println("the title of the book is "+getTitle()+" and the author for the book is "+getAuthor()+" and the isbn of the book is " +getIsbn());
    }
}
