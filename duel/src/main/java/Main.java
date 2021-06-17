import cards.monsters.Suijin;

public class Main {
    public static void main(String[] args) {
        Suijin suijin = new Suijin();
        //suijin.setFields();
        System.out.println(suijin.setFields().getDefense());
    }
}
