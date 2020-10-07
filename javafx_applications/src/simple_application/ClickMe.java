package simple_application;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class ClickMe extends Application {
	/*
	 * The Application class is responsible for the life cycle of of the javafx
	 * application It calls the init method, then the start method , wait for the
	 * application to end then calls the stop method.
	 * 
	 */
	int clickCounter = 0;
	@Override
	public void start(Stage primaryStage) {
		//Creating a new label
		Label lbl = new Label();
		// Create a new button
		Button btn = new Button("Click Me");
		btn.setOnAction(e -> buttonClick(btn, lbl)); // setting the button action on click

		// Create a layout pane. This will be the parent node for the scene.
		BorderPane bpane = new BorderPane();

		bpane.setCenter(btn);
		bpane.setTop(lbl);
		// Create a Scene (the container which contains all the user interface
		// elements).
		Scene scene = new Scene(bpane, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Simple JavaFX Application");
		primaryStage.show();// Show the Stage (main canvas for the application)

	}

	public static void main(String[] args) {
		/*
		 * The launch method initiates the Super class (Application) then starts the
		 * application by calling init and the start methods. The launch method does not
		 * return until until the application ends.
		 */

		System.out.println("Launching the application..."); // This statement will be printed
		launch(args);
		System.out.println("The application has ended"); // This statement will not be executed until the program ends.

	}

	public void buttonClick(Button button, Label label) {
		/*
		 * method to handle the "Click Me" button
		 * reset the text on click depends on the text before action
		 */
		
		if (button.getText() == "Click Me") {
			button.setText("Button was clicked");
			++clickCounter;
			label.setText("You have cliked this button " + clickCounter + " times");
			
		} else {
			button.setText("Click Me");
		}
	}

}
