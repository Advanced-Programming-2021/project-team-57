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

public class ChangeNickname {
    @FXML
    private TextField newNickname;
    @FXML
    private Label changeNicknameMessage;

    public void showChangeNickname() {
        Stage mainMenuStage = new Stage();
        URL address = getClass().getResource("fxml/ChangeNickname.fxml");
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
    public void changeNicknameBack(ActionEvent event){
        RegisterController registerController = new RegisterController();
        registerController.back();
    }
    public void enterNewNickname(ActionEvent event){

        LoginController loginController = new LoginController();
        if(loginController.isNewNicknameValid(newNickname.getText())){
        loginController.changeUserNickname(newNickname.getText());}else{
            changeNicknameMessage.setText("your nickname is already exist!");
        }

    }


}