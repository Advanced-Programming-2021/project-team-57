package cards.monsters;

public class Marshmallow extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Warrior");
        monster.setLevel(3);
        monster.setAttack(300);
        monster.setDefense(500);
        monster.setName("Marshmallow");
        monster.setDescription("این کارت نمͳ تواند در نبرد عادی نابود شود. زمانͳ که به این کارت حمله\n" +
                "مͳ شود، پس از محاسبه آسیب وارد شده به صاحب کارت، اگر کارت به پشت\n" +
                "(down face (بود، از جان بازی\u038Bن حمله کننده ١٠٠٠ واحد کم خواهد شد.");
        allCards.add(monster);

        return monster;

    }
}
