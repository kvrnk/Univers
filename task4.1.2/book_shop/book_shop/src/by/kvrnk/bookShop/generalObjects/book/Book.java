package by.kvrnk.bookshop.generalobjects.book;

public class Book {

    private int id;
    private String bookName;
    private String authorName;
    private int publicationDate;
    private String description;

    public Book() {

    }

    public Book(int id, String bookName, String authorName, int publicationDate, String description) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
        this.description = description;
    }

    @Override
    public String toString() {
        String[] result =  new String[] {
                String.valueOf(id),
                bookName,
                authorName,
                String.valueOf(publicationDate),
                description
        };

        return String.join(";", result);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
