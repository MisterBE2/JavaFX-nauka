package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StackPaneController {

	@FXML
	public Button buttonID;

	public StackPaneController() {

	}

	@FXML
	void initialize() {
		
	}
	
	@FXML
	public void onActonButton(ActionEvent e)
	{
		//buttonID.setText("XDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
		System.out.println("Wciœniêcie! "+e.getSource());
	}
	
}
