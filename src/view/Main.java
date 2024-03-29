package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {


    @Override
    public void start(Stage stage){
        try {

            Parent root = FXMLLoader.load(Main.class.getResource("/view/MainLayout.fxml"));
            Scene scene = new Scene(root,600,400);

            stage.resizableProperty().setValue(false);
            stage.setScene(scene);
            stage.setTitle("Vending Machine");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args){ launch(args); }
}
