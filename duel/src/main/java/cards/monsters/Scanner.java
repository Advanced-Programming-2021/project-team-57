package cards.monsters;

public class Scanner extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("MachineEffect");
        monster.setLevel(1);
        monster.setAttack(0);
        monster.setDefense(0);
        monster.setName("Silver fang");
        monster.setDescription("ر هر نوبت، مͳ توانید ی\u038Bͳ از هیولاهای حریف که از بازی خارج شده\n" +
                "است را انتخاب کنید تا برای آن نوبت به آن هیولا تبدیل شود. در این\n" +
                "حالت حمله و دفاع و اسم و تمامͳ خاصیت های این شخصیت تا آخر\n" +
                "همان نوبت (تا مرحله پایان) با کارت انتخاب شده حریف ی\u038Bͳ مͳ شود.");
        allCards.add(monster);

        return monster;
    }
}
