package cards.trap;

public class TimeSeal extends Trap{
    public Trap setField(){
        Trap trap = new Trap();
        trap.setName("Time seal");
        trap.setType("Normal/limited");
        trap.setDescription("حریف در نوبت بعد نمیتواند در مرحله برداشت کارتی بردارد.");
        allCards.add(trap);
        return trap;
    }
}
