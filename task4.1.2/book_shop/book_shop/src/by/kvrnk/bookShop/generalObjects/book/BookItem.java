package by.kvrnk.bookshop.generalobjects.book;

public class BookItem extends Book {

    private int parentId;
    private float price;
    private int quantity;

    public BookItem(Book book, int parentId, float price, int quantity) {
        super(book.getId(), book.getBookName(), book.getAuthorName(), book.getPublicationDate(), book.getDescription());

        this.parentId = parentId;
        this.price = price;
        this.quantity = quantity;
    }

    public BookItem(int id, String bookName, String authorName, int publicationDate, String description, int parentId, float price, int quantity) {
        super(id, bookName, authorName, publicationDate, description);

        this.parentId = parentId;
        this.price = price;
        this.quantity = quantity;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
