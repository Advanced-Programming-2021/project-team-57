package cards.monsters;

public class WarriorDaiGrepher extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Warrior");
        monster.setLevel(4);
        monster.setAttack(1700);
        monster.setDefense(1600);
        monster.setName("Warrior Dai Grepher");
        allCards.add(monster);


        return monster;
    }
}
