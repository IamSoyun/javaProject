package myApp.chartControl;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.chart.XYChart;

public class RootController implements Initializable {

	@FXML
	PieChart pieChart;
	@FXML
	BarChart<String, Integer> barChart;
	@FXML
	AreaChart<String, Integer> areaChart;

	@Override
	public void initialize(URL location, ResourceBundle loctaion) {
		ObservableList<Data> pieList = FXCollections.observableArrayList();
		pieList.add(new PieChart.Data("java", 30));
		pieList.add(new PieChart.Data("Html", 25));
		pieList.add(new PieChart.Data("javaScript", 40));

		pieChart.setData(pieList);

		// Series1 << Data
		XYChart.Series<String, Integer> series1 = new XYChart.Series<String, Integer>();

		ObservableList<XYChart.Data<String, Integer>> data1 = FXCollections.observableArrayList();
		data1.add(new XYChart.Data<String, Integer>("임성원", 30));
		data1.add(new XYChart.Data<String, Integer>("정준영", 20));
		data1.add(new XYChart.Data<String, Integer>("도왕락", 35));
		series1.setData(data1);
		series1.setName("영어");

		// Series2 << Data
		XYChart.Series<String, Integer> series2 = new XYChart.Series<String, Integer>();

		ObservableList<XYChart.Data<String, Integer>> data2 = FXCollections.observableArrayList();
		data2.add(new XYChart.Data<String, Integer>("임성원", 35));
		data2.add(new XYChart.Data<String, Integer>("정준영", 22));
		data2.add(new XYChart.Data<String, Integer>("도왕락", 45));
		series2.setData(data2);
		series2.setName("국어");

		// Series3 << Data
		XYChart.Series<String, Integer> series3 = new XYChart.Series<String, Integer>();

		ObservableList<XYChart.Data<String, Integer>> data3 = FXCollections.observableArrayList();
		data3.add(new XYChart.Data<String, Integer>("임성원", 22));
		data3.add(new XYChart.Data<String, Integer>("정준영", 40));
		data3.add(new XYChart.Data<String, Integer>("도왕락", 34));
		series3.setData(data3);
		series3.setName("수학");

		barChart.getData().add(series1);
		barChart.getData().add(series2);
		barChart.getData().add(series3);

		ObservableList<XYChart.Data<String, Integer>> barList = FXCollections.observableArrayList();
		barList.add(new XYChart.Data<String, Integer>("2019", 50));
		barList.add(new XYChart.Data<String, Integer>("2020", 40));
		barList.add(new XYChart.Data<String, Integer>("2021", 60));

	}

}
