package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {

	private AnchorPane mypane;


	@Override
	public void start(Stage stage) throws IOException {



		FXMLLoader loader = new FXMLLoader(getClass().getResource("vista4.fxml"));

		mypane = (AnchorPane) loader.load();

		stage.setTitle("Where's the squirrel?");
		stage.setScene(new Scene(mypane));
		stage.show();
	}


	public static void main(String[] args) {
		launch(args);
	}

}