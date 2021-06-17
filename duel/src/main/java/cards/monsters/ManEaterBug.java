package cards.monsters;

public class ManEaterBug extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("SpellCaster");
        monster.setLevel(2);
        monster.setAttack(450);
        monster.setDefense(600);
        monster.setName("Man Eater Bug");
        monster.setDescription("هنگامی که از پشت به رو برگردد می تواند از هیولا های حریف را نابود کند");
        allCards.add(monster);

        return monster;

    }
}
