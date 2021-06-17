package cards.spell;

public class SpellAbsorption extends Spell {
    public Spell setField() {
        Spell spell = new Spell();
        spell.setName("Spell Absorption");
        spell.setType("Normal/unlimited");
        spell.setDescription("هر زمانی که یک کارت افسون فعال شد به محض اعمال شدنش 500 واحد جان دریافت کنید.");
        allCards.add(spell);
        return spell;
    }
}
