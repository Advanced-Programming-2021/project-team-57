package cards.monsters;

public class CrabTurtle extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Aqua/Ritual");
        monster.setLevel(7);
        monster.setAttack(2550);
        monster.setDefense(2500);
        monster.setName("Crab Turtle");
        monster.setDescription("قابل فراخوانی با کارت مخصوص فراخوانی آیینی");
        allCards.add(monster);


        return monster;

    }
}
