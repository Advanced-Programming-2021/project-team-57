package cards.monsters;

public class AxeRaider extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Warrior");
        monster.setLevel(4);
        monster.setAttack(1700);
        monster.setDefense(1150);
        monster.setName("Axe Raider");
        allCards.add(monster);

        return monster;
    }
}
