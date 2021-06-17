package cards.monsters;

public class YomiShip extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Aqua/Effect");
        monster.setLevel(3);
        monster.setAttack(800);
        monster.setDefense(1400);
        monster.setName("command knight");
        monster.setDescription("وقتی یک هیولا به آن حمله کند و نابودش کند، خود آن هیولا نیز نابود می شود.");
        allCards.add(monster);

        return monster;
    }
}
