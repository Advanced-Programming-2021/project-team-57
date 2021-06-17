package cards.monsters;

public class FireYarou extends Monster {
    public Monster setFields() {
        Monster monster = new Monster();
        monster.setType("Pyro");
        monster.setLevel(4);
        monster.setAttack(1300);
        monster.setDefense(1000);
        monster.setName("Fireyarou");
        allCards.add(monster);

        return monster;
    }
}
