package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
     public static Stage windows;
    @Override
    public void start(Stage primaryStage) throws Exception{
        windows = primaryStage;
        Parent loginscene = FXMLLoader.load(getClass().getResource("Login.fxml"));
        //Parent GUIscene = FXMLLoader.load(getClass().getResource("GUIpage.fxml"));
        windows.setTitle("The Best");
        windows.setScene(new Scene(loginscene));
        //windows.setScene(new Scene(GUIscene));
       windows.setMaximized(true);
        windows.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
