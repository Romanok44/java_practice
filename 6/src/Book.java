public class Book implements Printable {
    String bookName;
    String bookAuthor;

    public Book(String bookName,String bookAuthor)
    {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    public void Print() {
        System.out.printf("%s (%s) \n",bookName,bookAuthor);
    }
}
