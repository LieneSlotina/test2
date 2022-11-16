package majasdarbs22;

public class Books {
    private String author;
    private int year;
    private String bookName;
    private boolean isNew;
    private String ISBN;

    public Books(String author, int year, String bookName, boolean isNew, String ISBN) {
        this.author = author;
        this.year = year;
        this.bookName = bookName;
        this.isNew = isNew;
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setisNew(boolean isNew) {
        this.isNew = isNew;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
