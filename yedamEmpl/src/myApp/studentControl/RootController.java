package myApp.studentControl;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import common.BoardVO;
import common.InputBoardVO;
import common.InputDAO;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;

public class RootController implements Initializable {

	private Stage primaryStage;

	public void setPrimaryStage(Stage PrimaryStage) {
		this.primaryStage = primaryStage;
	}

	static ObservableList<Student> stdList = FXCollections.observableArrayList();

	@FXML
	TableView<Student> studentList;
	@FXML
	Button addBtn;

	@Override
	public void initialize(URL location, ResourceBundle resource) {

		stdList.add(new Student("홍길동", 60, 70, 80));

		// studentList - Student.name
		TableColumn<Student, String> tcName = (TableColumn<Student, String>) studentList.getColumns().get(0);
		tcName.setCellValueFactory(new PropertyValueFactory<Student, String>("Name"));

		// studentList - Student.kor
		TableColumn<Student, Integer> tcKor = (TableColumn<Student, Integer>) studentList.getColumns().get(1);
		tcKor.setCellValueFactory(new PropertyValueFactory<Student, Integer>("kor"));

		// studentList - Student.math
		TableColumn<Student, Integer> tcMath = (TableColumn<Student, Integer>) studentList.getColumns().get(2);
		tcMath.setCellValueFactory(new PropertyValueFactory<Student, Integer>("math"));

		// studentList - Student.eng
		TableColumn<Student, Integer> tcEng = (TableColumn<Student, Integer>) studentList.getColumns().get(3);
		tcEng.setCellValueFactory(new PropertyValueFactory<Student, Integer>("eng"));

		studentList.setItems(stdList);

	} // End initiallize
	
	// form.fxml
	public void addBtnAction(ActionEvent e) {

		Stage stage = new Stage(StageStyle.DECORATED);
		stage.initModality(Modality.WINDOW_MODAL);
		stage.initOwner(primaryStage);

		try {

			AnchorPane ap = FXMLLoader.load(getClass().getResource("form.fxml"));
			Scene scene = new Scene(ap);
			stage.setScene(scene);
			stage.show();

			// saveBtn
			Button saveBtn = (Button) ap.lookup("#saveBtn");
			saveBtn.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {

					Student std = new Student();

					TextField addName = (TextField) ap.lookup("#addName");
					std.setName(addName.getText());

					TextField addKor = (TextField) ap.lookup("#addKor");
					std.setKor(Integer.parseInt(addKor.getText()));

					TextField addMath = (TextField) ap.lookup("#addMath");
					std.setMath(Integer.parseInt(addMath.getText()));

					TextField addEng = (TextField) ap.lookup("#addEng");
					std.setEng(Integer.parseInt(addEng.getText()));

					stdList.add(std);
					studentList.setItems(stdList);

				}

			});

			// cancelBtn
			Button cancelBtn = (Button) ap.lookup("#cancelBtn");
			cancelBtn.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					stage.close();
				}

			});

		} catch (IOException e2) {
			e2.printStackTrace();
		}

	}
	
	// form.fxml
		public void viewGraphBtnAction(ActionEvent e) {

			Stage stage = new Stage(StageStyle.DECORATED);
			stage.initModality(Modality.WINDOW_MODAL);
			stage.initOwner(primaryStage);
			
		}

}
