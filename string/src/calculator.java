import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class calculator extends Application {

    TextField tfNum1;
    TextField tfNum2;
    Button btnDivide;
    Button btnMultiply;
    Button btnAddition;
    Button btnSubtraction;
    Button btnClear;
    Button btnEqual;
    Label lblAnswer;
    Label lblnum1;
    Label lblnum2;

    @Override
    public void start(Stage primaryStage) {

        tfNum1 = new TextField();
        tfNum2 = new TextField();
        btnDivide = new Button("/");
        btnMultiply = new Button("*");
        btnAddition = new Button("+");
        btnSubtraction = new Button("-");
        btnClear = new Button("Clear");
        btnEqual= new Button("=");
        lblAnswer = new Label("");
        lblnum1 = new Label ("Enter first num:");
        lblnum2 = new Label("Enter second num:");

        lblAnswer.setAlignment(Pos.CENTER);
        lblAnswer.setStyle("-fx-border-color: #000; -fx-padding: 5px;");

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);

        root.setHgap(15);
        root.setVgap(15);

        root.add(btnDivide, 2, 1);
        root.add(btnMultiply, 3, 1);
        root.add(btnAddition, 0, 1);
        root.add(btnSubtraction, 1, 1);
        root.add(btnEqual, 1, 3, 2, 1);
        root.add(btnClear, 1, 5, 2, 1);

        root.add(tfNum1, 1, 0);
        root.add(tfNum2, 1, 2);
        root.add(lblAnswer, 1, 4, 2, 1);
        root.add(lblnum1, 0,0);
        root.add(lblnum2, 0,2);

        setWidths();
        attachCode();

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void setWidths() {
        tfNum1.setPrefWidth(150);
        tfNum2.setPrefWidth(150);
        btnDivide.setPrefWidth(150);
        btnMultiply.setPrefWidth(150);
        btnAddition.setPrefWidth(150);
        btnSubtraction.setPrefWidth(150);
        btnEqual.setPrefWidth(150);
        btnClear.setPrefWidth(150);
        lblAnswer.setPrefWidth(250);
        lblnum1.setPrefWidth(150);
        lblnum2.setPrefWidth(150);
    }

    public void attachCode() {
        //have each button run BTNCODE when clicked
        btnAddition.setOnAction(e -> btncode(e));
        btnSubtraction.setOnAction(e -> btncode(e));
        btnMultiply.setOnAction(e -> btncode(e));
        btnDivide.setOnAction(e -> btncode(e));
        btnClear.setOnAction(e -> btncode(e));
        btnEqual.setOnAction(e-> btncode(e));
    }

    public void btncode(ActionEvent e) {
        int num1, num2, answer;
        char symbol;
        //e tells us which button was clicked
        if (e.getSource() == btnClear) {
            tfNum1.setText("");
            tfNum2.setText("");
            lblAnswer.setText("?");
            tfNum1.requestFocus();
            return;
        }
        //read numbers in from textfields
        num1 = Integer.parseInt(tfNum1.getText());
        num2 = Integer.parseInt(tfNum2.getText());
        if (e.getSource() == btnAddition) {
            symbol = '=';
            answer = num1 + num2;
        } else if (e.getSource() == btnSubtraction) {
            symbol = '=';
            answer = num1 - num2;
        } else if (e.getSource() == btnMultiply) {
            symbol = '=';
            answer = num1 * num2;
        } else {
            symbol = '=';
            answer = num1 / num2;
        }
        //display answer
        lblAnswer.setText("" + num1 + symbol + num2 + "=" + answer);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
