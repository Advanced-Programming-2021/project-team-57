package main;

import com.sun.deploy.security.SelectableSecurityManager;
import org.omg.CORBA.DATA_CONVERSION;
import sun.plugin.perf.PluginRollup;

import javax.swing.plaf.multi.MultiSeparatorUI;
import javax.xml.crypto.Data;
import java.util.Scanner;

public class MainMenuView extends MenuView {
    DataBase database = new DataBase();
    User user = new User();
    public User Profile(User user1) {
        System.out.println("you have entered profile menu \n enter <back> to access main menu");
        user.userMenuPosition = "Profile Menu";
        String profilemenucommand = new Scanner(System.in).nextLine();
        if (profilemenucommand.startsWith("menu show-current")) {
            System.out.println(user.userMenuPosition);
            profilemenucommand = new Scanner(System.in).nextLine();
        }
        if (profilemenucommand.toLowerCase().startsWith("profile change")) {
            if (profilemenucommand.toLowerCase().contains("--nickname ")) {
                String s[] = profilemenucommand.split(" ");
                user1.nickname = s[3];
                System.out.println("nickname changed successfully to : " + user1.nickname);
            }
            else if(profilemenucommand.toLowerCase().contains("--password --current") && profilemenucommand.toLowerCase().contains("--new")){
                String str[] = profilemenucommand.split(" ");
                if(str[4].equals(user1.password) ){
                    user1.password = str[6];
                    System.out.println("password successfully changed to : " + user1.password);
                    Profile(user1);
                }
                else if(str[6].equals(user1.password)){
                    System.out.println("same password try again");
                    Profile(user1);
                }
                else{
                    System.out.println("wrong password try again");
                    Profile(user1);
                }
            }
            else{
                System.out.println("invalid command try again");
                Profile(user1);
            }
        }else if(profilemenucommand.equals("back")){
            database.createUser();
        }
        else {
            System.out.println("invalid command try again");
            Profile(user1);
        }
        return user1 ;
    }
    public void Import(){
        user.userMenuPosition ="Import//Export Menu";
        String importcommand = new Scanner(System.in).nextLine();
        if(importcommand.startsWith("menu show-current")){
            System.out.println(user.userMenuPosition);
        importcommand = new Scanner(System.in).nextLine();
        }
    }
    public void Shop(){
        user.userMenuPosition= "Shop Menu";
        String shopmenucommand = new Scanner(System.in).nextLine();
        if(shopmenucommand.startsWith("menu show-current")){
            System.out.println(user.userMenuPosition);
            shopmenucommand = new Scanner(System.in).nextLine();
        }
    }
public void Duel(){
        user.userMenuPosition= "Duel Field";
        String duelfieldcommand = new Scanner(System.in).nextLine();
    if(duelfieldcommand.startsWith("menu show-current")){
        System.out.println(user.userMenuPosition);
        duelfieldcommand = new Scanner(System.in).nextLine();
    }
}
public void Deckmenu(){
        user.userMenuPosition = "Deck Menu";
    String deckmenucommand =new Scanner(System.in).nextLine();
    if(deckmenucommand.startsWith("menu show-current")){
        System.out.println(user.userMenuPosition);
        deckmenucommand = new Scanner(System.in).nextLine();
    }
}
    public void ScoreBoard(){
        user.userMenuPosition = "ScoreBoard Menu";
        System.out.println("enter a command \n enter <back> to access mainmenu");
    String scoreboardcommand = new Scanner(System.in).nextLine();
        if(scoreboardcommand.startsWith("menu show-current")){
            System.out.println(user.userMenuPosition);
            scoreboardcommand = new Scanner(System.in).nextLine();
        }
    if(scoreboardcommand.startsWith("scoreboard show")){
        for (int i =0 ; i<DataBase.allUsers.size() ; i++)
        System.out.println((i+1) + "-" + DataBase.allUsers.get(i).nickname + ":" + DataBase.allUsers.get(i).scores);
    }
    else if (scoreboardcommand.equals("back")){
        database.createUser();
    }else{
        System.out.println("invalid command try again");
        ScoreBoard();
    }
    }
}
