package controllers;

import application.Global;
import javafx.fxml.FXML;

public class OptionsScreenController {
	
	private Global g;
	private MainScreenController msc;
	
	@FXML public void onActionReturn()
	{
		msc.loadMenuScreen();
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
