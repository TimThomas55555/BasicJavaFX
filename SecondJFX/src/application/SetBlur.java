package application;

import javafx.fxml.FXML;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Glow;
import javafx.scene.effect.Reflection;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

//la clase controladora que añade un efecto a la imagen
	class SetBlur {

		// la etiqueta FXML permite acceder al componente imageView ya creado en
		// fxml
		@FXML
		private ImageView forestview;

		@FXML
		public void initialize() {
			//forestview.setEffect(new Glow(0.8));			
			//forestview.setEffect(new Reflection(0.7,10.0,30.0,100.0));
			//forestview.setEffect(new DropShadow(0.8,Color.color(0.9, 0.5, 0.5)));
			//forestview.setEffect(new GaussianBlur(10));
			//forestview.setEffect(new BoxBlur(4.0,3.0,3));
			//forestview.setEffect(new Bloom(0.8));
			forestview.setEffect(new SepiaTone(0.8));
			
		}
	}