package cards.spell;

public class BlackPendant extends Spell {
    public Spell setField() {
        Spell spell = new Spell();
        spell.setName("Black pendant");
        spell.setType("Equip/unlimited");
        spell.setDescription("کارت های هیولای مجهز شده (equipped (با\n" +
                "این کارت، ۵٠٠ واحد ATK دریافت مͳ کنند.");
        allCards.add(spell);
        return spell;
    }
}
