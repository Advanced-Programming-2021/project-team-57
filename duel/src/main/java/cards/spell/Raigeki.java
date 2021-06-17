package cards.spell;

public class Raigeki extends Spell {
    public Spell setField() {
        Spell spell = new Spell();
        spell.setName("Raigeki");
        spell.setType("Normal");
        spell.setDescription("تمام هیولاهایی که حریفتان کنترل میکند را نابود کنید.");
        allCards.add(spell);
        return spell;
    }
}
