package cards.monsters;

public class GateGuardian extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Warrior/Effect");
        monster.setLevel(11);
        monster.setAttack(3750);
        monster.setDefense(3400);
        monster.setName("Gate Guardian");
        monster.setDescription("این هیولا را نمی توانید به صورت عادی در زمین قرار دهید اما می توانید با قربانͳ\n" +
                "کردن ٣ هیولای دلخواه در زمین، مستقیما از دست آن را احضار ویژه کنید.");
        allCards.add(monster);

        return monster;

    }
}
