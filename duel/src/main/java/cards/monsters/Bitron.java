package cards.monsters;

public class Bitron extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Cyberse");
        monster.setLevel(2);
        monster.setAttack(200);
        monster.setDefense(2000);
        monster.setName("Bitron");
        allCards.add(monster);

        return monster;

    }
}
