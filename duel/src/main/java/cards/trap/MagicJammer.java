package cards.trap;

public class MagicJammer extends Trap{
    public Trap setField(){
        Trap trap = new Trap();
        trap.setName("Magic Jammer");
        trap.setType("Normal/unlimited");
        trap.setDescription("هنگامͳ که کارت افسون فعال مͳ شود، ١ کارت را از\n" +
                "دستتان دور بیندازید. فعال سازی را منتفͳ کنید و در صورت\n" +
                "انجام موفق این کار، آن کارت افسون را از بین ببرید.");
        allCards.add(trap);
        return trap;
    }
}
