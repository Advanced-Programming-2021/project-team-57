package cards.spell;

public class SwordOfDarkDestruction extends Spell {
    public Spell setField() {
        Spell spell = new Spell();
        spell.setName("Sword Of Dark Destruction");
        spell.setType("Equip/unlimited");
        spell.setDescription("کارت های هیولای مجهز شده (equipped (با این کارت\n" +
                "که از نوع Fiend یا Spellcaster باشند، ۴٠٠ واحد ATK\n" +
                "دریافت مͳ کنند و ٢٠٠ واحد از DEF آن ها کم مͳ شود.");
        allCards.add(spell);
        return spell;
    }
}
