package cards.spell;

public class ChangeOfHeart extends Spell {
    public Spell setField() {
        Spell spell = new Spell();
        spell.setName("Change Of Heart");
        spell.setType("Normal");
        spell.setDescription("ی\u038Bͳ از هیولاهایی که حریفتان کنترل مͳ کند را مورد هدف قرار\n" +
                "دهید و تا انتهای این نوبت از بازی آن را به کنترل خود درآورید.");
        allCards.add(spell);
        return spell;
    }
}
