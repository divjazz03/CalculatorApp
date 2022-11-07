/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package calculatorapp;

import java.net.URL;
import javafx.event.ActionEvent;
import javafx.event.EventTarget;
import javafx.fxml.FXML;
import java.math.BigDecimal;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class FXMLController {
    private BigDecimal left;
    private String selectedOperator;
    private boolean numberInputting;

    
    
    @FXML
    TextField textfield1;

    public FXMLController() {
        this.left = BigDecimal.ZERO;
        this.selectedOperator = "";
        this.numberInputting = false;
    }
    @FXML
    protected void handleonAnyButtonClicked(ActionEvent event){
        Button button = (Button)event.getSource();
        final String buttonText = button.getText();
        if (buttonText.equals("DEL")) {
            selectedOperator = "";
            numberInputting = false;
            textfield1.setText("0");
            return;
            
        }
        if (buttonText.matches("[0-9\\.]")) {
            if (!numberInputting) {
                numberInputting = true;
                textfield1.clear();
            }
            textfield1.appendText(buttonText);
            return; 
        }
        if (buttonText.matches("[+−×÷]")) {
            left = new BigDecimal(textfield1.getText());
            textfield1.appendText(buttonText);
            selectedOperator = buttonText;
            numberInputting = false;
            return;
        }
        if (buttonText.equals("=")) {
            final BigDecimal right = numberInputting? new BigDecimal(textfield1.getText()): left;
            left = calculate(selectedOperator, left, right);
            textfield1.setText(left.toString());
            numberInputting = false;
            return;
        }
         
        }
    BigDecimal calculate(String operator, BigDecimal left, BigDecimal right){
            switch(operator){
                case "+":
                    return left.add(right);
                case "−":
                    return left.subtract(right);
                case "×":
                    return left.multiply(right);
                case "÷":
                    return left.divide(right);
                default:
            }
            return right;
    
    }
    
    

    
    


    

    
    
   
   
}      
   
   
    
            
   
    

    
   
  
       
   
    


