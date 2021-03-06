package controllers;

import javafx.fxml.FXML;

import application.Global;

public class ApplicationScreenController {
	
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
