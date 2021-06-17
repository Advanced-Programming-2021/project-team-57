package cards.trap;

public class MagicCylinder extends Trap{
    public Trap setField(){
        Trap trap = new Trap();
        trap.setName("Magic cylinder");
        trap.setType("Normal/unlimited");
        trap.setDescription("زمانͳ که کارت هیولای حریف، اعلام به حمله مͳ کند: هیولای مهاجم\n" +
                "را هدف قرار دهید، حمله را خنثͳ کنید و در صورت انجام موفق این\n" +
                "کار، معادل ATK هیولای حمله کننده به حریف آسیب وارد کنید.");
        allCards.add(trap);
        return trap;
    }
}
