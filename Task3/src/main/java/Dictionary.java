import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private String current;
    private Map<String, String> english;
    private Map<String, String> portuguese;
    private Map<String, String> french;

    public Dictionary() {
        current = "";
        english = new HashMap<String, String>();
        portuguese = new HashMap<String, String>();
        french = new HashMap<String, String>();
    }

    public void add(String language, String key, String value) {
        switch(language) {
            case "portuguese": {
                portuguese.put(key, value);
            } break;
            case "english": {
                english.put(key, value);
            } break;
            case "french": {
                french.put(key, value);
            } break;
            default: {
                System.out.println("No such language available");
            }
        }
    }

    public void setLanguage(String language) {
        if(language.compareTo("portuguese") == 0 || language.compareTo("english") == 0 || language.compareTo("french") == 0) {
            current = language;
        } else {
            System.out.println("No such language available");
        }
    }

    public String get(String key) {
        switch(current) {
            case "portuguese": {
                return portuguese.get(key);
            }
            case "english": {
                return english.get(key);
            }
            case "french": {
                return french.get(key);
            }
            default: {
                System.out.println("No such language available");
            }
            return null;
        }
    }
}
