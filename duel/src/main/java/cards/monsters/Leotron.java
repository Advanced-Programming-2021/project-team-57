package cards.monsters;

public class Leotron extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Cyberse");
        monster.setLevel(4);
        monster.setAttack(2000);
        monster.setDefense(0);
        monster.setName("Leotron");
        allCards.add(monster);

        return monster;
    }
}
