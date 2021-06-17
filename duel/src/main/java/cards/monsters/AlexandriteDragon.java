package cards.monsters;

public class AlexandriteDragon extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Dragon");
        monster.setLevel(4);
        monster.setAttack(2000);
        monster.setDefense(100);
        monster.setName("Alexandrite Dragon");
        allCards.add(monster);

        return monster;
    }
}
