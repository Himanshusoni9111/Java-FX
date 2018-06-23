package sample;
import sample.Main.*;
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
import static sample.Main.windows;
import java.io.IOException;

public class GUIpageCont
{
    public Button CreatetableButton;
    public void CreateTableButtonClicked()  throws IOException  {
        Parent Billscene = FXMLLoader.load(getClass().getResource("BillPage.fxml"));

        //Parent gui = FXMLLoader.load(getClass().getResource("GUIpage.fxml"));

        // Stage S1 = new Stage();
        Stage win = windows;
        CreatetableButton.getScene().getWindow();
        win.setTitle("The Best");
        Scene guiscene = new Scene(Billscene);
        //S1.setScene(new Scene(guiscene, S1.getWidth(), S1.getHeight()));
        win.setScene(guiscene);
        win.setMaximized(true);
        win.show();
        System.out.println("user Logged in");



    }
}
