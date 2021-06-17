package cards.monsters;

public class FlameManipulator extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("SpellCaster");
        monster.setLevel(3);
        monster.setAttack(900);
        monster.setDefense(100);
        monster.setName("Flame Manipulator");
        allCards.add(monster);

        return monster;

    }
}
