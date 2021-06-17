package cards.monsters;

public class TheCalculator extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Thunder/Effect");
        monster.setLevel(2);
        monster.setAttack(0);
        monster.setDefense(0);
        monster.setName("TexCharger");
      monster.setDescription("قدرت حمله ی این کارت برابر مجموع سط\u0380 هیولا های\n" +
              "رو به بالای صاحب کارت ضربدر ٣٠٠ است.");
        allCards.add(monster);

        return monster;
    }
}
