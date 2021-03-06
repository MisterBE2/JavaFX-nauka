package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import application.Global;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Global g = new Global();
		
		try {
			FXMLLoader loader  = g.getResLoader("MainScreen");
			Scene scene = new Scene(loader.load(), 400, 400);
			primaryStage.setTitle("JavaFX kurs #9");
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
