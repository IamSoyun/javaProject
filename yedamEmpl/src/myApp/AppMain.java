package myApp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application{
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// 컨트롤, label, button
		Label label = new Label();
		label.setText("Hello, JavaFx");
		label.setFont(new Font(50));
		
		Button button = new Button();
		button.setText("확인");
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Platform.exit();
			}
		});
		
		// 컨테이너
		VBox root = new VBox();
		root.setPrefWidth(350);
		root.setPrefHeight(150);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);
		
		root.getChildren().add(label);
		root.getChildren().add(button);
		
		// 컨테이너를 scene의 매개값으로
		Scene scene = new Scene(root);
		
		// Stage의 매개값으로 Scene을 달아줌.
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
}