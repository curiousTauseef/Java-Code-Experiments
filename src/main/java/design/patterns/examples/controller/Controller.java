package design.patterns.examples.controller;


import design.patterns.examples.model.Model;
import design.patterns.examples.view.LoginFormEvent;
import design.patterns.examples.view.LoginListener;
import design.patterns.examples.view.View;

public class Controller implements LoginListener {
	@SuppressWarnings("unused")
	private View view;
	@SuppressWarnings("unused")
	private Model model;
	
	/*
	 * We need to pass both the view and the model in the constructor
	 */
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}
	
	/*
	 * (non-Javadoc)
	 * @see design.patterns.examples.view.LoginListener#loginPerformed(design.patterns.examples.view.LoginFormEvent)
	 * This is going to be my subject of the observer pattern
	 */

	@Override
	public void loginPerformed(LoginFormEvent event) {
		System.out.println("Login event received: " + event.getName() + "; " + event.getPassword());
		
	}

}
