package cards.monsters;

public class Haniwa extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Rock");
        monster.setLevel(2);
        monster.setAttack(500);
        monster.setDefense(500);
        monster.setName("Haniwa");
        allCards.add(monster);

        return monster;

    }
}
