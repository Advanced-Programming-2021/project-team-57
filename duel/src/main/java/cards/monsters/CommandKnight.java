package cards.monsters;

public class CommandKnight extends Monster {
    public Monster setFields(){
        Monster monster = new Monster();
        monster.setType("Warrior/Effect");
        monster.setLevel(4);
        monster.setAttack(1000);
        monster.setDefense(1000);
        monster.setName("command knight");
        monster.setDescription("این هیولا یΈ هیولا با اثر ادامه دار (monster effect continuous(\n" +
                "است که هنگامͳ که در زمین به رو (up face (قرار گرفته باشد به قدرت\n" +
                "حمله ی همه ی کارت هایی که روی زمین قرار گرفته اند ۴٠٠ واحد اضافه\n" +
                "مͳ کند و تا زمانͳ که کارت هیولای دیΎری در زمین باشد نمͳ توان به این\n" +
                "کارت حمله کرد (اگر به رو باشد و اثر (effect (آن در حال اجرا باشد).");
        allCards.add(monster);

        return monster;
    }
}
