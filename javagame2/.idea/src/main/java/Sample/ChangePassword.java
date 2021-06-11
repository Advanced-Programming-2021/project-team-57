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

public class ChangePassword {
    @FXML
  private   TextField newPassword;
    @FXML
   private Label changePass;
    public void showChangePassword() {
        Stage mainMenuStage = new Stage();
        URL address = getClass().getResource("fxml/ChangePassword.fxml");
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
    public void changePasswordBack(ActionEvent event){
        RegisterController registerController = new RegisterController();
        registerController.back();
    }
    public void enterNewPassword(ActionEvent event){
       // changePass.setText("your Password changed successfully!");
        LoginController loginController = new LoginController();
        loginController.changeUserPassword(newPassword.getText());

    }


}

