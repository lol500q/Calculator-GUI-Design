import java.util.*;
import java.util.stream.IntStream;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;


public class Lab51 extends  Application {
    @Override
    public void start(Stage stage) throws Exception {
        StackPane pane=new StackPane();
        GridPane gridtest=new GridPane();
        TextField text=new TextField();
        text.setMinHeight(50);
        text.setPrefWidth(440);
        HBox box=new HBox(15);
        box.getChildren().addAll(text);
        GridPane grid=new GridPane();
        ArrayList<Button> buttons=new ArrayList<>();
        Button button1=new Button("1");
        buttons.add(button1);
        Button button2=new Button("2");
        buttons.add(button2);
        Button button3=new Button("3");
        buttons.add(button3);
        Button button4=new Button("4");
        buttons.add(button4);
        Button button5=new Button("5");
        buttons.add(button5);
        Button button6=new Button("6");
        buttons.add(button6);
        Button button7=new Button("7");
        buttons.add(button7);
        Button button8=new Button("8");
        buttons.add(button8);
        Button button9=new Button("9");
        buttons.add(button9);
        Button buttonPoint=new Button(".");
        buttons.add(buttonPoint);
        Button button1Add=new Button("+");
        buttons.add(button1Add);
        Button buttonMultiply=new Button("*");
        buttons.add(buttonMultiply);
        Button button1Minus=new Button("-");
        buttons.add(button1Minus);
        Button button1Division=new Button("/");
        buttons.add(button1Division);
        Button button0=new Button("0");
        buttons.add(button0);
        Button Equal=new Button("=");
        buttons.add(Equal);
        for(int i=0;i<buttons.size();i++){
            buttons.get(i).setMinWidth(100);
            buttons.get(i).setMinHeight(100);
        }
        grid.add(button1,0,0);
        grid.add(button2,1,0);
        grid.add(button3,2,0);
        grid.add(button1Add,3,0);
        grid.add(button4,0,1);
        grid.add(button5,1,1);
        grid.add(button6,2,1);
        grid.add(button1Minus,3,1);
        grid.add(button7,0,2);
        grid.add(button8,1,2);
        grid.add(button9,2,2);
        grid.add(buttonMultiply,3,2);
        grid.add(button0,0,3);
        grid.add(buttonPoint,1,3);
        grid.add(Equal,2,3);
        grid.add(button1Division,3,3);
        grid.setPadding(new Insets(5,10,5,10));
        grid.setVgap(10);
        grid.setHgap(10);








        gridtest.add(box,0,0);
        gridtest.add(grid,0,1);
        pane.getChildren().addAll(gridtest);
        Scene scene=new Scene(pane);
        stage.setTitle("lab6");
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String []args){
        launch(args);
    }
}