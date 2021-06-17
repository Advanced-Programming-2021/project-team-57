package cards.spell;

public class UnitedWeStand extends Spell {
    public Spell setField() {
        Spell spell = new Spell();
        spell.setName("United We Stand");
        spell.setType("Equip/unlimited");
        spell.setDescription("کارت های هیولای مجهز شده (equipped (به این کارت، به\n" +
                "ازای هر هیولایی که توسط شما کنترل مͳ شود و در زمین بازی\n" +
                "به رو قرار گرفته است ٨٠٠ واحد DEF/ATK دریافت مͳ کنند.");
        allCards.add(spell);
        return spell;
    }
}
