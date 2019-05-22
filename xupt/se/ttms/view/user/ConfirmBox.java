package xupt.se.ttms.view.user;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.util.Stack;

public class ConfirmBox extends Application {

    static boolean result ;
    static Stage window ;

    public static boolean display(String title) {

        window = new Stage() ;
        VBox layout = new VBox() ;

        window.setTitle("优乐影院管理系统");

        Label  lb = new Label(title) ;

        Button yes_bt1 = new Button("重新登录") ;
        Button no_bt1 = new Button("找回密码") ;

        yes_bt1.setOnAction(e->{
            result = true ;
            window.close() ;
        });

        no_bt1.setOnAction(e->{
            result = false ;
            window.close() ;
        });

        layout.getChildren().add(lb) ;
        layout.getChildren().add(yes_bt1) ;
        layout.getChildren().add(no_bt1) ;
        Scene sne = new Scene(layout,200,200) ;
        window.setScene(sne);
        window.show();
        return result ;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
