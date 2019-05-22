package xupt.se.ttms.view.user;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.scene.text.Font;
import javafx.stage.Stage;
import sun.security.tools.keytool.Main;
import xupt.se.ttms.model.Employee;
import xupt.se.ttms.service.LoginedUser;

public class LoginUI extends Application {

    Stage windows;
    Scene sne1, sne2;
    Employee user;
    TextField tf;
    PasswordField pf;
//    ToggleGroup group;

    RadioButton admin;
    RadioButton manager;
    RadioButton sales;

    public static void main(String[] args) {
            launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        windows = primaryStage;
        windows.setTitle("欢迎使用优乐影院管理系统");
        user = new Employee();

        VBox layout = new VBox();
        layout.setPadding(new Insets(50, 50, 50, 50));
        layout.setSpacing(20);
        layout.setAlignment(Pos.CENTER);

        HBox layout1 = new HBox();
        layout1.setPadding(new Insets(50, 50, 50, 50));
        layout1.setSpacing(20);
        layout1.setAlignment(Pos.CENTER);
        final ToggleGroup group = new ToggleGroup();
        SetHBox(layout1, group, user);
        Label lb = new Label("优乐影院管理系统");

        HBox layout2 = new HBox();
        layout2.setPadding(new Insets(50, 50, 50, 50));
        layout2.setSpacing(40);
        layout2.setAlignment(Pos.CENTER);

        lb.setId("bold-label");
        tf = new TextField();
        tf.setPromptText("请输入用户名");
        tf.setMinWidth(90);
        tf.setMaxWidth(400);
        tf.setMinHeight(20);
        pf = new PasswordField();
        pf.setPromptText("请输入密码");
        pf.setMaxWidth(400);
        pf.setMinWidth(90);
        tf.setMinHeight(20);

        Button bt = new Button("确认登录");
        Button bt1 = new Button("找回密码") ;
        layout1.getChildren().addAll(bt, bt1) ;
        //注册事件
        bt1.setOnAction(e->{
           FindPassword(user) ;
        });

        bt.setOnAction(e -> {
            verifyLoginUI(user);
        });
        //设置单个组件的样式
        layout2.getChildren().addAll(bt,bt1) ;
        layout.getChildren().addAll(lb, tf, pf,layout1, layout2);
        sne1 = new Scene(layout, 700, 550);
        windows.setScene(sne1);
        //设置风格
        sne1.getStylesheets().add(LoginUI.class.getResource("Style.css").toExternalForm());
        windows.show();
    }

    public void FindPassword(Employee user){

    }

    public void verifyLoginUI(Employee user){

        user.setName(tf.getText());
        user.setPassword(pf.getText());
        //将接收到的信息传给dao层
        LoginedUser login = new LoginedUser() ;
        boolean sucess = login.verifyUser(user) ;
        if(sucess) {
            System.out.println("登陆成功");
            windows.setMinWidth(1200);
            windows.setMinHeight(1000);
            UsersUI ui = new UsersUI() ;
            Scene sne  = ui.getUserAdminSne(user) ;
            windows.setScene(sne);
        }
        else {
            boolean result = ConfirmBox.display("登录失败") ;
            windows.close();
        }
    }

    public void SetHBox(HBox hbox, ToggleGroup group, Employee user) {

        admin = new RadioButton("管理员");
        admin.setToggleGroup(group);
        admin.setUserData("管理员");
        admin.setStyle(" -fx-font-size:15;-fx-font-weight:bold;");

        manager = new RadioButton("经理");
        manager.setToggleGroup(group);
        manager.setUserData("经理");
        manager.setStyle(" -fx-font-size:15 ;-fx-font-weight:bold;");

        sales = new RadioButton("售票员");
        sales.setToggleGroup(group);
        sales.setUserData("售票员");
        sales.setStyle(" -fx-font-size:15 ;-fx-font-weight:bold;");

        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            public void changed(ObservableValue<? extends Toggle> ov,
                                Toggle old_toggle, Toggle new_toggle) {
                if (group.getSelectedToggle() != null) {
                    String access = new String(group.getSelectedToggle().getUserData().toString());
                    if(access.equals("管理员")) {
                        user.setAccess(0);
                    }
                    if(access.equals("售票员")) {
                        user.setAccess(2);
                    }
                    if(access.equals("经理")) {
                        user.setAccess(1);
                    }
                }
                else{
                    user.setAccess(2);
                }
            }
        });

        hbox.getChildren().addAll(admin, manager, sales);
    }
}
