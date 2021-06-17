package cards.monsters;

public class TheTricky extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("SpellCaster/Effect");
        monster.setLevel(5);
        monster.setAttack(2000);
        monster.setDefense(1200);
        monster.setName("The Tricky");
        monster.setDescription("گر این کارت در دست شما موجود باشد، مͳ توانید آن را با\n" +
                "حذف یΈ کارت از دستتان، به صورت ویژه احضار کنید.");
        allCards.add(monster);


        return monster;
    }
}
