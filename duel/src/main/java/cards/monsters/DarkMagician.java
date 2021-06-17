package cards.monsters;

public class DarkMagician extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("SpellCaster");
        monster.setLevel(7);
        monster.setAttack(2500);
        monster.setDefense(2100);
        monster.setName("dark magician");
        allCards.add(monster);

        return monster;
    }
}
