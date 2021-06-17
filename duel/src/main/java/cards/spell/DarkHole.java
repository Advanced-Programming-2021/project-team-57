package cards.spell;

public class DarkHole extends Spell {
    public Spell setField() {
        Spell spell = new Spell();
        spell.setName("Dark Hole");
        spell.setType("Normal/unlimited");
        spell.setDescription("تمام کارت های هیولای موجود در زمین بازی را نابود کنید.");
        allCards.add(spell);
        return spell;
    }
}
