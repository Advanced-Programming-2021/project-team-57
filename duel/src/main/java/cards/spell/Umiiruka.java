package cards.spell;

public class Umiiruka extends Spell {
    public Spell setField() {
        Spell spell = new Spell();
        spell.setName("Umiiruka");
        spell.setType("Field/unlimited");
        spell.setDescription("برای تمام کارت های هیولا از نوع Aqua به میزان ۵٠٠\n" +
                "امتیاز به ATK اضافه کرده و ۴٠٠ امتیاز از DEF کم کنید.");
        allCards.add(spell);
        return spell;
    }
}
