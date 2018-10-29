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
		Button button = new Button("Przycisk"); // Pojey�czy lement sceny
		sp.getChildren().add(button); // Dodoaje przycsik do sceny
		
		Scene scene = new Scene(sp, 800, 600); // Tworz� scen�
		
		ps.setScene(scene); // Dodaj� do teatru scen�
		
		// Ciekawe Metody
		
		//ps.setWidth(200); // Ustala wielko�� Teatru, nie zaleznie od sceny
		//ps.setHeight(200);
		//ps.setResizable(false); // M�wi o tym czy mo�na zmienia� rozmiar strony
		//ps.setFullScreen(true); // Decyduje czy ustawi� teatr jako pe�ne okno, bez obramowa�
		
		// Ustalanie po�o�enia okna
		//ps.setX(100);
		//ps.setY(100);
		
		//Ustalanie sytlu okna
		//ps.initStyle(StageStyle.UNDECORATED); // Robi okno bez ramek
		//ps.initStyle(StageStyle.TRANSPARENT); // To co powyrzej, ale mo�na ustawi� przezrpoczystosc
		//ps.initStyle(StageStyle.UTILITY); // Daje tylko przycisk x
		//ps.initStyle(StageStyle.UNIFIED); // Normalny wygl�d okna
		//ps.initStyle(StageStyle.DECORATED); //-||-
		
		//ps.setOpacity(0.5); // Ustala przezroczystosc okna
		
		ps.setTitle("Odcinek 03 Pierwszy projekt");
		ps.show();// Pokazuj� teatr
	}
}
