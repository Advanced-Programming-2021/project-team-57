package cards.monsters;

public class HornImp extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Fiend");
        monster.setLevel(4);
        monster.setAttack(1300);
        monster.setDefense(1000);
        monster.setName("Horn Imp");
        allCards.add(monster);

        return monster;
    }
}
