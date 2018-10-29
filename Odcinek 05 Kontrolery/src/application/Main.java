package application;
	
import controllers.StackPaneController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			FXMLLoader l = new FXMLLoader();
			l.setLocation(this.getClass().getResource("/res/StackPaneWindow.fxml"));
			
			// Rêczne dodawanie kontrolera
			//StackPaneController spcTest = new StackPaneController();
			//l.setController(spcTest);
			
			StackPane sp = l.load();
			
			StackPaneController spc = l.getController(); // Wczytuje kontroler, je¿eli zosta³o skonfigurowane po³¹czenie w pliku FXML

			Scene s = new Scene(sp);
			primaryStage.setScene(s);

			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
