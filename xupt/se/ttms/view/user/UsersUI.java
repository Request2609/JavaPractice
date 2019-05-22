package xupt.se.ttms.view.user;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import xupt.se.ttms.model.Employee;
import xupt.se.ttms.service.LoginedUser;

import java.util.List;

public class UsersUI extends Application {

     VBox vb0, vb1;
    Scene sne ;
    TableView table ;
    List<Employee>list ;
    HBox hb1;
    @Override
    public void start(Stage primaryStage) throws Exception {

    }

    //管理员操作
    public Scene getUserAdminSne(Employee user){
        //放置button的地方
        BorderPane bord = new BorderPane() ;
        HBox hb = new HBox() ;
        vb0 = new VBox() ;

        list = LoginedUser.getAllUser() ;
        GridPane grid = new GridPane() ;

        grid.setHgap(90);
        grid.setVgap(10);
        grid.add(new Text("用户ID"), 0,0) ;
        grid.add(new Text("权限"), 1,0) ;
        grid.add(new Text("用户名"), 2,0) ;
        grid.add(new Text("电话号码"), 3,0) ;
        int i = 1, j= 0 ;
//        getListOfUser() ;
        for(Employee uu: list) {
            Button bt = new Button("删除") ;
            grid.add(new Text(uu.getId()+""),j,i ) ;
            grid.add(new Text(uu.getAccess()+""), j+1,i) ;
            grid.add(new Text(uu.getName()), j+2,i) ;
            grid.add(new Text(uu.getTel()), j+3, i) ;
            grid.add(bt, j+4, i) ;
            i++ ;
            bt.setOnAction(e->{
                delUser(uu, grid) ;
            });
        }
        bord.setRight(grid);
        grid.setId("gridpane") ;
        grid.setAlignment(Pos.CENTER);
        Button addButton = new Button("添加用户") ;
        Button modiButton = new Button("修改用户") ;

        Button fetchUser = new Button("查询用户") ;
        vb0.getChildren().addAll(addButton,modiButton ,fetchUser) ;

        setButton(addButton ,modiButton,fetchUser) ;

        hb.setSpacing(50);
        hb.setPadding(new Insets(20,20,20,20));
        hb.getChildren().addAll(addButton, modiButton, fetchUser) ;

        bord.setLeft(vb0);

        Scene sne = new Scene(bord, 1200, 1000) ;
        sne.getStylesheets().add(LoginUI.class.getResource("Style.css").toExternalForm());
        return sne ;
    }

    public void getListOfUser() {

    }

    void delUser(Employee uu,GridPane grid) {
        LoginedUser user = new LoginedUser() ;
        int ret = user.delete(uu.getId()) ;
//        if(ret != 0) {
//
//        }
    }

    void setButton(Button addButton ,Button modiButton,Button fetchUser) {
        addButton.setMinWidth(150);
        modiButton.setMinWidth(150);
        fetchUser.setMinWidth(150);
        addButton.setOnAction(e->{

        });
        modiButton.setOnAction(e->{});
        fetchUser.setOnAction(e->{});
    }
}
