public class Card {
    private float balance;
    private int number;
    private int numberOfCalls;

    public Card(int number) {
        this.balance = 0;
        this.number = number;
    }
    void calculateCall(float duration) {}

    float viewBalance() {
        return balance;
    }

    void changeBalance(float amount) {
        balance += amount;
    }

    void topUp(float amount) {
        balance += amount;
    }
    int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Card))
            return false;

        Card card = (Card)obj;

        return card.getNumber() == card.getNumber();
    }

    @Override
    public int hashCode() {
        return 7*number;
    }

    @Override
    public String toString() {
        return "Number: " + number + ", Balance: " + balance;
    }
}
