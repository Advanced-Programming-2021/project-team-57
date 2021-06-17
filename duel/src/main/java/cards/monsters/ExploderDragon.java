package cards.monsters;

public class ExploderDragon extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Dragon/Effect");
        monster.setLevel(3);
        monster.setAttack(1000);
        monster.setDefense(0);
        monster.setName("Exploder Dragon");
        monster.setDescription("اگر این کارت در نبرد کشته شود و به گورستان منتقل شود، کارتͳ\n" +
                "را که او را نابود کرده است نابود مͳ کند و در این میان، جان\n" +
                "هیچ کدام از بازی\u038Bنان کم نخواهد شد و تنها کارت ها از بین مͳ روند.");
        allCards.add(monster);

        return monster;
    }
}
