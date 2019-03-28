import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class AverageController {

	@FXML
	private MenuBar menu;

	@FXML
	private Tab sourceTab;

	@FXML
	private TextArea text1;

	@FXML
	private Tab averageTab;

	@FXML
	private TextArea text2;

	@FXML
	void close(ActionEvent event) {
		System.exit(0);
	}

	@SuppressWarnings("resource")
	@FXML
	void openFile(ActionEvent event) throws IOException {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Text");
		fileChooser.getExtensionFilters().addAll(
				new ExtensionFilter("Text Files", "*.doc", "*.docx", "*.csv"));
		File selectedFile = fileChooser.showOpenDialog(null);
		if (selectedFile != null) {

			try {
				BufferedReader reader;
				reader = new BufferedReader(new FileReader(selectedFile));
				String fileName;
				while ((fileName = reader.readLine()) != null) {
					text1.appendText(fileName);
					text1.appendText("\n");
					text2.appendText(fileName);
					text2.appendText("\n");
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}

	}
}

