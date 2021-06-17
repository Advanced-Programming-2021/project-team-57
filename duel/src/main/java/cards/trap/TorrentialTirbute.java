package cards.trap;

public class TorrentialTirbute extends Trap{
    public Trap setField(){
        Trap trap = new Trap();
        trap.setName("Torrential Tirbute");
        trap.setType("Normal/unlimited");
        trap.setDescription("زمانͳ که هیولایی احضار مͳ شود، با فعال کردن\n" +
                "این کارت تمام هیولا های زمین را نابود کنید.");
        allCards.add(trap);
        return trap;
    }
}
