import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Inventory {
    private Map<Integer, String> names;
    private Map<Integer, Integer> prices;

    public Inventory() {
        names = new HashMap<Integer, String>();
        prices = new HashMap<Integer, Integer>();
    }

    public void addProduct(String name, int id, int price) {
        names.put(id, name);
        prices.put(id, price);
    }

    public int getPrice(int id) {
        return prices.get(id);
    }

    public int getPrice(String name) {
        Iterator it = names.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if(name.compareTo((String)pair.getValue()) == 0) {
                return prices.get(pair.getKey());
            }
        }
        return 0;
    }

    public int getId(String name) {
        Iterator it = names.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if(name.compareTo((String)pair.getValue()) == 0) {
                return (int)pair.getKey();
            }
        }
        return 0;
    }

    public String getNames() {
        String result = "";
        Iterator it = names.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            result += pair.getValue() + ",\t";
        }
        return result;
    }
}