package group1.csc311hw2;

import java.io.IOException;
import javafx.animation.FillTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;

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
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PrimaryController {

    private int counter = 0;//counter for determining moves made
    private int totalMoves = 0;//total moves made 
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

    private boolean gameOver = false;//needed this variable to determine if the game has ended 

    /**
     * this method takes an event as a parameter and allows a shape to be made
     * visible through opacity values, it first checks if the game was over so
     * no new shapes can be made, player 1 is an even count (%2) and player 2 is
     * an odd count, thats how visibility is controlled, then total moves are
     * checked and then alerts are made if need be
     *
     * @param event
     */
    @FXML
    private void handleOnMouseClicked(javafx.scene.input.MouseEvent event) {

        if (!gameOver) {//first check if gameover is false, (negated by the !)

            if (counter % 2 == 0 && rect1.getOpacity() != 1) {//if the counter is even then AND if rectangle 1s opacity is not 1 (0)
                circ1.setOpacity(1);//then circle 1 is made visible
                counter++;//counter goes up for future moves 
                totalMoves++;//total moves goes up
            }
            if (counter % 2 == 1 && circ1.getOpacity() != 1) {//if the counter is odd AND if circle 1s opacity is not 1 (0)
                rect1.setOpacity(1);//rectangle 1 is made visible 
                counter++;//counter goes up for future moves
                totalMoves++;//total moves goes up
            }

            if (checkTotalMoves()) {//checks if there are no more moves left 
                makeAlert();//if there are no more moves then an alert is generated saying so
            }
            check();//check if a winner is present
        } else {
            makeGameOver();//if gameover is true, negated to false by !, then this method will generate an alert saying so 
        }
    }

    /**
     * this method takes an event as a parameter and allows a shape to be made
     * visible through opacity values, it first checks if the game was over so
     * no new shapes can be made, player 1 is an even count (%2) and player 2 is
     * an odd count, thats how visibility is controlled, then total moves are
     * checked and then alerts are made if need be
     *
     * @param event
     */
    @FXML
    private void handleOnMouseClicked2(MouseEvent event) {

        if (!gameOver) {//first check if gameover is false, negated by !
            if (counter % 2 == 0 && rect2.getOpacity() != 1) {//if counter is even AND rectangle 2's opacity is not 1 (0) 
                circ2.setOpacity(1);//circle 2 is made visible 
                counter++;//counter goes up
                totalMoves++;//total moves goes up
            }
            if (counter % 2 == 1 && circ2.getOpacity() != 1) {//if the counter is odd AND circle2's opacity is not 1
                rect2.setOpacity(1);//rectangle is made visible 
                counter++;//counter goes up
                totalMoves++;//total moves gores up
            }

            if (checkTotalMoves()) {//check if there are no more moves
                makeAlert();//make an alert saying so 
            }
            check();//check for winner
        } else {
            makeGameOver();//if gameover is true, negated to false by !, then an alert is made saying so 
        }
    }

    /**
     * this method takes an event as a parameter and allows a shape to be made
     * visible through opacity values, it first checks if the game was over so
     * no new shapes can be made, player 1 is an even count (%2) and player 2 is
     * an odd count, thats how visibility is controlled, then total moves are
     * checked and then alerts are made if need be
     *
     * @param event
     */
    @FXML
    private void handleOnMouseClicked3(MouseEvent event) {

        if (!gameOver) {//first check if the game is over
            if (counter % 2 == 0 && rect3.getOpacity() != 1) {//if the counter is even AND rectangle 3s opacity value is not 1
                circ3.setOpacity(1);//circle 3 is made visible 
                counter++;//counter goes up
                totalMoves++;//total moves up goes up
            }
            if (counter % 2 == 1 && circ3.getOpacity() != 1) {//if the counter is odd AND circle 3s opacity value is not 1
                rect3.setOpacity(1);//rectangle 3 is made visible 
                counter++;//counter goes up
                totalMoves++;//total moves goes up
            }
            if (checkTotalMoves()) {//if the there are no more moves left then 
                makeAlert();//generate an alert saying so 
            }
            check();//check if there is a winner
        } else {
            makeGameOver();//if game over is true, generate an alert saying the game is over
        }
    }

    /**
     * this method takes an event as a parameter and allows a shape to be made
     * visible through opacity values, it first checks if the game was over so
     * no new shapes can be made, player 1 is an even count (%2) and player 2 is
     * an odd count, thats how visibility is controlled, then total moves are
     * checked and then alerts are made if need be
     *
     * @param event
     */
    @FXML
    private void handleOnMouseClicked4(MouseEvent event) {

        if (!gameOver) {//check if the game is over
            if (counter % 2 == 0 && rect4.getOpacity() != 1) {//if the counter is even AND rectangle 4s opacity value is not 1
                circ4.setOpacity(1);//circle 4 is made visible
                counter++;//counter goes up
                totalMoves++;//total moves goes up
            }
            if (counter % 2 == 1 && circ4.getOpacity() != 1) {//if teh counter is odd AND circle 4s opacity value is not 1 
                rect4.setOpacity(1);//rectangle 4 is made visible 
                counter++;//counter goes up
                totalMoves++;//total moves goes up
            }

            if (checkTotalMoves()) {//if there are no more possible moves
                makeAlert();//an alert saying so is generated
            }
            check();//check if there is a winner
        } else {
            makeGameOver();//if game over is true, then an alert is made saying so 
        }

    }

    /**
     * this method takes an event as a parameter and allows a shape to be made
     * visible through opacity values, it first checks if the game was over so
     * no new shapes can be made, player 1 is an even count (%2) and player 2 is
     * an odd count, thats how visibility is controlled, then total moves are
     * checked and then alerts are made if need be
     *
     * @param event
     */
    @FXML
    private void handleOnMouseClicked6(MouseEvent event) {

        if (!gameOver) {//if the game is over
            if (counter % 2 == 0 && rect6.getOpacity() != 1) {//if the counter is even AND rectangle 6s opacity value is not 1
                circ6.setOpacity(1);//circle 6 is made visible 
                counter++;//counter goes up
                totalMoves++;//total moves goes up
            }
            if (counter % 2 == 1 && circ6.getOpacity() != 1) {//if the counter is odd AND circle 6s opacity value is not 1
                rect6.setOpacity(1);//rectangle 6 is made visible
                counter++;//counter goes up
                totalMoves++;//total moves goes up
            }
            if (checkTotalMoves()) {//check if there are no more possible moves
                makeAlert();//generate an alert saying so
            }
            check();//check if there is a winner
        } else {
            makeGameOver();//if the game is over generate an alert saying so 
        }

    }

    /**
     * this method takes an event as a parameter and allows a shape to be made
     * visible through opacity values, it first checks if the game was over so
     * no new shapes can be made, player 1 is an even count (%2) and player 2 is
     * an odd count, thats how visibility is controlled, then total moves are
     * checked and then alerts are made if need be
     *
     * @param event
     */
    @FXML
    private void handleOnMouseClicked7(MouseEvent event) {

        if (!gameOver) {//if the game is not over
            if (counter % 2 == 0 && rect7.getOpacity() != 1) {//if the counter is even AND rectangle 7s opacity value is not 1
                circ7.setOpacity(1);//circle 7 is made visible 
                counter++;//counter goes up
                totalMoves++;//total moves goes up
            }
            if (counter % 2 == 1 && circ7.getOpacity() != 1) {//if the counter is odd AND circle 7s opacity value is not 1
                rect7.setOpacity(1);//rectangle 7 is made visible 
                counter++;//counter goes up
                totalMoves++;//total moves goes up
            }
            if (checkTotalMoves()) {//check if there are no more possible moves 
                makeAlert();//generate an alert if there are no more moves
            }
            check();//check for winner
        } else {
            makeGameOver();//if the game is over, make alert saying so 
        }
    }

    /**
     * this method takes an event as a parameter and allows a shape to be made
     * visible through opacity values, it first checks if the game was over so
     * no new shapes can be made, player 1 is an even count (%2) and player 2 is
     * an odd count, thats how visibility is controlled, then total moves are
     * checked and then alerts are made if need be
     *
     * @param event
     */
    @FXML
    private void handleOnMouseClicked8(MouseEvent event) {
        if (!gameOver) {//if the game is not over
            if (counter % 2 == 0 && rect8.getOpacity() != 1) {//if the counter is even and rectangle 8s opacity value is not 1
                circ8.setOpacity(1);//circle 8 is made visbile 
                counter++;//counter goes up
                totalMoves++;//total moves goes up
            }
            if (counter % 2 == 1 && circ8.getOpacity() != 1) {//if the counter is odd and circle 8s opacity value is not 1
                rect8.setOpacity(1);//rectangle 8 is made visible 
                counter++;//counter goes up
                totalMoves++;//total moves goes up
            }
            if (checkTotalMoves()) {//check if there are no more possible moves 
                makeAlert();//if there are no possible moves, then generate an alert 
            }

            check();//check for winner
        } else {
            makeGameOver();//if the game is over make an alert saying so
        }
    }

    /**
     * this method takes an event as a parameter and allows a shape to be made
     * visible through opacity values, it first checks if the game was over so
     * no new shapes can be made, player 1 is an even count (%2) and player 2 is
     * an odd count, thats how visibility is controlled, then total moves are
     * checked and then alerts are made if need be
     *
     * @param event
     */
    @FXML
    private void handleOnMouseClicked9(MouseEvent event) {

        if (!gameOver) {//if the game is not over

            if (counter % 2 == 0 && rect9.getOpacity() != 1) {//if the counter is even and rectangle 9s opacity is 0
                circ9.setOpacity(1);//then circle 9 is made visible 
                counter++;//counter goes up
                totalMoves++;//total moves goes up
            }
            if (counter % 2 == 1 && circ9.getOpacity() != 1) {//if the counter is odd and circle 9s opacity is 0 
                rect9.setOpacity(1);//rectangle 9 is made visible 
                counter++;//counter goes up
                totalMoves++;//total moves goes up
            }
            if (checkTotalMoves()) {//if there are no more possible moves 
                makeAlert();//generate an alert saying so 
            }

            check();//check for winner
        } else {
            makeGameOver();//if the game is over generate alert saying so 
        }
    }

    /**
     * this method takes an event as a parameter and allows a shape to be made
     * visible through opacity values, it first checks if the game was over so
     * no new shapes can be made, player 1 is an even count (%2) and player 2 is
     * an odd count, thats how visibility is controlled, then total moves are
     * checked and then alerts are made if need be
     *
     * @param event
     */
    @FXML
    private void handleOnMouseClicked5(MouseEvent event) {
        if (!gameOver) {//if the game is not over
            if (counter % 2 == 0 && rect5.getOpacity() != 1) {//if the counter is even and rectangle 5s opacity is not 1
                circ5.setOpacity(1);//make circle 5 visible
                counter++;//counter goes up
                totalMoves++;//total moves goes up
            }
            if (counter % 2 == 1 && circ5.getOpacity() != 1) {//if the counter is odd and circle 5s opacity is not 1
                rect5.setOpacity(1);//rectangle 5 is made visible
                counter++;//counter goes up
                totalMoves++;//total moves goes up

            }

            if (checkTotalMoves()) {//if there are no more possible moves
                makeAlert();//generate an alert saying so
            }
            check();//check for winner
        } else {
            makeGameOver();//if the game is over make an alert saying so 
        }
    }

    /**
     * method for checking if there are no more possible moves to be made,
     * returns true or false, total possible moves are 9
     *
     * @return boolean
     */
    public boolean checkTotalMoves() {//method for checking if there are no more possible moves to be made

        boolean gameOver = false;//initally, there are more moves to make

        if (totalMoves == 9) {//if the total moves are 9
            gameOver = true;//game over becomes true, since nothing else can be clicked
        }

        return gameOver;//true or false is returned 
    }

    /**
     * method for making an alert, if the game is either over or no more moves
     * are possible.
     *
     *
     */
    public void makeAlert() {//method for
        Alert a = new Alert(AlertType.INFORMATION);//alert type is informative 
        a.setTitle("Game Over");//text is set to game over
        a.setHeaderText("out of moves");//reason is out of moves

        a.showAndWait();//alert will stay until the user gets rid of it 

    }

    /**
     * method for generating the game over alert.
     */
    public void makeGameOver() {
        Alert a = new Alert(AlertType.INFORMATION);//alert type is informative
        a.setTitle("Game Over");//title
        a.setHeaderText("we have a winner!");//reason, there is a winner

        a.showAndWait();//alert stays until the user gets rid of it 
    }

    /**
     * this method returns true if there is a winner, it uses the private
     * variable gameOver, if the opacity values for each possible combination
     * are 1, then a that is a winning move 
     * this is how the cells are layed out:
     * 1,2,3
     * 4,5,6
     * 7,8,9
     *
     * @return boolean
     */
    public Boolean check() {

        if (circ1.getOpacity() == 1 && circ2.getOpacity() == 1 && circ3.getOpacity() == 1) {//3 across the top (cells 1, 2, and 3)
            FillTransition ft = new FillTransition(Duration.seconds(3), circ1);//filltransition ft with a duration of 3 seconds on circle 1 is made
            ft.setToValue(Color.ORANGE);//color is set to orange
            ft.setCycleCount(2);//runs for 2 cycles
            ft.setAutoReverse(true);//auto reverse for circle to go back to original color 

            FillTransition ft2 = new FillTransition(Duration.seconds(3), circ2);//fill transition with a duration of 3 seconds on crcle 2
            ft2.setToValue(Color.ORANGE);//color is set to orange 
            ft2.setCycleCount(2);//runs for 2 cycles 
            ft2.setAutoReverse(true);//auto reverse for circle to go back to original color 

            FillTransition ft3 = new FillTransition(Duration.seconds(3), circ3);//filltransition with a duration of 3 seconds on circle 3
            ft3.setToValue(Color.ORANGE);//color is set to orange 
            ft3.setCycleCount(2);//cycle count is 2
            ft3.setAutoReverse(true);//auto reverse for circle to go back to original color 

            ScaleTransition sc = new ScaleTransition(Duration.seconds(3), circ1);//scale transition for cirle 1, 
            sc.setByX(0.5);//circle x is grown by 0.5, not so big but noticable 
            sc.setByY(0.5);//circle's y is grown by 0.5, not so big but noticable 
            sc.setCycleCount(2);//2 cycles
            sc.setAutoReverse(true);//auto reverse makes the circle shrink down

            ScaleTransition sc2 = new ScaleTransition(Duration.seconds(3), circ2);//scale transition for circle 2
            sc2.setByX(0.5);//circle's x is grown by 0.5
            sc2.setByY(0.5);//circle's y is grown by 0.5
            sc2.setCycleCount(2);//cycle count is set to 2
            sc2.setAutoReverse(true);//auto reverse is true so the circle can shinrk back down

            ScaleTransition sc3 = new ScaleTransition(Duration.seconds(3), circ3);//scale transition for circle 3
            sc3.setByX(0.5);//circle's x is grown by 0.5
            sc3.setByY(0.5);//circle's y is grown by 0.5
            sc3.setCycleCount(2);//cycle count is set to 2
            sc3.setAutoReverse(true);//auto reverse is true so the circle can shrink back down 

            ParallelTransition pt = new ParallelTransition(ft, ft2, ft3, sc, sc2, sc3);//parallel transition is used so all of the above animations play at once
            pt.play();//parallel transition is played

            gameOver = true;//game over is set to true so the game can end 

        }

        if (rect1.getOpacity() == 1 && rect2.getOpacity() == 1 && rect3.getOpacity() == 1) {//3 across the top cells 1,2,and 3, this is for rectangles

            RotateTransition rt = new RotateTransition(Duration.seconds(3), rect1);//the rectangles use the rotate animation to differ from circles
            rt.setByAngle(360);//the rectangle will rotate a full 360 degrees
            rt.setCycleCount(2);//runs for 2 cycles
            rt.setAutoReverse(true);//auto reverse is true so the rectangle returns to its original posiiton

            RotateTransition rt2 = new RotateTransition(Duration.seconds(3), rect2);//rotate animation for rectangle 2
            rt2.setByAngle(360);//rectangle 2 will rotate 360 degrees
            rt2.setCycleCount(2);//runs for 2 cycles
            rt2.setAutoReverse(true);//auto reverse is true, so the rectangle returns to its original position

            RotateTransition rt3 = new RotateTransition(Duration.seconds(3), rect3);//rotate animation for rectangle 3
            rt3.setByAngle(360);//rectangle 3 will rotate 360 degrees
            rt3.setCycleCount(2);//runs for 2 cycles
            rt3.setAutoReverse(true);//auto reverse is true, so the rectangle returns to its original position

            ScaleTransition st = new ScaleTransition(Duration.seconds(3), rect1);//scale transition for rectangle 1, used to make the rectangle bigger
            st.setByY(1.5);//grows rectangle by 1.5 times
            st.setByY(1.5);//grows rectangle y by 1.5 times 
            st.setCycleCount(2);//runs for 2 cycles
            st.setAutoReverse(true);//auto reverse is true so the rectangle returns to its orignal form

            ScaleTransition st2 = new ScaleTransition(Duration.seconds(3), rect2);//scale transition for rectangle 2
            st2.setByY(1.5);//x grows by 1.5 times
            st2.setByY(1.5);//y grows by 1.5 times
            st2.setCycleCount(2);//runs for 2 cycles 
            st2.setAutoReverse(true);//auto reverse is set to true so the rectable returns to its original form 

            ScaleTransition st3 = new ScaleTransition(Duration.seconds(3), rect3);//scale transition for rectangle 3
            st3.setByY(1.5);//x grows by 1.5 times
            st3.setByY(1.5);//y grows by 1.5 times
            st3.setCycleCount(2);//runs for 2 cycles
            st3.setAutoReverse(true);//auto reverse set to true so the rectangle goes to its orginal form

            ParallelTransition pt = new ParallelTransition(rt, rt2, rt3, st, st2, st3);//parallel transition for pplaying all animations at the same time
            pt.play();//play the animations

            gameOver = true;//game over is set to true so the game ends
        }
        if (circ4.getOpacity() == 1 && circ5.getOpacity() == 1 && circ6.getOpacity() == 1) {//for cells 4,5, and 6, see cells 1,2,3 handlers for how this code works 
            FillTransition ft = new FillTransition(Duration.seconds(3), circ4);
            ft.setToValue(Color.ORANGE);
            ft.setCycleCount(2);
            ft.setAutoReverse(true);

            FillTransition ft2 = new FillTransition(Duration.seconds(3), circ5);
            ft2.setToValue(Color.ORANGE);
            ft2.setCycleCount(2);
            ft2.setAutoReverse(true);

            FillTransition ft3 = new FillTransition(Duration.seconds(3), circ6);
            ft3.setToValue(Color.ORANGE);
            ft3.setCycleCount(2);
            ft3.setAutoReverse(true);

            ScaleTransition sc = new ScaleTransition(Duration.seconds(3), circ4);
            sc.setByX(0.5);
            sc.setByY(0.5);
            sc.setCycleCount(2);
            sc.setAutoReverse(true);

            ScaleTransition sc2 = new ScaleTransition(Duration.seconds(3), circ5);
            sc2.setByX(0.5);
            sc2.setByY(0.5);
            sc2.setCycleCount(2);
            sc2.setAutoReverse(true);

            ScaleTransition sc3 = new ScaleTransition(Duration.seconds(3), circ6);
            sc3.setByX(0.5);
            sc3.setByY(0.5);
            sc3.setCycleCount(2);
            sc3.setAutoReverse(true);

            ParallelTransition pt = new ParallelTransition(ft, ft2, ft3, sc, sc2, sc3);
            pt.play();

            gameOver = true;
        }
        if (rect4.getOpacity() == 1 && rect5.getOpacity() == 1 && rect6.getOpacity() == 1) {//for cells 4,5,6 (rectangle) again, see the cells 1,2,3 for the handler how the animations work

            RotateTransition rt = new RotateTransition(Duration.seconds(3), rect4);
            rt.setByAngle(360);
            rt.setCycleCount(2);
            rt.setAutoReverse(true);

            RotateTransition rt2 = new RotateTransition(Duration.seconds(3), rect5);
            rt2.setByAngle(360);
            rt2.setCycleCount(2);
            rt2.setAutoReverse(true);

            RotateTransition rt3 = new RotateTransition(Duration.seconds(3), rect6);
            rt3.setByAngle(360);
            rt3.setCycleCount(2);
            rt3.setAutoReverse(true);

            ScaleTransition st = new ScaleTransition(Duration.seconds(3), rect4);
            st.setByY(1.5);
            st.setByY(1.5);
            st.setCycleCount(2);
            st.setAutoReverse(true);

            ScaleTransition st2 = new ScaleTransition(Duration.seconds(3), rect5);
            st2.setByY(1.5);
            st2.setByY(1.5);
            st2.setCycleCount(2);
            st2.setAutoReverse(true);

            ScaleTransition st3 = new ScaleTransition(Duration.seconds(3), rect6);
            st3.setByY(1.5);
            st3.setByY(1.5);
            st3.setCycleCount(2);
            st3.setAutoReverse(true);

            ParallelTransition pt = new ParallelTransition(rt, rt2, rt3, st, st2, st3);
            pt.play();

            gameOver = true;
        }
        if (circ7.getOpacity() == 1 && circ8.getOpacity() == 1 && circ9.getOpacity() == 1) {//for cells 7,8,9 see cells 1,2,3 for comments, code is the same
            FillTransition ft = new FillTransition(Duration.seconds(3), circ7);
            ft.setToValue(Color.ORANGE);
            ft.setCycleCount(2);
            ft.setAutoReverse(true);

            FillTransition ft2 = new FillTransition(Duration.seconds(3), circ8);
            ft2.setToValue(Color.ORANGE);
            ft2.setCycleCount(2);
            ft2.setAutoReverse(true);

            FillTransition ft3 = new FillTransition(Duration.seconds(3), circ9);
            ft3.setToValue(Color.ORANGE);
            ft3.setCycleCount(2);
            ft3.setAutoReverse(true);

            ScaleTransition sc = new ScaleTransition(Duration.seconds(3), circ7);
            sc.setByX(0.5);
            sc.setByY(0.5);
            sc.setCycleCount(2);
            sc.setAutoReverse(true);

            ScaleTransition sc2 = new ScaleTransition(Duration.seconds(3), circ8);
            sc2.setByX(0.5);
            sc2.setByY(0.5);
            sc2.setCycleCount(2);
            sc2.setAutoReverse(true);

            ScaleTransition sc3 = new ScaleTransition(Duration.seconds(3), circ9);
            sc3.setByX(0.5);
            sc3.setByY(0.5);
            sc3.setCycleCount(2);
            sc3.setAutoReverse(true);

            ParallelTransition pt = new ParallelTransition(ft, ft2, ft3, sc, sc2, sc3);
            pt.play();

            gameOver = true;
        }
        if (rect7.getOpacity() == 1 && rect8.getOpacity() == 1 && rect9.getOpacity() == 1) {//for cells 7,8,9 (rectangle) see cells 1,2,3 for comments, code is the same

            RotateTransition rt = new RotateTransition(Duration.seconds(3), rect7);
            rt.setByAngle(360);
            rt.setCycleCount(2);
            rt.setAutoReverse(true);

            RotateTransition rt2 = new RotateTransition(Duration.seconds(3), rect8);
            rt2.setByAngle(360);
            rt2.setCycleCount(2);
            rt2.setAutoReverse(true);

            RotateTransition rt3 = new RotateTransition(Duration.seconds(3), rect9);
            rt3.setByAngle(360);
            rt3.setCycleCount(2);
            rt3.setAutoReverse(true);

            ScaleTransition st = new ScaleTransition(Duration.seconds(3), rect7);
            st.setByY(1.5);
            st.setByY(1.5);
            st.setCycleCount(2);
            st.setAutoReverse(true);

            ScaleTransition st2 = new ScaleTransition(Duration.seconds(3), rect8);
            st2.setByY(1.5);
            st2.setByY(1.5);
            st2.setCycleCount(2);
            st2.setAutoReverse(true);

            ScaleTransition st3 = new ScaleTransition(Duration.seconds(3), rect9);
            st3.setByY(1.5);
            st3.setByY(1.5);
            st3.setCycleCount(2);
            st3.setAutoReverse(true);

            ParallelTransition pt = new ParallelTransition(rt, rt2, rt3, st, st2, st3);
            pt.play();

            gameOver = true;
        }
        if (circ1.getOpacity() == 1 && circ5.getOpacity() == 1 && circ9.getOpacity() == 1) {//for cells 1,5,9 see cells 1,2,3 for comments, code is the same 
            FillTransition ft = new FillTransition(Duration.seconds(3), circ1);
            ft.setToValue(Color.ORANGE);
            ft.setCycleCount(2);
            ft.setAutoReverse(true);

            FillTransition ft2 = new FillTransition(Duration.seconds(3), circ5);
            ft2.setToValue(Color.ORANGE);
            ft2.setCycleCount(2);
            ft2.setAutoReverse(true);

            FillTransition ft3 = new FillTransition(Duration.seconds(3), circ9);
            ft3.setToValue(Color.ORANGE);
            ft3.setCycleCount(2);
            ft3.setAutoReverse(true);

            ScaleTransition sc = new ScaleTransition(Duration.seconds(3), circ1);
            sc.setByX(0.5);
            sc.setByY(0.5);
            sc.setCycleCount(2);
            sc.setAutoReverse(true);

            ScaleTransition sc2 = new ScaleTransition(Duration.seconds(3), circ5);
            sc2.setByX(0.5);
            sc2.setByY(0.5);
            sc2.setCycleCount(2);
            sc2.setAutoReverse(true);

            ScaleTransition sc3 = new ScaleTransition(Duration.seconds(3), circ9);
            sc3.setByX(0.5);
            sc3.setByY(0.5);
            sc3.setCycleCount(2);
            sc3.setAutoReverse(true);

            ParallelTransition pt = new ParallelTransition(ft, ft2, ft3, sc, sc2, sc3);
            pt.play();

            gameOver = true;
        }
        if (rect1.getOpacity() == 1 && rect5.getOpacity() == 1 && rect9.getOpacity() == 1) {//for cells 1,5,9 (rectangle) see cells 1,2,3 for comments, code is the same 

            RotateTransition rt = new RotateTransition(Duration.seconds(3), rect1);
            rt.setByAngle(360);
            rt.setCycleCount(2);
            rt.setAutoReverse(true);

            RotateTransition rt2 = new RotateTransition(Duration.seconds(3), rect5);
            rt2.setByAngle(360);
            rt2.setCycleCount(2);
            rt2.setAutoReverse(true);

            RotateTransition rt3 = new RotateTransition(Duration.seconds(3), rect9);
            rt3.setByAngle(360);
            rt3.setCycleCount(2);
            rt3.setAutoReverse(true);

            ScaleTransition st = new ScaleTransition(Duration.seconds(3), rect1);
            st.setByY(1.5);
            st.setByY(1.5);
            st.setCycleCount(2);
            st.setAutoReverse(true);

            ScaleTransition st2 = new ScaleTransition(Duration.seconds(3), rect5);
            st2.setByY(1.5);
            st2.setByY(1.5);
            st2.setCycleCount(2);
            st2.setAutoReverse(true);

            ScaleTransition st3 = new ScaleTransition(Duration.seconds(3), rect9);
            st3.setByY(1.5);
            st3.setByY(1.5);
            st3.setCycleCount(2);
            st3.setAutoReverse(true);

            ParallelTransition pt = new ParallelTransition(rt, rt2, rt3, st, st2, st3);
            pt.play();

            gameOver = true;
        }
        if (circ3.getOpacity() == 1 && circ5.getOpacity() == 1 && circ7.getOpacity() == 1) {//for cells 3,5,7 see cells 1,2,3 for comments code is the same 
            FillTransition ft = new FillTransition(Duration.seconds(3), circ3);
            ft.setToValue(Color.ORANGE);
            ft.setCycleCount(2);
            ft.setAutoReverse(true);

            FillTransition ft2 = new FillTransition(Duration.seconds(3), circ5);
            ft2.setToValue(Color.ORANGE);
            ft2.setCycleCount(2);
            ft2.setAutoReverse(true);

            FillTransition ft3 = new FillTransition(Duration.seconds(3), circ7);
            ft3.setToValue(Color.ORANGE);
            ft3.setCycleCount(2);
            ft3.setAutoReverse(true);

            ScaleTransition sc = new ScaleTransition(Duration.seconds(3), circ3);
            sc.setByX(0.5);
            sc.setByY(0.5);
            sc.setCycleCount(2);
            sc.setAutoReverse(true);

            ScaleTransition sc2 = new ScaleTransition(Duration.seconds(3), circ5);
            sc2.setByX(0.5);
            sc2.setByY(0.5);
            sc2.setCycleCount(2);
            sc2.setAutoReverse(true);

            ScaleTransition sc3 = new ScaleTransition(Duration.seconds(3), circ7);
            sc3.setByX(0.5);
            sc3.setByY(0.5);
            sc3.setCycleCount(2);
            sc3.setAutoReverse(true);

            ParallelTransition pt = new ParallelTransition(ft, ft2, ft3, sc, sc2, sc3);
            pt.play();

            gameOver = true;
        }
        if (rect3.getOpacity() == 1 && rect5.getOpacity() == 1 && rect7.getOpacity() == 1) {//for cells 3,5,7 (rectangle) see cells 1,2,3 for comments code is the same 

            RotateTransition rt = new RotateTransition(Duration.seconds(3), rect3);
            rt.setByAngle(360);
            rt.setCycleCount(2);
            rt.setAutoReverse(true);

            RotateTransition rt2 = new RotateTransition(Duration.seconds(3), rect5);
            rt2.setByAngle(360);
            rt2.setCycleCount(2);
            rt2.setAutoReverse(true);

            RotateTransition rt3 = new RotateTransition(Duration.seconds(3), rect7);
            rt3.setByAngle(360);
            rt3.setCycleCount(2);
            rt3.setAutoReverse(true);

            ScaleTransition st = new ScaleTransition(Duration.seconds(3), rect3);
            st.setByY(1.5);
            st.setByY(1.5);
            st.setCycleCount(2);
            st.setAutoReverse(true);

            ScaleTransition st2 = new ScaleTransition(Duration.seconds(3), rect5);
            st2.setByY(1.5);
            st2.setByY(1.5);
            st2.setCycleCount(2);
            st2.setAutoReverse(true);

            ScaleTransition st3 = new ScaleTransition(Duration.seconds(3), rect7);
            st3.setByY(1.5);
            st3.setByY(1.5);
            st3.setCycleCount(2);
            st3.setAutoReverse(true);

            ParallelTransition pt = new ParallelTransition(rt, rt2, rt3, st, st2, st3);
            pt.play();

            gameOver = true;
        }
        if (circ1.getOpacity() == 1 && circ4.getOpacity() == 1 && circ7.getOpacity() == 1) {//for cells 1,4,7 see cells 1,2,3 for comments code is the same
            FillTransition ft = new FillTransition(Duration.seconds(3), circ1);
            ft.setToValue(Color.ORANGE);
            ft.setCycleCount(2);
            ft.setAutoReverse(true);

            FillTransition ft2 = new FillTransition(Duration.seconds(3), circ4);
            ft2.setToValue(Color.ORANGE);
            ft2.setCycleCount(2);
            ft2.setAutoReverse(true);

            FillTransition ft3 = new FillTransition(Duration.seconds(3), circ7);
            ft3.setToValue(Color.ORANGE);
            ft3.setCycleCount(2);
            ft3.setAutoReverse(true);

            ScaleTransition sc = new ScaleTransition(Duration.seconds(3), circ1);
            sc.setByX(0.5);
            sc.setByY(0.5);
            sc.setCycleCount(2);
            sc.setAutoReverse(true);

            ScaleTransition sc2 = new ScaleTransition(Duration.seconds(3), circ4);
            sc2.setByX(0.5);
            sc2.setByY(0.5);
            sc2.setCycleCount(2);
            sc2.setAutoReverse(true);

            ScaleTransition sc3 = new ScaleTransition(Duration.seconds(3), circ7);
            sc3.setByX(0.5);
            sc3.setByY(0.5);
            sc3.setCycleCount(2);
            sc3.setAutoReverse(true);

            ParallelTransition pt = new ParallelTransition(ft, ft2, ft3, sc, sc2, sc3);
            pt.play();

            gameOver = true;
        }
        if (rect1.getOpacity() == 1 && rect4.getOpacity() == 1 && rect7.getOpacity() == 1) {//for cells 1,4,7 (rectangle) see cells 1,2,3 for comments code is the same 

            RotateTransition rt = new RotateTransition(Duration.seconds(3), rect1);
            rt.setByAngle(360);
            rt.setCycleCount(2);
            rt.setAutoReverse(true);

            RotateTransition rt2 = new RotateTransition(Duration.seconds(3), rect4);
            rt2.setByAngle(360);
            rt2.setCycleCount(2);
            rt2.setAutoReverse(true);

            RotateTransition rt3 = new RotateTransition(Duration.seconds(3), rect7);
            rt3.setByAngle(360);
            rt3.setCycleCount(2);
            rt3.setAutoReverse(true);

            ScaleTransition st = new ScaleTransition(Duration.seconds(3), rect1);
            st.setByY(1.5);
            st.setByY(1.5);
            st.setCycleCount(2);
            st.setAutoReverse(true);

            ScaleTransition st2 = new ScaleTransition(Duration.seconds(3), rect4);
            st2.setByY(1.5);
            st2.setByY(1.5);
            st2.setCycleCount(2);
            st2.setAutoReverse(true);

            ScaleTransition st3 = new ScaleTransition(Duration.seconds(3), rect7);
            st3.setByY(1.5);
            st3.setByY(1.5);
            st3.setCycleCount(2);
            st3.setAutoReverse(true);

            ParallelTransition pt = new ParallelTransition(rt, rt2, rt3, st, st2, st3);

            pt.play();

            gameOver = true;
        }
        if (circ2.getOpacity() == 1 && circ5.getOpacity() == 1 && circ8.getOpacity() == 1) {//for cells 2,5,8 see cells 1,2,3 for comments code is the same 
            FillTransition ft = new FillTransition(Duration.seconds(3), circ2);
            ft.setToValue(Color.ORANGE);
            ft.setCycleCount(2);
            ft.setAutoReverse(true);

            FillTransition ft2 = new FillTransition(Duration.seconds(3), circ5);
            ft2.setToValue(Color.ORANGE);
            ft2.setCycleCount(2);
            ft2.setAutoReverse(true);

            FillTransition ft3 = new FillTransition(Duration.seconds(3), circ8);
            ft3.setToValue(Color.ORANGE);
            ft3.setCycleCount(2);
            ft3.setAutoReverse(true);

            ScaleTransition sc = new ScaleTransition(Duration.seconds(3), circ8);
            sc.setByX(0.5);
            sc.setByY(0.5);
            sc.setCycleCount(2);
            sc.setAutoReverse(true);

            ScaleTransition sc2 = new ScaleTransition(Duration.seconds(3), circ5);
            sc2.setByX(0.5);
            sc2.setByY(0.5);
            sc2.setCycleCount(2);
            sc2.setAutoReverse(true);

            ScaleTransition sc3 = new ScaleTransition(Duration.seconds(3), circ2);
            sc3.setByX(0.5);
            sc3.setByY(0.5);
            sc3.setCycleCount(2);
            sc3.setAutoReverse(true);

            ParallelTransition pt = new ParallelTransition(ft, ft2, ft3, sc, sc2, sc3);
            pt.play();

            gameOver = true;
        }
        if (rect2.getOpacity() == 1 && rect5.getOpacity() == 1 && rect8.getOpacity() == 1) {//for cells 2,5,8 (rectangle) see cells 1,2,3 for comments code is the same

            RotateTransition rt = new RotateTransition(Duration.seconds(3), rect2);
            rt.setByAngle(360);
            rt.setCycleCount(2);
            rt.setAutoReverse(true);

            RotateTransition rt2 = new RotateTransition(Duration.seconds(3), rect5);
            rt2.setByAngle(360);
            rt2.setCycleCount(2);
            rt2.setAutoReverse(true);

            RotateTransition rt3 = new RotateTransition(Duration.seconds(3), rect8);
            rt3.setByAngle(360);
            rt3.setCycleCount(2);
            rt3.setAutoReverse(true);

            ScaleTransition st = new ScaleTransition(Duration.seconds(3), rect2);
            st.setByY(1.5);
            st.setByY(1.5);
            st.setCycleCount(2);
            st.setAutoReverse(true);

            ScaleTransition st2 = new ScaleTransition(Duration.seconds(3), rect5);
            st2.setByY(1.5);
            st2.setByY(1.5);
            st2.setCycleCount(2);
            st2.setAutoReverse(true);

            ScaleTransition st3 = new ScaleTransition(Duration.seconds(3), rect8);
            st3.setByY(1.5);
            st3.setByY(1.5);
            st3.setCycleCount(2);
            st3.setAutoReverse(true);

            ParallelTransition pt = new ParallelTransition(rt, rt2, rt3, st, st2, st3);
            pt.play();

            gameOver = true;
        }
        if (circ3.getOpacity() == 1 && circ6.getOpacity() == 1 && circ9.getOpacity() == 1) {//for cells 3,6,9 see cells 1,2,3 for comments code is the same 
            FillTransition ft = new FillTransition(Duration.seconds(3), circ3);
            ft.setToValue(Color.ORANGE);
            ft.setCycleCount(2);
            ft.setAutoReverse(true);

            FillTransition ft2 = new FillTransition(Duration.seconds(3), circ6);
            ft2.setToValue(Color.ORANGE);
            ft2.setCycleCount(2);
            ft2.setAutoReverse(true);

            FillTransition ft3 = new FillTransition(Duration.seconds(3), circ9);
            ft3.setToValue(Color.ORANGE);
            ft3.setCycleCount(2);
            ft3.setAutoReverse(true);

            ScaleTransition sc = new ScaleTransition(Duration.seconds(3), circ3);
            sc.setByX(0.5);
            sc.setByY(0.5);
            sc.setCycleCount(2);
            sc.setAutoReverse(true);

            ScaleTransition sc2 = new ScaleTransition(Duration.seconds(3), circ6);
            sc2.setByX(0.5);
            sc2.setByY(0.5);
            sc2.setCycleCount(2);
            sc2.setAutoReverse(true);

            ScaleTransition sc3 = new ScaleTransition(Duration.seconds(3), circ9);
            sc3.setByX(0.5);
            sc3.setByY(0.5);
            sc3.setCycleCount(2);
            sc3.setAutoReverse(true);

            ParallelTransition pt = new ParallelTransition(ft, ft2, ft3, sc, sc2, sc3);
            pt.play();

            gameOver = true;
        }
        if (rect3.getOpacity() == 1 && rect6.getOpacity() == 1 && rect9.getOpacity() == 1) {//for cells 3,6,9 (rectangle) see cells 1,2,3 for comments code is the same

            RotateTransition rt = new RotateTransition(Duration.seconds(3), rect3);
            rt.setByAngle(360);
            rt.setCycleCount(2);
            rt.setAutoReverse(true);

            RotateTransition rt2 = new RotateTransition(Duration.seconds(3), rect6);
            rt2.setByAngle(360);
            rt2.setCycleCount(2);
            rt2.setAutoReverse(true);

            RotateTransition rt3 = new RotateTransition(Duration.seconds(3), rect9);
            rt3.setByAngle(360);
            rt3.setCycleCount(2);
            rt3.setAutoReverse(true);

            ScaleTransition st = new ScaleTransition(Duration.seconds(3), rect3);
            st.setByY(1.5);
            st.setByY(1.5);
            st.setCycleCount(2);
            st.setAutoReverse(true);

            ScaleTransition st2 = new ScaleTransition(Duration.seconds(3), rect6);
            st2.setByY(1.5);
            st2.setByY(1.5);
            st2.setCycleCount(2);
            st2.setAutoReverse(true);

            ScaleTransition st3 = new ScaleTransition(Duration.seconds(3), rect9);
            st3.setByY(1.5);
            st3.setByY(1.5);
            st3.setCycleCount(2);
            st3.setAutoReverse(true);

            ParallelTransition pt = new ParallelTransition(rt, rt2, rt3, st, st2, st3);

            pt.play();

            gameOver = true;
        }

        return gameOver;//true or false is returned
    }

    /**
     * this method is used for creating a new game, all opacities are set to 0 and both 
     * counter and moves counter are set to 0, finally gameOver is set to false
     * @param event 
     */
    @FXML
    private void makeNewGame(ActionEvent event) {//upon clicking the new game menu item, 

        circ1.setOpacity(0);//all circles are set to 0 opacity
        circ2.setOpacity(0);
        circ3.setOpacity(0);
        circ4.setOpacity(0);
        circ5.setOpacity(0);
        circ6.setOpacity(0);
        circ7.setOpacity(0);
        circ8.setOpacity(0);
        circ9.setOpacity(0);

        rect1.setOpacity(0);//all rectangles are set to 0 opacity
        rect2.setOpacity(0);
        rect3.setOpacity(0);
        rect4.setOpacity(0);
        rect5.setOpacity(0);
        rect6.setOpacity(0);
        rect7.setOpacity(0);
        rect8.setOpacity(0);
        rect9.setOpacity(0);

        counter = 0;//counter is reset
        totalMoves = 0;//total moves is reset
        gameOver = false;//game over is made false
    }
    /**
     * method for closing the program upon clicking the close menu item
     * @param event 
     */
    @FXML
    private void closeProgram(ActionEvent event) {

        Platform.exit();//gui is ended
        System.exit(0);//program is terminated

    }
}
