/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package calculatorapp;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ASUS
 */
public class CalculatorApp extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
      Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
       Scene scene = new Scene(root,430,504);
       scene.getStylesheets().add(getClass().getResource("fxml.css").toExternalForm());
       primaryStage.setTitle("Calculator");
       primaryStage.setResizable(false);
       primaryStage.setScene(scene);
       primaryStage.show();
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
