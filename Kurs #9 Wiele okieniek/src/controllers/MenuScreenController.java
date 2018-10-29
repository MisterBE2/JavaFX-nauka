package controllers;

import application.Global;
import javafx.application.Platform;
import javafx.fxml.FXML;


public class MenuScreenController {

	Global g;
	
	private MainScreenController msc;
	
	// Obs³uga przycisków menui
	@FXML
	public void onActionOpenApplication() {
		msc.loadApplicationScreen();
	}

	@FXML
	public void onActionOptions() {
		msc.loadOptionsScreen();
	}

	@FXML
	public void onActionExit() {
		Platform.exit();
	}
	
	@FXML public void initialize()
	{
		g = new Global();
	}
	
	public void setMainController(MainScreenController msc)
	{
		this.msc = msc;
	}

}
