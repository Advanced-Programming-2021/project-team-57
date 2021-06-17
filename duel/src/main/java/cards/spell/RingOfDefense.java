package cards.spell;

public class RingOfDefense extends Spell{
    public Spell setField(){
        Spell spell = new Spell();
        spell.setName("Ring of defense");
        spell.setType("quick play/unlimited");
        spell.setDescription("هرگاه یک کارت تله با اثر تخریب کننده فعال شود آن آسیب به 0 میرسد.");
        allCards.add(spell);
        return spell;
    }
}
