package library;

public class EBook extends Book{
    private int sizeInMb;

    public EBook() {
        super();
    }
    public EBook(String title){
        super();
        this.title=title;
    }
    public EBook(String title,String author){
        super();
        this.author=author;
    }
    public EBook(String title,String author,String isbn){
        super();
        this.author=author;
        this.title=title;
        this.isbn=isbn;
    }
    public EBook(String title,String author,String isbn,boolean isCheckout){
        super();
        this.author=author;
        this.title=title;
        this.isbn=isbn;
        this.isCheckOut=isCheckout;
    }

    public EBook(String title,String author,String isbn,boolean isCheckout,int fileSizeInMb){
        super();
        this.author=author;
        this.title=title;
        this.isbn=isbn;
        this.isCheckOut=isCheckout;
        this.sizeInMb=fileSizeInMb;
    }

    public int getSizeInMb() {
        return sizeInMb;
    }

    public void setSizeInMb(int sizeInMb) {
        this.sizeInMb = sizeInMb;
    }

    public void download(){
        System.out.println("the EBook is downloaded");
    }

    @Override
    public void display(){
        System.out.println("the title of the book is "+getTitle()+" and the author for the book is "+getAuthor()+" and the isbn of the book is " +getIsbn()+" and the filesize of the book is "+getSizeInMb());
    }
}
