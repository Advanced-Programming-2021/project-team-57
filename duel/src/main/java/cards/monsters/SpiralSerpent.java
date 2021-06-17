package cards.monsters;

public class SpiralSerpent extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("SpellCaster/Effect");
        monster.setLevel(8);
        monster.setAttack(2900);
        monster.setDefense(2900);
        monster.setName("Spiral Serpent");
        allCards.add(monster);


        return monster;
    }
}
