package cards.monsters;

public class Suijin extends Monster {



    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Aqua/Effect");
        monster.setLevel(7);
        monster.setAttack(2500);
        monster.setDefense(2400);
        monster.setName("Suijin");
        monster.setDescription("گر یک هیولا به این کارت حمله کند، می توانید امتیاز حمله آن هیولا را فقط\n" +
                "برای همان نوبت صفر کنید. (این اثر پیش از محاسبه ی آسیب انجام می شود). از\n" +
                "وقتی که این کارت به رو باشد، فقط برای یΈ بار مͳ توانید این اثر را فعال کنید.");
        allCards.add(monster);

        return monster;
    }
}
