package design.patterns.examples.controller;


import design.patterns.examples.model.Model;
import design.patterns.examples.view.LoginFormEvent;
import design.patterns.examples.view.LoginListener;
import design.patterns.examples.view.View;

public class Controller implements LoginListener {
	private View view;
	private Model model;
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void loginPerformed(LoginFormEvent event) {
		System.out.println("Login event received: " + event.getName() + "; " + event.getPassword());
		
	}

}
