package cards.spell;

public class MonsterReborn extends Spell{
    public Spell setField(){
        Spell spell = new Spell();
        spell.setName("Monster Reborn");
        spell.setType("Normal");
        spell.setDescription("ا این کارت شما مͳ توانید یΈ از هیولاها را از گورستان خود یا\n" +
                "حریف انتخاب کنید و آن را به صورت احضار ویژه به بازی برگردانید.");
        allCards.add(spell);
        return spell;
    }
}
