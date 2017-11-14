/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabeticsorter;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author Frederik Tubæk
 */
public class FXMLDocumentController implements Initializable {
   
    
    static ArrayList<String> listOfWords = new ArrayList<String>();
    private int arraySize = 0;
   
    
    @FXML
    private TextField txtWord;
    @FXML
    private ListView<String> listWords;
    @FXML
    private Label label;
    @FXML
    private Label lblWords;
    
    @FXML
    private void handleButtonAction(ActionEvent event) 
    {
       String word = txtWord.getText().trim();
       listWords.getItems().addAll(word);
       listOfWords.add(word);
       txtWord.clear();
       arraySize++;
       String numberOfWords = Integer.toString(arraySize);
       lblWords.setText("Number of Words " + numberOfWords);
       
       

    
    }
    
    @FXML
    private void handleSortAction(ActionEvent event) 
    {
        Collections.sort(listOfWords);
        listWords.getItems().clear();
        listWords.getItems().addAll(listOfWords);
    }
    

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    
}
