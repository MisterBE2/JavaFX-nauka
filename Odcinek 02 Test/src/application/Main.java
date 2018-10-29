// JavaFX dokumentacja https://docs.oracle.com/javafx/2/api/index.html

package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage ps) throws Exception {
		
		StackPane sp = new StackPane(); // Jakby elementy sceny
		Button button = new Button("Przycisk"); // Pojeyñczy lement sceny
		sp.getChildren().add(button); // Dodoaje przycsik do sceny
		
		Scene scene = new Scene(sp, 800, 600); // Tworzê scenê
		
		ps.setScene(scene); // Dodajê do teatru scenê
		
		// Ciekawe Metody
		
		//ps.setWidth(200); // Ustala wielkoœæ Teatru, nie zaleznie od sceny
		//ps.setHeight(200);
		//ps.setResizable(false); // Mówi o tym czy mo¿na zmieniaæ rozmiar strony
		//ps.setFullScreen(true); // Decyduje czy ustawiæ teatr jako pe³ne okno, bez obramowañ
		
		// Ustalanie po³o¿enia okna
		//ps.setX(100);
		//ps.setY(100);
		
		//Ustalanie sytlu okna
		//ps.initStyle(StageStyle.UNDECORATED); // Robi okno bez ramek
		//ps.initStyle(StageStyle.TRANSPARENT); // To co powyrzej, ale mo¿na ustawiæ przezrpoczystosc
		//ps.initStyle(StageStyle.UTILITY); // Daje tylko przycisk x
		//ps.initStyle(StageStyle.UNIFIED); // Normalny wygl¹d okna
		//ps.initStyle(StageStyle.DECORATED); //-||-
		
		//ps.setOpacity(0.5); // Ustala przezroczystosc okna
		
		ps.setTitle("Odcinek 03 Pierwszy projekt");
		ps.show();// Pokazujê teatr
	}
}
