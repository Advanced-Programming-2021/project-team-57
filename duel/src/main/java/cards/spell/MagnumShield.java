package cards.spell;

public class MagnumShield extends Spell {
    public Spell setField() {
        Spell spell = new Spell();
        spell.setName("Magnum Shield");
        spell.setType("Equip/unlimited");
        spell.setDescription("فقط هیولاهایی از نوع Warrior را مجهز مͳ کند. تاثیر این کارت با\n" +
                "توجه به حالت قرار گرفتن کارت هیولای مورد نظر در زمین بازی است:\n" +
                "اگر کارت هیولا در حالت حمله باشد: آن کارت دقیقا\n" +
                "معادل مقدار DEF خود، امتیاز ATK دریافت مͳ کند.\n" +
                "اگر کارت هیولا در حالت دفاع باشد: آن کارت دقیقا\n" +
                "معادل مقدار ATK خود، امتیاز DEF دریافت مͳ کند.");
        allCards.add(spell);
        return spell;
    }
}
