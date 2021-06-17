package cards.trap;

public class SolemnWarning extends Trap{
    public Trap setField(){
        Trap trap = new Trap();
        trap.setName("Solemn Warning");
        trap.setType("Normal/unlimited");
        trap.setDescription("هنگامͳ که یΈ هیولا احضار مͳ شود، یا وقتͳ یΈ احضار ویژه\n" +
                "بر اثر افسون، تله یا اثر یΈ هیولا رخ مͳ دهد، ٢٠٠٠ واحد جان\n" +
                "(LP (پرداخت کنید؛ احضار یا فعال سازی را منتفͳ کنید، و\n" +
                "اگر این کار را با موفقیت انجام دادید، آن کارت را نابود کنید.");
        allCards.add(trap);
        return trap;
    }
}
