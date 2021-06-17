package cards.spell;

public class AdvancedRitualArt extends Spell {
    public Spell setField() {
        Spell spell = new Spell();
        spell.setName("Advanced Ritual Art");
        spell.setType("Ritual/unlimited");
        spell.setDescription("ا این کارت مͳ توانید یΈ هیولای آیینͳ) Ritual\n" +
                "Monster (را احضار آیینͳ) Summon Ritual (کنید.\n" +
                "علاوه بر این شما باید تعدادی کارت هیولای عادی از دک\n" +
                "انتخاب کنید که مجموع سطحشان برابر با سط\u0380 کارت هیولای\n" +
                "آیینͳ که قصد احضارش را دارید باشد. سپس این کارت هارا از\n" +
                "دک به گورستان بفرستید و هیولای آیینͳ مدنظر را احضار کنید.");
        allCards.add(spell);

        return spell;
    }
}
