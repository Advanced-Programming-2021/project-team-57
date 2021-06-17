package cards.spell;

public class MessengerOfPeace extends Spell {
    public Spell setField() {
        Spell spell = new Spell();
        spell.setName("Messenger Of Peace");
        spell.setType("continuous/unlimited");
        spell.setDescription("هیولا هایی که ATK معادل ١۵٠٠ یا بیشتر را دارند نمͳ توانند اقدام به\n" +
                "حمله کنند. ی\u038Bبار در هر نوبت از بازی، در طول فاز Standby به میزان\n" +
                "١٠٠ واحد از جان (LP (خود را بپردازید یا این کارت را نابود کنید.");
        allCards.add(spell);
        return spell;
    }
}
