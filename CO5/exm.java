import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.layout.GridPane;
import javafx.stage.Stage;

public class exm extends Application {
    public void start(Stage stage){
        Label a = new Label("Enter your name:");
        TextField n = new TextField();
        Label b = new Label("Enter the password:");
        PasswordField p = new PasswordField();

        Button submit = new Button("Submit");

        CheckBox b1 = new CheckBox("Java");
        CheckBox b2 = new CheckBox("Python");

        RadioButton r1 = RadioButton("male");
        RadioButton r2 = RadioButton("female");
        ToggleGroup toggle = new ToggleGroup();
        male.setToggleGroup(toggle);

        GridPane grid = new GridPane();
        submit.setOnAction(e -> {
            System.out.println("Name :" +n.getText);
            System.out.println("Password :" +p.getText);

        });
    }
}