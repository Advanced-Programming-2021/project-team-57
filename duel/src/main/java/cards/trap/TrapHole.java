package cards.trap;

public class TrapHole extends Trap{
    public Trap setField(){
        Trap trap = new Trap();
        trap.setName("Trap Hole");
        trap.setType("Normal/unlimited");
        trap.setDescription("زمانͳ که حریف شما یΈ هیولا با امتیاز حمله ١٠٠٠ یا بیشتر را به صورت عادی\n" +
                "یا چرخشͳ) Flip (احضار کند، با فعال کردن این تله آن هیولا را نابود کنید.");
        allCards.add(trap);
        return trap;
    }
}
