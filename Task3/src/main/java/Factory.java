import java.util.HashSet;
import java.util.Set;

public class Factory {
    private String name;
    private int createdProducts;
    private Set<Product> products;

    public Factory(String name) {
        this.name = name;
        createdProducts = 0;
        products = new HashSet<Product>();
    }

    public void addProduct() {
        int rand = (int) (Math.random() * 10000);
        Product p = new Product(rand);
        products.add(p);
        createdProducts++;
    }

    public Product search(int id) {
        for(Product it: products) {
            if(it.getId() == id)
                return it;
        }
        return null;
    }

    public boolean delete(int id) {
        for(Product it: products) {
            if(it.getId() == id) {
                products.remove(it);
                createdProducts--;
                return true;
            }
        }
        return false;
    }

    public void deleteFailed() {
        for(Product it: products) {
            if(it.getState().compareTo("not approved") == 0) {
                products.remove(it);
                createdProducts--;
            }
        }
    }

    public void test() {
        for(Product it: products) {
            it.test();
        }
    }

    @Override
    public String toString() {
        String result = "";
        for(Product it: products) {
            result += it.toString() + "\n";
        }
        return result;
    }
}
