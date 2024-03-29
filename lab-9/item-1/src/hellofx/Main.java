package hellofx;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    TextField tfNumOfYears = new TextField();
    TextField tfLoanAmount = new TextField();
    TextArea textArea = new TextArea();

    @Override
    public void start(Stage primaryStage) {

        EventHandler<ActionEvent> handler = event -> updateRates();
        tfNumOfYears.setOnAction(handler);
        tfLoanAmount.setOnAction(handler);

        HBox topPane = new HBox();
        topPane.setSpacing(20);
        topPane.setPadding(new Insets(20));
        Label lblLoanAmount = new Label("Loan Amount: ", tfLoanAmount);
        lblLoanAmount.setContentDisplay(ContentDisplay.RIGHT);

        Label lblNumOfYears = new Label("Number Of Years: ", tfNumOfYears);
        lblNumOfYears.setContentDisplay(ContentDisplay.RIGHT);

        Button btShowTable = new Button("Show Table");
        btShowTable.setOnAction(handler);
        topPane.getChildren().addAll(lblLoanAmount, lblNumOfYears, btShowTable);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(textArea);
        borderPane.setTop(topPane);

        primaryStage.setScene(new Scene(borderPane));
        primaryStage.setTitle("Display Loan");
        primaryStage.show();
    }

    private void updateRates() {
        double annualInterestRate = 5.00;
        double loanAmount = Double.parseDouble(tfLoanAmount.getText());
        double numberOfYears = Double.parseDouble(tfNumOfYears.getText());
        String s = String.format("%-1s%20s%20s\n", "Interest Rate", "Monthly Payment", "Total Payment");

        for (; annualInterestRate <= 8.00; annualInterestRate += 0.125) {
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate
                    / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            double totalPayment = monthlyPayment * numberOfYears * 12;
            String str = "%";

            s += String.format("%-1.2f%s%19.2f%30.2f \n", annualInterestRate, str,
                    ((int) (monthlyPayment * 100) / 100.0), ((int) (totalPayment * 100) / 100.0));
        }
        textArea.setText(s);

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}