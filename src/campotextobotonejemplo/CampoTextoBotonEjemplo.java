/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package campotextobotonejemplo;

import componentes_blancaadrian.CampoTextoBoton;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class CampoTextoBotonEjemplo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        CampoTextoBoton campoTextoBoton = new CampoTextoBoton();
        campoTextoBoton.setText("Hello!");
        
        Stage stage = new Stage();
        stage.setScene(new Scene(campoTextoBoton));
        stage.setTitle("CampoTextoBoton");
        stage.setWidth(300);
        stage.setHeight(200);
        stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
