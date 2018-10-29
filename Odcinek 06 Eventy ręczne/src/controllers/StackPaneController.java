package controllers;
 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class StackPaneController {

	@FXML
	public Button buttonID;

	public StackPaneController() {

	}

	@FXML
	void initialize() {
		EventHandler<ActionEvent> buttonHandler = new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("To jest handler buttona");
			}
		};
		
		EventHandler<MouseEvent> mouseHandler = new EventHandler<MouseEvent>() {
			
			@Override
			public void handle(MouseEvent event) {
				System.out.println("To jest handler myszki");
				
			}
		};
		
		// Event napisany kodem lambda
		
		EventHandler<MouseEvent> ms = e->{
			System.out.println("Event lambda!");
		};
		
		buttonID.addEventHandler(ActionEvent.ACTION, buttonHandler);
		buttonID.addEventHandler(MouseEvent.MOUSE_ENTERED, mouseHandler);
		buttonID.addEventHandler(MouseEvent.MOUSE_EXITED, ms);
		
		// Inny sposób podpinania eventów
		buttonID.setOnAction(e->{System.out.println("XD");});
		
		// Usówanie eventów
		buttonID.removeEventHandler(ActionEvent.ACTION, buttonHandler);
	}
	
}
