import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.event.*;
import javafx.scene.control.*;

import javafx.scene.text.*;
import javafx.scene.paint.*;


public class App2 extends Application {

    public void start(Stage stage) {

        Label label = new Label("Wie heißt du?");
        TextField textField = new TextField();
        textField.setMaxWidth(100);

        Button button = new Button("Klick mich!");
        Text text = new Text();
        text.setFill(Color.BLUE);
        text.setFont(Font.font(null, FontWeight.BOLD, 30));

        button.setOnAction(e ->{
                text.setText("Hallo " + textField.getText() + "!");
                textField.setText(""); 
            }
        );

        textField.setOnAction(e -> {
                text.setText("Huhu " + textField.getText() + "!");
                textField.setText("");
            }
        );

        VBox root = new VBox(10);
        root.getChildren().addAll(label,textField,button,text);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 600, 400);
        stage.setTitle("App 2");
        stage.setScene(scene);
        stage.show();
    }
}
