import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.* ;


public class AlertBox {

    public static void display(String title, String message){

        Stage window = new Stage();// make a new Stage for our Scene
        window.initModality(Modality.APPLICATION_MODAL);//initiate the Mod by the using the Java Library
        window.setTitle(title);//Set the title of the new window
        window.setMinWidth(250);
        Label label1 = new Label();//make label to write some message
        label1.setText(message);

        Button closeButton = new Button("Close the window");
        //设置窗口关闭
        closeButton.setOnAction(e ->window.close());
        //定义一个弹出窗口
        VBox layout = new VBox(100);

        //将空间放进这个layout中
        layout.getChildren().addAll(label1, closeButton); //Add the Button and label to the window


        //设置对齐方式
        layout.setAlignment(Pos.CENTER);


        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
//        window.showAndWait();
    }
}
