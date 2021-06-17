package cards.spell;

public class HarpiesFeatherDuster extends Spell{
    public Spell setField(){
        Spell spell = new Spell();
        spell.setName("Harpies Feather Duster");
        spell.setType("Normal");
       spell.setDescription("تمام کارت های افسون و تله حریفتان کنترل میکند را نابود کنید.");
        allCards.add(spell);
        return spell;
    }
}
