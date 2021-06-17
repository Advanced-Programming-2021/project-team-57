package cards.monsters;

public class CrawlingDragon extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Dragon");
        monster.setLevel(5);
        monster.setAttack(1600);
        monster.setDefense(1400);
        monster.setName("Axe Raider");
        allCards.add(monster);

        return monster;

    }
}
