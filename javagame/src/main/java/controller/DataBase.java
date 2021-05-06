package controller;

import com.google.gson.Gson;
import model.User;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;


public class DataBase {
    HashMap<String, String> userlogin = new HashMap<String, String>();

    public  void writeDataToFile() {
        File userInformation = new File(new Gson().toJson(userlogin));
    }

    public void readDataFromFile() {

    }

    public void usersLogInUpdate(String command) {


    }

    public void extractUserInformation(String command) {
        command = command.replaceAll("\\s", "");
        HashMap<String, String> userlogin = new HashMap<String, String>();
        String[] b = (command.split("--"));


        for (int i = 1; i < b.length; i++) {
            String input = b[i].replaceAll(".*\\<|\\>.*", "");
            if (input != null) {
                userlogin.put(b[i].substring(0, b[i].indexOf("<")), input);
            }


        }

    }


    public String usernameUpdate() {
        String username = userlogin.get("username");
        return username;

    }


    public String passwordUpdate() {
        String password = userlogin.get("password");
        return password;

    }

    public String nicknameUpdate() {
        String nickname = userlogin.get("nickname");
        return nickname;
    }

    public void userScoresUpdate() {

    }

    public boolean isCreateUserCommandValid(String command) {
        command = command.toLowerCase().replaceAll("\\s", "");
        if (command.startsWith("usercreate") &&
                (userlogin.containsKey("username")) &&
                (userlogin.containsKey("password")) &&
                (userlogin.containsKey("nickname"))) {
            return true;
        } else {
            return false;
        }

    }

    public void createUser() {
        User user = new User();
        user.setUsername(usernameUpdate());
        user.setNickname(nicknameUpdate());
        user.setPassword(passwordUpdate());
    }
}
