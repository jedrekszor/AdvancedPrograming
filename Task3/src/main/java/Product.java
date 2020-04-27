import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
    private int id;
    private Date date;
    private String state;

    public Product(int id) {
        this.id = id;
        date = new Date();
        state = "not tested";
    }

    public String getDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return formatter.format(date);
    }

    public int getId() {
        return id;
    }

    public String getState() {
        return state;
    }

    public boolean test() {
        int rand = (int) (Math.random() * 10);
        if(rand == 0) {
            state = "approved";
            return false;
        } else {
            state = "not approved";
            return true;
        }
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Production date: " + date + ", Current state: " + state;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Product))
            return false;

        if(obj == this)
            return true;

        Product temp = (Product) obj;

        return temp.getId() == this.id;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + id;
        result = 31 * result + date.hashCode();
        result = 31 * result + state.hashCode();
        return result;
    }
}
