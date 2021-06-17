package cards.spell;

public class Forest extends Spell {
    public Spell setField() {
        Spell spell = new Spell();
        spell.setName("Forest");
        spell.setType("Field/unlimited");
        spell.setDescription("تمام هیولاهای موجود در زمین بازی که از نوع beast/beast-warrior/Insect هستند 200 واحد ATK/DEF دریات میکنند.");
        allCards.add(spell);
        return spell;
    }
}
