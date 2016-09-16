import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaGUIParser extends Application{

	public static void main(String[] args) {
		Application.launch(args);
	}

	private String test1 = "134297381";
	private String test2 = "011011100";
	private String test3 = "aaBBBcC";

	@Override
	public void start(Stage stage) throws Exception {
		StackPane root = new StackPane();
		VBox vbox = new VBox();
		root.getChildren().add(vbox);

		//Parts of 1-1
		StackPane topPane = new StackPane();
		vbox.getChildren().add(topPane);
		Label label = new Label("1-1 : What is the most longest increase substring ?" + "   ex)" + test1);
		topPane.getChildren().add(label);

		StackPane topPane1_1 = new StackPane();
		vbox.getChildren().add(topPane1_1);
		Label label1_1 = new Label("");
		topPane1_1.getChildren().add(label1_1);

		StackPane text1Pane = new StackPane();
		vbox.getChildren().add(text1Pane);
		TextField tf1 = new TextField();
		text1Pane.getChildren().add(tf1);

		StackPane bottomPane = new StackPane();
		vbox.getChildren().add(bottomPane);
		Button btn = new Button();
		btn.setText("Answer");
		bottomPane.getChildren().add(btn);
		btn.setOnAction(event -> {
			Target target1 = new Target(tf1.getText());
			IncreaseValueParser parse1 = new IncreaseValueParser(target1);
			Target answer1 = parse1.output();
			label1_1.setText("The most longest increase substring in " + tf1.getText() + " is " + answer1.getStrings());
		});


		//Parts of 1-2
		StackPane topPane2 = new StackPane();
		vbox.getChildren().add(topPane2);
		Label label2 = new Label("1-2 : What is the most longest same value substring ?" + "   ex)" + test2);
		topPane2.getChildren().add(label2);

		StackPane topPane2_1 = new StackPane();
		vbox.getChildren().add(topPane2_1);
		Label label2_1 = new Label("");
		topPane2_1.getChildren().add(label2_1);

		StackPane text2Pane = new StackPane();
		vbox.getChildren().add(text2Pane);
		TextField tf2 = new TextField();
		text2Pane.getChildren().add(tf2);

		StackPane bottom2Pane = new StackPane();
		vbox.getChildren().add(bottom2Pane);
		Button btn2 = new Button();
		btn2.setText("Answer");
		bottom2Pane.getChildren().add(btn2);
		btn2.setOnAction(event -> {
			Target target2 = new Target(tf2.getText());
			SameValueParser parse2 = new SameValueParser(target2);
			Target answer2 = parse2.output();
			label2_1.setText("The most longest same value substring in " + tf2.getText() + " is " + answer2.getStrings());
		});


		//Parts of 1-3
		StackPane topPane3 = new StackPane();
		vbox.getChildren().add(topPane3);
		Label label3 = new Label("1-3 : What is the most longest same string substring ?" + "   ex)" + test3);
		topPane3.getChildren().add(label3);

		StackPane topPane3_1 = new StackPane();
		vbox.getChildren().add(topPane3_1);
		Label label3_1 = new Label("");
		topPane3_1.getChildren().add(label3_1);

		StackPane text3Pane = new StackPane();
		vbox.getChildren().add(text3Pane);
		TextField tf3 = new TextField();
		text3Pane.getChildren().add(tf3);

		StackPane bottom3Pane = new StackPane();
		vbox.getChildren().add(bottom3Pane);
		Button btn3 = new Button();
		btn3.setText("Answer");
		bottom3Pane.getChildren().add(btn3);
		btn3.setOnAction(event -> {
			Target target3 = new Target(tf3.getText());
			SameStringParser parse3 = new SameStringParser(target3);
			Target answer3 = parse3.output();
			label3_1.setText("The most longest same string substring in " + tf3.getText() + " is " + answer3.getStrings());
		});

		Scene scene = new Scene(root, 600, 500);
		stage.setTitle("sample");
		stage.setScene(scene);
		stage.show();
	}
}
