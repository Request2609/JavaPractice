package xupt.se.ttms.view.user;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



class AllScene {

}

public class FindPassScene extends Application {
    Scene sne ;
    Stage window ;
    TextField name, pnum;
    PasswordField newPassword,passAgain ;
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage ;
        window.setTitle("找回密码") ;

        VBox vb = new VBox() ;
        vb.setSpacing(40);
        vb.setPadding(new Insets(50,50,50,50));
        vb.setAlignment(Pos.CENTER);

        name = new TextField() ;
        name.setText("请输入账号");
        name.setMinWidth(90);

        newPassword = new PasswordField() ;
        passAgain = new PasswordField() ;
        newPassword.setMinWidth(90); ;
        newPassword.setPromptText("请输入密码");
        passAgain = new PasswordField() ;
        passAgain.setPromptText("再输入一次密码");

        pnum = new TextField() ;
        pnum.setText("请输入电话号码") ;
        pnum.setMinWidth(90);

        Button confirm = new Button("确认") ;
        Button cancer = new Button("取消") ;
        HBox hb = new HBox() ;
        hb.setSpacing(20);
        vb.getChildren().addAll(name, newPassword, passAgain, pnum, hb) ;
        sne = new Scene(vb, 600, 600) ;
    }
}
