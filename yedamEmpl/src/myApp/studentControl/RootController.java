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
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.PieChart.Data;
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
		stdList.add(new Student("김길동", 80, 60, 90));
		stdList.add(new Student("박길동", 100, 50, 70));

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
	
	
	// barChart.fxml
		public void viewBarChartBtnAction(ActionEvent e) {

			Stage stage = new Stage(StageStyle.DECORATED);
			stage.initModality(Modality.WINDOW_MODAL);
			stage.initOwner(primaryStage);
			
			AnchorPane ap = null;
			try {
				
				ap = FXMLLoader.load(getClass().getResource("barChart.fxml"));
				Scene scene = new Scene(ap);
				stage.setScene(scene);
				stage.show();
				
				// barChart
				BarChart<String, Integer> stdBarChart = (BarChart<String, Integer>) ap.lookup("#stdBarChart");
				
				//국어
				XYChart.Series<String, Integer> scoreKor = new XYChart.Series<String, Integer>();
				ObservableList<XYChart.Data<String, Integer>> dataKor = FXCollections.observableArrayList();
				
				for(Student std : stdList) {
					dataKor.add(new XYChart.Data<String, Integer>(std.getName(), std.getKor()));
				}
				
				scoreKor.setData(dataKor);
				scoreKor.setName("국어");
				stdBarChart.getData().add(scoreKor);
				
				//수학
				XYChart.Series<String, Integer> scoreMath = new XYChart.Series<String, Integer>();
				ObservableList<XYChart.Data<String, Integer>> dataMath = FXCollections.observableArrayList();
				
				for(Student std : stdList) {
					dataMath.add(new XYChart.Data<String, Integer>(std.getName(), std.getMath()));
				}
				
				scoreMath.setData(dataMath);
				scoreMath.setName("수학");
				stdBarChart.getData().add(scoreMath);
				
				//영어
				XYChart.Series<String, Integer> scoreEng = new XYChart.Series<String, Integer>();
				ObservableList<XYChart.Data<String, Integer>> dataEng = FXCollections.observableArrayList();
				
				for(Student std : stdList) {
					dataEng.add(new XYChart.Data<String, Integer>(std.getName(), std.getEng()));
				}
				
				scoreEng.setData(dataEng);
				scoreEng.setName("영어");
				stdBarChart.getData().add(scoreEng);
				
				
				// closeBtn
				Button closeBtn = (Button) ap.lookup("#closeBtn");
				closeBtn.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						stage.close();
					}

				});
				
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}

}
