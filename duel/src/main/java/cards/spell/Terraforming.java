package cards.spell;

public class Terraforming extends Spell {
    public Spell setField(){
        Spell spell = new Spell();
        spell.setName("Terraforming");
        spell.setType("Normal");
        spell.setDescription("یک عدد کارت افسون میدانSpell Field را از\n" +
                "دکی که در اختیار دارید، به دست خود اضافه کنید.");
        allCards.add(spell);
        return spell;
    }
}
