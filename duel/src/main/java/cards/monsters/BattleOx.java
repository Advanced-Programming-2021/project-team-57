package cards.monsters;

public class BattleOx extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Beast-Warrior");
        monster.setLevel(4);
        monster.setAttack(1700);
        monster.setDefense(1000);
        monster.setName("Battle Ox");
        allCards.add(monster);

        return monster;
    }
}
