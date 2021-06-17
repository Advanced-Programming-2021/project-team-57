package cards.trap;

public class CallOfTheHaunted extends Trap{
    public Trap setField(){
        Trap trap = new Trap();
        trap.setName("Call Of The Haunted");
        trap.setType("Normal/unlimited");
        trap.setDescription("یک کارت از گورستان خود در حالت حمله به زمین بازی احضار کنید.");
        allCards.add(trap);
        return trap;
    }
}
