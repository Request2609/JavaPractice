import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.geometry.* ;

//创建多个窗口
public class Main1 extends Application {

    Button bt1 ;
    Stage window ;
    public static void main(String[]args){
        launch(args) ;
    }
    public void start(Stage primaryStage){

        window = primaryStage ;
        window.setTitle("the new Window!");
        bt1 = new Button("Click on") ;

        bt1.setOnAction(e->AlertBox.display("Title of the window!", "hhhhhhhhh")) ;
        StackPane layout = new StackPane() ;

        layout.getChildren().add(bt1) ;
        Scene scene = new Scene(layout, 200,200) ;
        window.setScene(scene);
        window.show() ;
    }
}
