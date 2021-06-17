package cards.trap;

public class MirrorForce extends Trap{
    public Trap setField(){
        Trap trap = new Trap();
        trap.setName("Mirror Force");
        trap.setType("Normal/unlimited");
        trap.setDescription("زمانͳ که هیولای حریف، اعلام حمله مͳ کند: تمام\n" +
                "هیولا های حریف را که در حالت حمله هستند نابود کنید.");
        allCards.add(trap);
        return trap;
    }
}
