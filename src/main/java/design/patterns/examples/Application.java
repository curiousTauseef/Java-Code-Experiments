package design.patterns.examples;

import design.patterns.examples.controller.Controller;
import design.patterns.examples.model.Model;
import design.patterns.examples.view.View;


import javax.swing.*;

public class Application {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                Application.runApp();
            }

        });
    }

    public static void runApp() {
        Model model = new Model();
        View view = new View(model);

        Controller controller = new Controller(view, model);

        view.setLoginListener(controller);
    }

}
