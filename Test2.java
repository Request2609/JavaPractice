import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static javafx.application.Application.launch;



public class Test2 extends Application implements EventHandler<ActionEvent> {

    Stage window =null ;
    Scene sne1,sne2 ;
    Label lb  ;

    Button bt1,bt2 ;

    public static void main(String[] arg){
        new Test2(arg) ;
    }

    public Test2(String[] args){
        launch(args) ;
    }

    public void start(Stage primaryStage){

        window = primaryStage ;
        lb = new Label("Welcome to the first scene!") ;
        bt1 = new Button("go to scene 2!") ;
        bt1.setOnAction(e->window.setScene(sne2));

        VBox layout = new VBox(20) ;
        layout.getChildren().addAll(lb,bt1) ;

        bt2 = new Button("This scene socks,go back to scene 1!") ;
        bt2.setOnAction(e->window.setScene(sne1));

        StackPane  layout2 = new StackPane() ;
        layout2.getChildren().add(bt2) ;
        window.setTitle("Title here!");
        window.show();
    }

    public void handle(ActionEvent ev){

    }
}
