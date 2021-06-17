package cards.spell;

public class ClosedForest extends Spell {
    public Spell setField() {
        Spell spell = new Spell();
        spell.setName("closed forest");
        spell.setType("Field/unlimited");
        spell.setDescription("تمام هیولاهای Type-Beast که خودتان کنترل مͳ کنید، به ازای هر\n" +
                "هیولای موجود در گورستان، ١٠٠ واحد ATK دریافت مͳ کنند");
        allCards.add(spell);
        return spell;
    }
}
