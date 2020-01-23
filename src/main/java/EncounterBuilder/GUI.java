package EncounterBuilder;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;


public class GUI extends Application {

	 @Override
	 public void start(Stage primaryStage) {
		 
		 Pane bodyPane = new Pane();
		 bodyPane.setPadding(new Insets(5, 5, 5, 5));
		 
	    Text body = new Text(20, 20, "Hello There");
	    
	    
	    bodyPane.getChildren().add(body);
	    
	    Scene scene = new Scene(bodyPane, 200, 250);
	    primaryStage.setTitle("Encounter-Builder v 0.1");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	    
	  }
	  
	  public static void main(String[] args) throws IOException, InvalidFormatException{ 
		 
		 ExcelReader.readExcel();
		  
		  launch(args);
	    
	  }

}
