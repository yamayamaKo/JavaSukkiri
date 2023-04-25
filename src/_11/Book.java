package _11;

public class Book extends TangibleAsset {
    String isbn;

    public Book(final String name, final int price, final String color, final String isbn){
        super(name, price, color);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return this.isbn;
    }
}
