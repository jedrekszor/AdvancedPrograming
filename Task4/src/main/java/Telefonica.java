import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Telefonica {
    Set<Card> cards = new HashSet<>();

    void readCardsFromTxt(String name) {
        try {
            FileReader reader = new FileReader(name);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while((line = br.readLine()) != null) {
                String[] objects = line.split(";");
                String type = objects[0];
                switch(type) {
                    case "LittleTime": {
                        LittleTime lt = new LittleTime(Integer.parseInt(objects[1]));
                        cards.add(lt);
                    }break;
                    case "Tagarela": {
                        Tagarela tg = new Tagarela(Integer.parseInt(objects[1]));
                        cards.add(tg);
                    }break;
                    default: {
                        System.out.println("No such card");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void topUpCard(int number, float amount) {
        for(Card record: cards) {
            if(record.getNumber() == number) {
                record.topUp(amount);
                return;
            }
        }
        System.out.println("No such number");
    }

    void registerCall(int source, int destination, float duration) {
        boolean hasDestination = false;
        for(Card i: cards) {
            if(i.getNumber() == destination) {
                hasDestination = true;
            }
        }
        if(hasDestination) {
            for (Card record : cards) {
                if (record.getNumber() == source) {
                    if (record.viewBalance() > 0) {
                        record.calculateCall(duration);
                        return;
                    } else {
                        System.out.println("Not enough money");
                    }
                }
            }
            System.out.println("No such source number");
        } else {
            System.out.println("No such destination number");
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Card record: cards) {
            result += record.toString() + "\n";
        }
        return result;
    }
}
