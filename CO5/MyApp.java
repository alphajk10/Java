import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;

public class MyApp extends Application {
    @Override
    public void start(Stage stage) {
        TextField name = new TextField("Enter your name : ");
        Button button = new Button("Enne Njekku");
        button.setOnAction(e -> {
            String username = name.getText();

            System.out.println(name);
                });

        StackPane root = new StackPane();
        root.getChildren().add(button);

        Scene scene = new Scene(root, 400, 200);
        stage.setTitle("Tinu is Gay");
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}