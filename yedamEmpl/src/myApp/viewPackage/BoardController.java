package myApp.viewPackage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import common.BoardVO;
import common.InputBoardVO;
import common.InputDAO;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;

public class BoardController implements Initializable {

	@FXML TableView<BoardVO> tableView;
	@FXML TextField boardNo, title;
	@FXML TextArea contents;
	@FXML DatePicker exitDate;
	@FXML ComboBox<String> publicity;
	@FXML Button updateBtn, deleteBtn, addBtn;
	
	
	private Stage primaryStage;
	
	public void setPrimaryStage(Stage PrimaryStage) {
		this.primaryStage = primaryStage;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		deleteBtn.setOnAction(e -> deleteBtnAction(e));
		addBtn.setOnAction(e -> addBtnAction(e));
		
		// 테이블뷰 - 게시글 목록
		ObservableList<BoardVO> list = InputDAO.boardList();
		
		//테이블뷰 - 게시번호
		TableColumn<BoardVO, Integer> tcBoardNo =
				(TableColumn<BoardVO, Integer>) tableView.getColumns().get(0);
		tcBoardNo.setCellValueFactory(
				new PropertyValueFactory<BoardVO, Integer>("boardNo"));
		
		//테이블뷰 - 제목
		TableColumn<BoardVO, String> tcTitle = 
				(TableColumn<BoardVO, String>) tableView.getColumns().get(1);
		tcTitle.setCellValueFactory(
				new Callback<CellDataFeatures<BoardVO, String>, ObservableValue<String>>(){

					@Override
					public ObservableValue<String> call(CellDataFeatures<BoardVO, String> param) {
						return param.getValue().titleProperty();
					}
				});
		
		//테이블뷰 - 만료일
		TableColumn<BoardVO, String> tcEdate = (TableColumn<BoardVO, String>) tableView.getColumns().get(2);
		tcEdate.setCellValueFactory(new PropertyValueFactory<BoardVO, String>("exitDate"));
//		tableView.getColumns().add(tcEdate);
		
		//테이블뷰 - 공개
		TableColumn<BoardVO, String> tcPub = (TableColumn<BoardVO, String>) tableView.getColumns().get(3);
		tcPub.setCellValueFactory(new PropertyValueFactory<BoardVO, String>("publicity"));
		
		tableView.setItems(list);

		
		// 게시글 세부
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<BoardVO>() {

			@Override
			public void changed(ObservableValue<? extends BoardVO> arg0, BoardVO oldValue, BoardVO newValue) {
				
				if(newValue != null) {
					System.out.println(newValue.getBoardNo());
					boardNo.setText(String.valueOf(newValue.getBoardNo()));
					title.setText(newValue.getTitle());
					publicity.setValue(newValue.getPublicity());
					contents.setText(newValue.getContents());
					exitDate.setValue(LocalDate.parse(newValue.getExitDate()));
				}else {
					boardNo.setText(null);
					title.setText(null);
					publicity.setValue(null);
					contents.setText(null);
					exitDate.setValue(null);
				}
			
			}
			
			
		});
		
	} //end of initialize

	public void updateBtnAction(ActionEvent e) { //수정버튼
		
		BoardVO vo = new BoardVO();
		vo.setBoardNo(Integer.parseInt(boardNo.getText()));
		vo.setContents(contents.getText());
		vo.setExitDate(exitDate.getValue().toString());
		vo.setPublicity(publicity.getValue());
		InputDAO.updateBo(vo);
		
		tableView.setItems(InputDAO.boardList());
	}
	
	public void deleteBtnAction(ActionEvent e) { //삭제버튼
		
		BoardVO vo = new BoardVO();
		vo.setBoardNo(Integer.parseInt(boardNo.getText()));
		InputDAO.deleteBo(vo);
		
		tableView.setItems(InputDAO.boardList());
	}
	
	
	// 새창열기
	public void addBtnAction(ActionEvent e) {
		
		 Stage stage = new Stage(StageStyle.DECORATED);
		 stage.initModality(Modality.WINDOW_MODAL);
		 stage.initOwner(primaryStage);
		 
		 try {
			AnchorPane ap = FXMLLoader.load(getClass().getResource("BoardAdd.fxml"));
			Scene scene = new Scene(ap);
			stage.setScene(scene);
			stage.show();
			
			Button btnInsertReg = (Button) ap.lookup("#btnInsertReg");
			btnInsertReg.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					InputBoardVO vo = new InputBoardVO();
					
					TextField txtTitle = (TextField) ap.lookup("#txtTitle");	
					vo.setTitle(txtTitle.getText());
					
					TextField txtPassword = (TextField) ap.lookup("#txtPassword");
					vo.setPasswd(txtPassword.getText());
					
					ComboBox comboPublic = (ComboBox) ap.lookup("#comboPublic");
					vo.setPublicity(comboPublic.getValue().toString());
					
					DatePicker dateExit = (DatePicker) ap.lookup("#dateExit");
					vo.setExitDate(dateExit.getValue().toString());
					
					TextArea txtContent = (TextArea) ap.lookup("#txtContent");
					vo.setContents(txtContent.getText());
					
					InputDAO inputDao = new InputDAO();
					inputDao.insertBo(vo);
					
					tableView.setItems(InputDAO.boardList());
					
				}
				
			});
			
			Button btnCancelReg = (Button) ap.lookup("#btnCancelReg");
			btnCancelReg.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					stage.close();
				}
				
			});

			
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
}
