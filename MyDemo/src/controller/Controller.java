package controller;

import view.MainFrame;
import view.MyPanel;

public class Controller {
	private MainFrame myframe;
	private MyPanel mypanel;
	
	public Controller() {
		myframe=new MainFrame();
		mypanel= new MyPanel();
		
		myframe.setContentPane(mypanel);
				
	}

}
