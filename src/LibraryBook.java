

public class LibraryBook {

    private String bookTitle;
    private String author;
    private int page;

    public LibraryBook() {
        bookTitle = "Unknown";
        author = "Unknown";
        page = 1;
    }

    public void setBookTitle(String bookTitle1) {
        this.bookTitle = bookTitle1;
    }

    public String getBookTitle() {return bookTitle;}

    public void setAuthor(String author1) {
        this.author = author1;
    }

    public String getAuthor() {return author;}

    public void setPage(int page1) {
        if(page1>0) {
            this.page = page1;
        }
        else {
            this.page = 1;
        }
    }

    public int getPage() {return page;}

    public boolean isThick() {
        return page>500;
    }

}
