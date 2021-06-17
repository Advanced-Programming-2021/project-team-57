package cards.spell;

public class TwinTwisters extends Spell {
    public Spell setField() {
        Spell spell = new Spell();
        spell.setName("TwinTwisters");
        spell.setType("quick play/unlimited");
        spell.setDescription("\u038Bͳ از کارت های دستتان را دور بریزید؛ سپس حداکثر ٢ کارت افسون\n" +
                "یا تله موجود در زمین بازی را مورد هدف قرار دهید و نابودشان کنید.");
        allCards.add(spell);
        return spell;
    }
}
