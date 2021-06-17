package cards.monsters;

public class TexCharger extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Cyberse/Effect");
        monster.setLevel(1);
        monster.setAttack(100);
        monster.setDefense(100);
        monster.setName("TexCharger");
        monster.setDescription("تنها ی\u038Bبار در هر نوبت، اگر این کارت مورد حمله واق  شود، حمله خنثͳ مͳ شود\n" +
                "و صاحب کارت مͳ تواند یΈ هیولای عادی (بدون قابلیت خاص) از نوع\n" +
                "Cyberse را از دست، دک و یا گورستان خود به صورت ویژه احضار کند.");
        allCards.add(monster);

        return monster;
    }
}
