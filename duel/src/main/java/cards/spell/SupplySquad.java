package cards.spell;

public class SupplySquad extends Spell {
    public Spell setField() {
        Spell spell = new Spell();
        spell.setName("Supply Squad");
        spell.setType("Normal/unlimited");
        spell.setDescription("در هر نوبت اگر حداقل ی\u038Bͳ از هیولاهایتان در نبرد یا به خاطر\n" +
                "اثر یΈ کارت نابود شود، ١ کارت از بالای دک بردارید.");
        allCards.add(spell);
        return spell;
    }
}
