package cards.spell;

public class SwordOfRevealingLight extends Spell {
    public Spell setField() {
        Spell spell = new Spell();
        spell.setName("Sword Of Revealing Light");
        spell.setType("Normal/unlimited");
        spell.setDescription("س از آنکه این کارت را فعال کردید، به مدت سه نوبت حریف در زمین بازی\n" +
                "باقͳ خواهد ماند و سپس نابود مͳ شود. زمانͳ که این کارت فعال مͳ شود:\n" +
                "هیولاهای حریف که به پشت قرار دارند را به رو بچرخانید.\n" +
                "تا زمانͳ که این کارت به رو در زمین بازی قرار دارد،\n" +
                "کارت های هیولای حریف نمͳ توانند اعلام حمله کنند.");
        allCards.add(spell);
        return spell;
    }
}
