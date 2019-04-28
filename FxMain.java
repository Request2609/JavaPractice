import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FxMain extends Application{

    Stage window;
    Scene scene1,scene2;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        Label label1 = new Label("This is Scene1");
        Button button1 = new Button("Go to Scene2");
        button1.setOnAction(e -> window.setScene(scene2));

        //Layout 1 - children are laid out in vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1,button1);
        scene1 = new Scene(layout1,200,200); //200x200 pixel

        //Button2
        Button button2 = new Button("Go back to Scene1");
        button2.setOnAction(e -> window.setScene(scene1));

        //layout2
        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(button2);
        scene2 = new Scene(layout2, 200, 200);
        window.setScene(scene1);
        window.setTitle("This is a title");
        window.show();
    }
}
