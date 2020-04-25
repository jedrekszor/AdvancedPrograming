import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Document {
    private String title;
    private List<String> authorsList;
    private String text;

    public Document(String title) {
        this.title = title;
        this.authorsList = new ArrayList<String>();
    }

    public void AddAuthor(String author) {
        authorsList.add(author);
    }

    public void RemoveAuthor(String author) {
        authorsList.remove(author);
    }

    public void AddText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public int CountWords() {
        String reg = "\\b[A-Za-z0-9]*\\b";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(this.text);
        int counter = 0;
        while(m.find())
            counter++;
        return counter;
    }

    public void SetUpperCase() {
        boolean foundDot = false;
        StringBuilder builder = new StringBuilder(this.text);
        for(int i = 0; i < this.text.length(); i++) {
            if(text.charAt(i) == '.' && !foundDot) {
                foundDot = true;
            }
            else if(foundDot && text.charAt(i) != ' ') {
                String temp = Character.toString(text.charAt(i));
                builder.setCharAt(i, temp.toUpperCase().charAt(0));
                foundDot = false;
            }
        }
        text = builder.toString();
    }

    public int CountOccurences(String word) {
        String reg = "\\b" + word + "\\b";
        Pattern p = Pattern.compile(reg);
        int counter = 0;
        Matcher m = p.matcher(text);
        while (m.find()) {
            counter++;
        }
        return counter;
    }
}
