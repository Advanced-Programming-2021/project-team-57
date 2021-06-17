package cards.monsters;

public class BlueEyesWhiteDragon extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Dragon");
        monster.setLevel(8);
        monster.setAttack(3000);
        monster.setDefense(2500);
        monster.setName("Blue-Eyes White Dragon");
        allCards.add(monster);

        return monster;

    }
}
