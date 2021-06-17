package cards.monsters;

public class Terratiger extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Warrior/Effect");
        monster.setLevel(4);
        monster.setAttack(1800);
        monster.setDefense(1200);
        monster.setName("Terratiger, the Empower Warrior");
   monster.setDescription("زمانͳ که این کارت به صورت عادی احضار شده باشد، صاحب کارت مͳ تواند از\n" +
           "دستش یΈ هیولای عادی سط\u0380 ۴ یا پایین تر را در حالت تدافعͳ احضار کند.");
        allCards.add(monster);

        return monster;
    }
}
