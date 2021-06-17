package cards;

import java.util.ArrayList;

public class Card {
    protected String name;
    protected String description;
    protected String type;

  static protected   ArrayList<Card> allCards = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public ArrayList<Card> getAllCards() {
        return allCards;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAllCards(ArrayList<Card> allCards) {
        this.allCards = allCards;
    }
}
