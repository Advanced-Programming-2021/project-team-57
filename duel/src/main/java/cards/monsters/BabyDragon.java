package cards.monsters;

public class BabyDragon extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Dragon");
        monster.setLevel(3);
        monster.setAttack(1200);
        monster.setDefense(700);
        monster.setName("baby dragon");
        allCards.add(monster);

        return monster;

    }
}
