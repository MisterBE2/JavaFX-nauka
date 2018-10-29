package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Global g = new Global();
		
		try {
			FXMLLoader loader  = g.getResLoader("MainScreen");
			Scene scene = new Scene(loader.load());
			primaryStage.setTitle("Wiele elementów dynamicznych");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
