package cards.monsters;

public class BestKingBarbaros extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Beast-Warrior/Effect");
        monster.setLevel(8);
        monster.setAttack(3000);
        monster.setDefense(1200);
        monster.setName("Best King Barbaros");
        monster.setDescription("مͳ توانید این کارت را بدون قربانͳ کردن دو هیولای دیΎر به\n" +
                "صورت عادی احضار کنید اما قدرت حمله ی آن به ١٩٠٠ کاهش\n" +
                "خواهد یافت. همچنین مͳ توانید این کارت را با قربانͳ سه هیولا\n" +
                "فقط احضار کنید (نه اینکه به پشت در زمین بΎذارید)، در این\n" +
                "صورت تمام کارت هایی که حریف کنترل مͳ کند نابود خواهد شد.");
        allCards.add(monster);

        return monster;

    }
}
