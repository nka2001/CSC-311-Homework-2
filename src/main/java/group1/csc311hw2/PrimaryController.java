package group1.csc311hw2;

import java.io.IOException;
import javafx.animation.FillTransition;
import javafx.animation.ParallelTransition;

import javafx.animation.ScaleTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Cell;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PrimaryController {

    private int counter = 7;
    private int totalMoves = 0;
    private Circle circ;
    @FXML
    private Circle circ1;
    @FXML
    private Circle circ2;
    @FXML
    private Rectangle rect1;
    @FXML
    private Rectangle rect2;
    @FXML
    private Rectangle rect3;
    @FXML
    private Circle circ3;
    @FXML
    private Circle circ4;
    @FXML
    private Circle circ5;
    @FXML
    private Circle circ6;
    @FXML
    private Circle circ7;
    @FXML
    private Circle circ8;
    @FXML
    private Circle circ9;
    @FXML
    private Rectangle rect4;
    @FXML
    private Rectangle rect6;
    @FXML
    private Rectangle rect8;
    @FXML
    private Rectangle rect7;
    @FXML
    private Rectangle rect5;
    @FXML
    private Rectangle rect9;
    @FXML
    private MenuItem createNewGame;
    @FXML
    private MenuItem close;
    
    
    
  @FXML
    private void handleOnMouseClicked(javafx.scene.input.MouseEvent event) {
        
        if(counter % 2 == 0 && rect1.getOpacity() != 1){
            circ1.setOpacity(1);
            counter++;
            totalMoves++;
        } 
        if(counter % 2 == 1 && circ1.getOpacity() != 1){
            rect1.setOpacity(1);
            counter++;
            totalMoves++;
        }
        
         if(checkTotalMoves()){
                makeAlert();
            }
         check();
    }

    @FXML
    private void handleOnMouseClicked2(MouseEvent event) {
        
         if(counter % 2 == 0 && rect2.getOpacity() != 1){
            circ2.setOpacity(1);
            counter++;
            totalMoves++;
        } 
        if(counter % 2 == 1 && circ2.getOpacity() != 1){
            rect2.setOpacity(1);
            counter++;
            totalMoves++;
        }
        
         if(checkTotalMoves()){
                makeAlert();
            }
         check();
    }

    @FXML
    private void handleOnMouseClicked3(MouseEvent event) {
        
        
         if(counter % 2 == 0 && rect3.getOpacity() != 1){
            circ3.setOpacity(1);
            counter++;
            totalMoves++;
        } 
        if(counter % 2 == 1 && circ3.getOpacity() != 1){
            rect3.setOpacity(1);
            counter++;
            totalMoves++;
        }
         if(checkTotalMoves()){
                makeAlert();
            }
        check();
    }

    @FXML
    private void handleOnMouseClicked4(MouseEvent event) {
        
          if(counter % 2 == 0 && rect4.getOpacity() != 1){
            circ4.setOpacity(1);
            counter++;
            totalMoves++;
        } 
        if(counter % 2 == 1 && circ4.getOpacity() != 1){
            rect4.setOpacity(1);
            counter++;
            totalMoves++;
        }
        
         if(checkTotalMoves()){
                makeAlert();
            }
         check();
        
        
    }

    @FXML
    private void handleOnMouseClicked6(MouseEvent event) {
          if(counter % 2 == 0 && rect6.getOpacity() != 1){
            circ6.setOpacity(1);
            counter++;
            totalMoves++;
        } 
        if(counter % 2 == 1 && circ6.getOpacity() != 1){
            rect6.setOpacity(1);
            counter++;
            totalMoves++;
        }
        if(checkTotalMoves()){
                makeAlert();
            }
        check();
        
    }

    @FXML
    private void handleOnMouseClicked7(MouseEvent event) {
          if(counter % 2 == 0 && rect7.getOpacity() != 1){
            circ7.setOpacity(1);
            counter++;
            totalMoves++;
        } 
        if(counter % 2 == 1 && circ7.getOpacity() != 1){
            rect7.setOpacity(1);
            counter++;
            totalMoves++;
        }
        if(checkTotalMoves()){
                makeAlert();
            }
        check();
    }

    @FXML
    private void handleOnMouseClicked8(MouseEvent event) {
          if(counter % 2 == 0 && rect8.getOpacity() != 1){
            circ8.setOpacity(1);
            counter++;
            totalMoves++;
        } 
        if(counter % 2 == 1 && circ8.getOpacity() != 1){
            rect8.setOpacity(1);
            counter++;
            totalMoves++;
        }
        if(checkTotalMoves()){
                makeAlert();
            }
        
        check();
    }

    @FXML
    private void handleOnMouseClicked9(MouseEvent event) {
          if(counter % 2 == 0 && rect9.getOpacity() != 1){
            circ9.setOpacity(1);
            counter++;
            totalMoves++;
        } 
        if(counter % 2 == 1 && circ9.getOpacity() != 1){
            rect9.setOpacity(1);
            counter++;
            totalMoves++;
        }
        if(checkTotalMoves()){
                makeAlert();
            }
        
        check();
    }

    @FXML
    private void handleOnMouseClicked5(MouseEvent event) {
          if(counter % 2 == 0 && rect5.getOpacity() != 1){
            circ5.setOpacity(1);
            counter++;
            totalMoves++;
        } 
        if(counter % 2 == 1 && circ5.getOpacity() != 1){
            rect5.setOpacity(1);
            counter++;
            totalMoves++;
            
          
            
        }
        
       
        
        
        if(check()){
            
        }
        
        if(checkTotalMoves()){
                makeAlert();
            }
    }

    
    public boolean checkTotalMoves(){
        
        boolean gameOver = false;
        
        if(totalMoves == 9){
            gameOver = true;
        }
        
        
        return gameOver;
    }
    
    
    public void makeAlert(){
        Alert a = new Alert(AlertType.INFORMATION);
        a.setTitle("Game Over");
        a.setHeaderText("out of moves");
        
        a.showAndWait();
        
    }
    
    
    public Boolean check(){
        
        boolean gameOver = false;
        
        System.out.println("in check");
        if(circ1.getOpacity() == 1 && circ2.getOpacity() == 1 && circ3.getOpacity() == 1){
            FillTransition ft = new FillTransition(Duration.seconds(3), circ1);
            ft.setToValue(Color.ORANGE);
            ft.setCycleCount(2);
            ft.setAutoReverse(true);
            
            FillTransition ft2 = new FillTransition(Duration.seconds(3), circ2);
            ft2.setToValue(Color.ORANGE);
            ft2.setCycleCount(2);
            ft2.setAutoReverse(true);
            
            FillTransition ft3 = new FillTransition(Duration.seconds(3), circ3);
            ft3.setToValue(Color.ORANGE);
            ft3.setCycleCount(2);
            ft3.setAutoReverse(true);
            
            ParallelTransition pt = new ParallelTransition(ft,ft2,ft3);
            pt.play();
            
            gameOver = true;
            
        }
        
        return gameOver;
    }

    @FXML
    private void makeNewGame(ActionEvent event) {
        
        
        
        
        circ1.setOpacity(0);
        circ2.setOpacity(0);
        circ3.setOpacity(0);
        circ4.setOpacity(0);
        circ5.setOpacity(0);
        circ6.setOpacity(0);
        circ7.setOpacity(0);
        circ8.setOpacity(0);
        circ9.setOpacity(0);
        
        rect1.setOpacity(0);
        rect2.setOpacity(0);
        rect3.setOpacity(0);
        rect4.setOpacity(0);
        rect5.setOpacity(0);
        rect6.setOpacity(0);
        rect7.setOpacity(0);
        rect8.setOpacity(0);
        rect9.setOpacity(0);
        
        counter = 0;
        totalMoves = 0;
    }

    @FXML
    private void closeProgram(ActionEvent event) {
        
        Platform.exit();
        System.exit(0);

        
    }
}
