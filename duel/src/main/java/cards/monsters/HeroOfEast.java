package cards.monsters;

public class HeroOfEast extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Warrior");
        monster.setLevel(3);
        monster.setAttack(1100);
        monster.setDefense(1000);
        monster.setName("hero of east" );
        allCards.add(monster);

        return monster;

    }
}
