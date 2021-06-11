package Sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;

public class Profile {

    @FXML
    private Label profile;


    public void showProfile() {
        Stage mainMenuStage = new Stage();
        URL address = getClass().getResource("fxml/Profile.fxml");
        Parent root = null;
        try {
            root = FXMLLoader.load(address);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        mainMenuStage.initStyle(StageStyle.UNDECORATED);
        mainMenuStage.setScene(scene);
        mainMenuStage.show();
    }
    public void profileBack(ActionEvent event) {
        RegisterController registerController = new RegisterController();
        registerController.back();
    }
    public void changePassword(ActionEvent event){
        ChangePassword changePassword = new ChangePassword();
        changePassword.showChangePassword();
    }
    public void changeNickname(ActionEvent event){
ChangeNickname changeNickname = new ChangeNickname();
changeNickname.showChangeNickname();
    }
}