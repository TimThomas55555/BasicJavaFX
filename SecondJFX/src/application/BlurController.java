package application;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.Pane;

public class BlurController {
	

	
	@FXML
	private Pane mypane;   

	


	@FXML
    public void setblur() {           
             mypane.setEffect(new GaussianBlur(5));

    }
	
	@FXML
    public void setfocus() {           
             mypane.setEffect(new GaussianBlur(0));

    }
	
	@FXML
	private void handleClose() {
	
	        System.exit(0);
	}
	
}
