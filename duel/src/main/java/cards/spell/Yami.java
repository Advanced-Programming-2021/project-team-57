package cards.spell;

public class Yami extends Spell{
    public Spell setField(){
        Spell spell = new Spell();
        spell.setName("Yami");
        spell.setType("Field/unlimited");
        spell.setDescription("تمام هیولاهای موجود در زمین بازی که از نوع Fiend و Spellcaster هستند،\n" +
                "٢٠٠ واحد DEF/ATK دریافت مͳ کنند؛ همچنین تمام هیولاهای از نوع\n" +
                "Fairy که در زمین بازی قرار دارند، ٢٠٠ واحد Def/ATK از دست مͳ دهند.");
        allCards.add(spell);
        return spell;
    }
}
