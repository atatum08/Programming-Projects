package proj01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class Prog01 extends Application
{
    private static int counter = 0;

    public static void main(String[] args)
    {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("counter.fxml"));

        Button btn = new Button();

        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(loader.load()));
        // get the scene to get the button object
         Scene s = primaryStage.getScene();

        // use the lookup method from scene
        Button B = (Button)s.lookup("#button");
        Label L = (Label)s.lookup("#counter");

        B.setOnAction(event -> L.setText(++counter + "") );

        primaryStage.show();
    }
}
