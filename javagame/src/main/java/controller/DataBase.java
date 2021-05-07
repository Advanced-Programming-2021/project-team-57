package controller;
import com.google.gson.Gson;
import model.User;
import java.io.*;
import java.util.*;


public class DataBase {
    HashMap<String, String> userlogin = new HashMap<String, String>();

    public void writeDataToFile(Object user) {
        try {
            FileWriter file = new FileWriter("user.json");
            file.write(new Gson().toJson(user));
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readDataFromFile() {
        ArrayList<User> users = new ArrayList<>();

        Gson gson = new Gson();
        try (Reader reader = new FileReader("user.json")) {
            User user = gson.fromJson(reader, User.class);
            users.add(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
         if (isUserInfoValid) {
        writeDataToFile(user);
        }
    }

    public void isUserInfoValid() {

    }
}
