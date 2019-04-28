import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class Test2 extends Application{

    Stage window ;
    Scene sne1, sne2 ;
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage){

        window = primaryStage ;
        Label lb1 = new Label("this is scene1") ;
        Button bt1 = new Button("go to scene2!") ;
        bt1.setOnAction(e->window.setScene(sne2));

        //layout1 children are laid out vertical column
        VBox layout1 = new VBox(20) ;
        layout1.getChildren().addAll(lb1, bt1) ;
        //将vbox 放到边框中
        sne1 = new Scene(layout1, 200, 200) ;

        Label lb2 = new Label("this is scene2") ;
        Button bt2 = new Button("go back to scene1!") ;
        bt2.setOnAction(e->window.setScene(sne1));

        StackPane layout2 = new StackPane() ;
        layout2.getChildren().addAll(lb2, bt2) ;
        sne2 = new Scene(layout2, 200,100) ;
        window.setScene(sne1);

        window.setTitle("this is a title!");
        window.show() ;
    }
}