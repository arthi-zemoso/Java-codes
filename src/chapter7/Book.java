package chapter7;

public class Book {
    private String author;
    private String title;
    private String genre;
    private int numPages;
    public Book(String author,String title,String genre,int numPages)
    {
        this.author=author;
        this.genre=genre;
        this.title=title;
        this.numPages=numPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public int getNumPages() {
        return numPages;
    }
}
