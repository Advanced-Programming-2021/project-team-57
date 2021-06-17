package cards.trap;

public class NegateAttack extends Trap{
    public Trap setField(){
        Trap trap = new Trap();
        trap.setName("Negate Attack");
        trap.setType("Normal/unlimited");
        trap.setDescription("هنگامͳ که هیولای حریف حمله خود را اعلام مͳ کند، با فعال\n" +
                "کردن این کارت، حمله را خنثͳ کنید و مرحله نبرد را خاتمه دهید.");
        allCards.add(trap);
        return trap;
    }
}
