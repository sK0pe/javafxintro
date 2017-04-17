package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello World");
        Parent root = FXMLLoader.load(getClass().getResource("HelloWorld.fxml"));
        Scene scene = new Scene(root, 300, 275);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(HelloWorld.class.getResource("HelloWorld.css").toExternalForm());
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
