import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.* ;
//两个窗口进行消息传递

public class ConfirmBox{

    static boolean answer ;
    public static boolean display(String title, String message){

        Stage window = new Stage();// make a new Stage for our Scene
        window.initModality(Modality.APPLICATION_MODAL);//initiate the Mod by the using the Java Library
        window.setTitle(title);//Set the title of the new window
        window.setMinWidth(250);
        Label label1 = new Label();//make label to write some message
        label1.setText(message);

        Button YesButton = new Button("Yes");
        Button NoButton = new Button("No");

        //设置窗口关闭
        YesButton.setOnAction(e->{
                answer = true ;
                System.out.println("yes") ;
        });

        NoButton.setOnAction(e->{
            answer = false ;
        });
        //定义一个弹出窗口
        VBox layout = new VBox(100);

        //将空间放进这个layout中
        layout.getChildren().addAll(label1, YesButton, NoButton); //Add the Button and label to the window


        //设置对齐方式
        layout.setAlignment(Pos.CENTER);


        Scene scene = new Scene(layout);
        window.setScene(scene);
//        window.show();
        window.showAndWait();
        return answer ;
//        window.showAndWait();
    }
}
