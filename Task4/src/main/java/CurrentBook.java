public class CurrentBook extends Book{
    private int isbn;
    private float price;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CurrentBook(String title, String authors, int isbn, float price) {
        super(title, authors);
        this.isbn = isbn;
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() + ", ISBN: " + isbn + ", Price: " + price;
    }
}
