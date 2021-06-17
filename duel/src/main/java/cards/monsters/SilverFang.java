package cards.monsters;

public class SilverFang extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Beast");
        monster.setLevel(3);
        monster.setAttack(1200);
        monster.setDefense(800);
        monster.setName("Silver fang");
        allCards.add(monster);

        return monster;
    }
}
