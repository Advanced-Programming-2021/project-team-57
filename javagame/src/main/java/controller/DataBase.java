package controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.User;
import view.LoginMenuView;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;


public class DataBase {
    User currentUser = new User(); //should be deleted
    HashMap<String, String> userlogin = new HashMap<String, String>();
    static ArrayList<User> allUsers = new ArrayList<User>();
    Gson gson = new Gson();

    public void writeDataToFile(Object user) {
        try {
            FileWriter userWrite = new FileWriter("user.json");
            userWrite.write(gson.toJson(allUsers));
            userWrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readDataFromFile() {
        try (Reader reader = new FileReader("user.json")) {
            Type listType = new TypeToken<ArrayList<User>>() {
            }.getType();
            allUsers = (gson.fromJson(reader, listType));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void usersLogInUpdate() {
        createUser();
        readDataFromFile();
        if (userLoginInfoValidation() == 1) {
            LoginMenuView loginMenuView = new LoginMenuView();
            loginMenuView.userLoginSuccessMessage();
        }

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
        return userlogin.get("username");


    }


    public String passwordUpdate() {
        return userlogin.get("password");


    }

    public String nicknameUpdate() {
        return userlogin.get("nickname");

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

    public boolean isUserLoginCommandValid(String command) {
        command = command.toLowerCase().replaceAll("\\s", "");
        if (command.startsWith("userlogin") &&
                (userlogin.containsKey("username")) &&
                (userlogin.containsKey("password"))
        ) {
            return true;
        } else {
            return false;
        }

    }

    public void createNewUser() {
        LoginMenuView loginMenuView = new LoginMenuView();
        User user = new User();
        user.setUsername(usernameUpdate());
        user.setNickname(nicknameUpdate());
        user.setPassword(passwordUpdate());
        readDataFromFile();
        if (userInfoValidation() == 0) {

            allUsers.add(user);
            writeDataToFile(user);
            loginMenuView.createNewUserSuccessMessage();
        } else {
            loginMenuView.userInfoValidationMessage(userInfoValidation());
        }
    }

    public int userInfoValidation() {
        int flag = 0;

        for (int i = 0; i < allUsers.size() - 1; i++) {

            if ((allUsers.get(i).username).equals(allUsers.get(i + 1).username)) {
                flag = 1;

            }
            if ((allUsers.get(i).password).equals(allUsers.get(i + 1).password)) {
                flag = 2;

            }
            if ((allUsers.get(i).nickname).equals(allUsers.get(i + 1).nickname)) {
                flag = 3;

            }
        }
        return flag;
    }

    public int userLoginInfoValidation() {
        int flag = 0;
        for (int i = 0; i < allUsers.size() - 1; i++) {
            if (userlogin.get("username").equals(allUsers.get(i))) {
                if (userlogin.get("password").equals(allUsers.get(i))) {
                    flag = 1;
                }
            }
        }
        return flag;
    }

    public void createUser() {
        LoginMenuView loginMenuView = new LoginMenuView();
        User currentUser = new User();
        currentUser.setUsername(usernameUpdate());
        currentUser.setNickname(nicknameUpdate());
        currentUser.setPassword(passwordUpdate());

    }


}