import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class AverageApp extends Application
{
	public void start(Stage primaryStage) throws Exception {
		Parent g=FXMLLoader.load(getClass().getResource("AverageGUI.fxml"));
		Scene sn = new Scene(g);
		primaryStage.setScene(sn);
		primaryStage.show();
		primaryStage.setTitle("Homework 6");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
   
   
}