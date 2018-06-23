package sample;
import sample.Main.*;
//import com.sun.java.swing.plaf.windows.resources.windows;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.EventHandler;

import java.io.IOException;
import java.lang.Exception;

import static sample.Main.windows;

public class Login {

    public Button LoginButton, ExitButton;
    public Label loginlabel, passwordlabel;
    String Checkpw, Checkun;
    String username = "himanshu", password = "qwerty";
    public  TextField txtusername;
    public PasswordField txtpassword;
    public Label WarningLabel;
    public void LoginButtonClicked() throws IOException {


            Checkun = txtusername.getText();
            Checkpw = txtpassword.getText();
            if (Checkun.equals(username) && Checkpw.equals(password)) {
               // try {
                Parent gui = FXMLLoader.load(getClass().getResource("GUIpage.fxml"));

                 // Stage S1 = new Stage();
                Stage win = windows;
                LoginButton.getScene().getWindow();
                  win.setTitle("The Best");
                Scene guiscene = new Scene(gui);
                  //S1.setScene(new Scene(guiscene, S1.getWidth(), S1.getHeight()));
               win.setScene(guiscene);
               win.setMaximized(true);
               win.show();
                System.out.println("user Logged in");

            }
          /* else if (Checkun.equals(null) && Checkpw.equals())
            {
                WarningLabel.setText("please enter user name");
            }
            else if(Checkpw.equals(null))
            {
                WarningLabel.setText("please enter Password");
            }*/
            else{
                System.out.println("wrong input");
                WarningLabel.setText("Wrong ID or Password");

            }



        }
        public void ExitButtonClicked (ActionEvent eventclose) throws Exception {



        }

    }
