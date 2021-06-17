package cards.spell;

public class PotOfGreed extends Spell {
    public Spell setField() {
        Spell spell = new Spell();
        spell.setName("Pot Of Greed");
        spell.setType("Normal");
        spell.setDescription("دو کارت از بالای دک بردارید.");
        allCards.add(spell);
        return spell;
    }
}
