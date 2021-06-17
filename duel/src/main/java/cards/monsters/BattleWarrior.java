package cards.monsters;

public class BattleWarrior extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Warrior");
        monster.setLevel(3);
        monster.setAttack(700);
        monster.setDefense(1000);
        monster.setName("Battle Warrior");
        allCards.add(monster);

        return monster;

    }
}
