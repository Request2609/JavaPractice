import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class FxMain extends Application implements EventHandler<ActionEvent>{

    Button button ;
    public static void main(String []args){

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("hello");

        button = new Button("click") ;


//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//
//            }
//        });
        button.setOnAction(e->{
            System.out.println("kkkkkk") ;
            System.out.println("lllllll") ;
        });
        StackPane layout = new StackPane() ;
        layout.getChildren().add(button) ;


        Scene scn = new Scene(layout,1000,700) ;
        primaryStage.setScene(scn);
        primaryStage.show() ;
    }

    //事件处理
    public void handle(ActionEvent ev){
//
        if(ev.getSource() ==button)
        {
            System.out.println("I love You!") ;
        }
    }
}
