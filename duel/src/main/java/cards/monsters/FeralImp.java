package cards.monsters;

public class FeralImp extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Fiend");
        monster.setLevel(4);
        monster.setAttack(1300);
        monster.setDefense(1400);
        monster.setName("Feral imp");
        allCards.add(monster);

        return monster;
    }
}
