package cards.monsters;

public class MirageDragon extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Dragon/Effect");
        monster.setLevel(4);
        monster.setAttack(1600);
        monster.setDefense(600);
        monster.setName("Mirage Dragon");
        monster.setDescription("زمانͳ که این کارت به رو در زمین باشد، حریف\n" +
                "نمͳ تواند هیچ کارت تله ای را فعال کند.");
        allCards.add(monster);

        return monster;
    }
}
