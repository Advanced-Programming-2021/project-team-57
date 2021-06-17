package cards.spell;

public class MysticalSpaceTyphoon extends Spell{
    public Spell setField(){
        Spell spell = new Spell();
        spell.setName("Mystical Space Typhoon");
        spell.setType("quick play/unlimited");
        spell.setDescription("یک کارت افسون یا تله موجود در زمین بازی را مورد هدف قرار دتده و نابود کنید.");
        allCards.add(spell);
        return spell;
    }
}
