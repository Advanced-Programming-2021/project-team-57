package cards.monsters;

public class WattailDragon extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Dragon");
        monster.setLevel(6);
        monster.setAttack(2500);
        monster.setDefense(1700);
        monster.setName("WattailDragon");
        allCards.add(monster);

        return monster;
    }
}
