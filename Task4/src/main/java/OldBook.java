public class OldBook extends Book{
    private int numberOfCopies;

    public OldBook(String title, String authors, int copies) {
        super(title, authors);
        numberOfCopies = copies;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of copies: " + numberOfCopies;
    }
}
