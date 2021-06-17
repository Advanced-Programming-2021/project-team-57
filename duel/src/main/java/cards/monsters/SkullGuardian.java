package cards.monsters;

public class SkullGuardian extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Warrior/Ritual");
        monster.setLevel(7);
        monster.setAttack(2050);
        monster.setDefense(2500);
        monster.setName("Skull Guardian " );
        monster.setDescription("قابل فراخوانی با کارت مخصوص فراخوانی آیینی");
        allCards.add(monster);

        return monster;

    }
}
