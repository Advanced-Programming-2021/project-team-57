package cards.monsters;

public class HeraldOfCreation extends Monster {
    public Monster setFields() {
        Monster monster = new Monster();
        monster.setType("SpellCaster/Effect");
        monster.setLevel(4);
        monster.setAttack(1800);
        monster.setDefense(600);
        monster.setName("Herald Of Creation");
        monster.setDescription("تنها ی\u038Bبار در هر نوبت، مͳ توانید با حذف یΈ کارت از دستتان، یΈ\n" +
                "هیولای سط\u0380 ٧ و یا بالاتر را از گورستان خود به دستتان منتقل کنید.");
        allCards.add(monster);

        return monster;
    }
}
