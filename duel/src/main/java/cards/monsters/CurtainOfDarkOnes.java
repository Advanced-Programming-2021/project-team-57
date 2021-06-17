package cards.monsters;

public class CurtainOfDarkOnes extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("SpellCaster");
        monster.setLevel(2);
        monster.setAttack(600);
        monster.setDefense(500);
        monster.setName("curtain of dark ones");
        allCards.add(monster);

        return monster;
    }
}
