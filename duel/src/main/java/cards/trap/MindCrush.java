package cards.trap;

public class MindCrush extends Trap{
    public Trap setField(){
        Trap trap = new Trap();
        trap.setName("Mind Crush");
        trap.setType("Normal/unlimited");
        trap.setDescription("نام یΈ کارت را اعلام کنید؛ اگر آن کارت در دست حریف\n" +
                "بود، باید تمام نسخه های آن را کنار بΎذارد. در غیر این صورت\n" +
                "شما باید یΈ کارت تصادفͳ را از دستتان دور بیندازید.");
        allCards.add(trap);
        return trap;
    }
}
