package cards.monsters;

public class DarkBlade extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Warrior");
        monster.setLevel(4);
        monster.setAttack(1800);
        monster.setDefense(1500);
        monster.setName("Dark Blade");
        allCards.add(monster);

        return monster;
    }
}
