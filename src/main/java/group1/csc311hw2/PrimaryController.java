package group1.csc311hw2;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class PrimaryController {

    private int counter = 0;
    
    @FXML
    private GridPane gameBoard;
    
    @FXML
    public Circle circ = new Circle();
    public Circle circ2 = new Circle();
    
    
    private Rectangle rect = new Rectangle();
    private Rectangle rect2 = new Rectangle();
   
    public void initialize(){
       
        circ.setFill(Color.RED);
        circ.setRadius(10);
        circ.setOpacity(0);
        circ2.setFill(Color.RED);
        circ2.setRadius(10);
        rect.setFill(Color.BLUE);
        
    
        
        for(int i =0; i< gameBoard.getColumnCount(); i++){
            for(int j = 0; j < gameBoard.getRowCount(); j++){
                if(i == 0 && j == 0)
                    gameBoard.add(circ, 0,0);
                if( i == 1 && j == 1)
                    gameBoard.add(circ2, 1,1);
            }
        }
        
        
    }

    @FXML
    private void handleOnMouseClicked(javafx.scene.input.MouseEvent event) {
        
        mouseEntered(event);
        while(counter <= 10){
            if(counter % 2 == 1 && rect.getOpacity() != 1 ){//try getting the cell clicked on, or just seeing if the cell is cell 0,0 for these if elses
                circ.setOpacity(1);
                
            
            }
            if(counter % 2 == 0 && circ.getOpacity() != 1){
                rect.setOpacity(1);
                
                
            }
            
            counter++;
        }
        
        
    }
    
    private void mouseEntered(MouseEvent e){
        Node s = e.getPickResult().getIntersectedNode();
        Integer col = GridPane.getColumnIndex((Node) e.getTarget());
        Integer row = GridPane.getRowIndex(s);
        System.out.println(col + " " + row);
    }

}
