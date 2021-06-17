package cards.monsters;

public class SlotMachine extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Machine");
        monster.setLevel(7);
        monster.setAttack(2000);
        monster.setDefense(2300);
        monster.setName("Slot Machine");
        allCards.add(monster);

        return monster;
    }
}
