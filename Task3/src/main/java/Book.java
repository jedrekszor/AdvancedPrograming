public class Book {
    public static int globalId = 0;
    private int id;
    private String title;
    private String authors;

    public Book(String title, String authors) {
        this.title = title;
        this.authors = authors;
        id = ++globalId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Title: " + title + ", Authors: " + authors;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Book))
            return false;

        if(obj == this)
            return true;

        Book temp = (Book)obj;
        return id == temp.getId();
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + id;
        result = result * 31 + title.hashCode();
        result = result * 31 + authors.hashCode();
        return result;
    }
}
