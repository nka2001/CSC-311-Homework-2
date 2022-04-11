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

    private int counter = 0;
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

    private boolean gameOver = false;

    @FXML
    private void handleOnMouseClicked(javafx.scene.input.MouseEvent event) {

        if (!gameOver) {

            if (counter % 2 == 0 && rect1.getOpacity() != 1) {
                circ1.setOpacity(1);
                counter++;
                totalMoves++;
            }
            if (counter % 2 == 1 && circ1.getOpacity() != 1) {
                rect1.setOpacity(1);
                counter++;
                totalMoves++;
            }

            if (checkTotalMoves()) {
                makeAlert();
            }
            check();
        } else {
            makeGameOver();
        }
    }

    @FXML
    private void handleOnMouseClicked2(MouseEvent event) {

        if (!gameOver) {
            if (counter % 2 == 0 && rect2.getOpacity() != 1) {
                circ2.setOpacity(1);
                counter++;
                totalMoves++;
            }
            if (counter % 2 == 1 && circ2.getOpacity() != 1) {
                rect2.setOpacity(1);
                counter++;
                totalMoves++;
            }

            if (checkTotalMoves()) {
                makeAlert();
            }
            check();
        } else {
            makeGameOver();
        }
    }

    @FXML
    private void handleOnMouseClicked3(MouseEvent event) {

        if (!gameOver) {
            if (counter % 2 == 0 && rect3.getOpacity() != 1) {
                circ3.setOpacity(1);
                counter++;
                totalMoves++;
            }
            if (counter % 2 == 1 && circ3.getOpacity() != 1) {
                rect3.setOpacity(1);
                counter++;
                totalMoves++;
            }
            if (checkTotalMoves()) {
                makeAlert();
            }
            check();
        } else {
            makeGameOver();
        }
    }

    @FXML
    private void handleOnMouseClicked4(MouseEvent event) {

        if (!gameOver) {
            if (counter % 2 == 0 && rect4.getOpacity() != 1) {
                circ4.setOpacity(1);
                counter++;
                totalMoves++;
            }
            if (counter % 2 == 1 && circ4.getOpacity() != 1) {
                rect4.setOpacity(1);
                counter++;
                totalMoves++;
            }

            if (checkTotalMoves()) {
                makeAlert();
            }
            check();
        } else {
            makeGameOver();
        }

    }

    @FXML
    private void handleOnMouseClicked6(MouseEvent event) {

        if (!gameOver) {
            if (counter % 2 == 0 && rect6.getOpacity() != 1) {
                circ6.setOpacity(1);
                counter++;
                totalMoves++;
            }
            if (counter % 2 == 1 && circ6.getOpacity() != 1) {
                rect6.setOpacity(1);
                counter++;
                totalMoves++;
            }
            if (checkTotalMoves()) {
                makeAlert();
            }
            check();
        } else {
            makeGameOver();
        }

    }

    @FXML
    private void handleOnMouseClicked7(MouseEvent event) {

        if (!gameOver) {
            if (counter % 2 == 0 && rect7.getOpacity() != 1) {
                circ7.setOpacity(1);
                counter++;
                totalMoves++;
            }
            if (counter % 2 == 1 && circ7.getOpacity() != 1) {
                rect7.setOpacity(1);
                counter++;
                totalMoves++;
            }
            if (checkTotalMoves()) {
                makeAlert();
            }
            check();
        } else {
            makeGameOver();
        }
    }

    @FXML
    private void handleOnMouseClicked8(MouseEvent event) {
        if (!gameOver) {
            if (counter % 2 == 0 && rect8.getOpacity() != 1) {
                circ8.setOpacity(1);
                counter++;
                totalMoves++;
            }
            if (counter % 2 == 1 && circ8.getOpacity() != 1) {
                rect8.setOpacity(1);
                counter++;
                totalMoves++;
            }
            if (checkTotalMoves()) {
                makeAlert();
            }

            check();
        } else {
            makeGameOver();
        }
    }

    @FXML
    private void handleOnMouseClicked9(MouseEvent event) {

        if (!gameOver) {

            if (counter % 2 == 0 && rect9.getOpacity() != 1) {
                circ9.setOpacity(1);
                counter++;
                totalMoves++;
            }
            if (counter % 2 == 1 && circ9.getOpacity() != 1) {
                rect9.setOpacity(1);
                counter++;
                totalMoves++;
            }
            if (checkTotalMoves()) {
                makeAlert();
            }

            check();
        } else {
            makeGameOver();
        }
    }

    @FXML
    private void handleOnMouseClicked5(MouseEvent event) {
        if (!gameOver) {
            if (counter % 2 == 0 && rect5.getOpacity() != 1) {
                circ5.setOpacity(1);
                counter++;
                totalMoves++;
            }
            if (counter % 2 == 1 && circ5.getOpacity() != 1) {
                rect5.setOpacity(1);
                counter++;
                totalMoves++;

            }

            if (checkTotalMoves()) {
                makeAlert();
            }
            check();
        } else {
            makeGameOver();
        }
    }

    public boolean checkTotalMoves() {

        boolean gameOver = false;

        if (totalMoves == 9) {
            gameOver = true;
        }

        return gameOver;
    }

    public void makeAlert() {
        Alert a = new Alert(AlertType.INFORMATION);
        a.setTitle("Game Over");
        a.setHeaderText("out of moves");

        a.showAndWait();

    }

    public void makeGameOver() {
        Alert a = new Alert(AlertType.INFORMATION);
        a.setTitle("Game Over");
        a.setHeaderText("we have a winner!");

        a.showAndWait();
    }

    public Boolean check() {

        if (circ1.getOpacity() == 1 && circ2.getOpacity() == 1 && circ3.getOpacity() == 1) {
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

            ParallelTransition pt = new ParallelTransition(ft, ft2, ft3);
            pt.play();

            gameOver = true;

        }

        if (rect1.getOpacity() == 1 && rect2.getOpacity() == 1 && rect3.getOpacity() == 1) {

            RotateTransition rt = new RotateTransition(Duration.seconds(3), rect1);
            rt.setByAngle(360);
            rt.setCycleCount(2);
            rt.setAutoReverse(true);

            RotateTransition rt2 = new RotateTransition(Duration.seconds(3), rect2);
            rt2.setByAngle(360);
            rt2.setCycleCount(2);
            rt2.setAutoReverse(true);

            RotateTransition rt3 = new RotateTransition(Duration.seconds(3), rect3);
            rt3.setByAngle(360);
            rt3.setCycleCount(2);
            rt3.setAutoReverse(true);

            ParallelTransition pt = new ParallelTransition(rt, rt2, rt3);
            pt.play();

            gameOver = true;
        }
        if (circ4.getOpacity() == 1 && circ5.getOpacity() == 1 && circ6.getOpacity() == 1) {
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

            ParallelTransition pt = new ParallelTransition(ft, ft2, ft3);
            pt.play();

            gameOver = true;
        }
        if (rect4.getOpacity() == 1 && rect5.getOpacity() == 1 && rect6.getOpacity() == 1) {

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

            ParallelTransition pt = new ParallelTransition(rt, rt2, rt3);
            pt.play();

            gameOver = true;
        }
        if (circ7.getOpacity() == 1 && circ8.getOpacity() == 1 && circ9.getOpacity() == 1) {
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

            ParallelTransition pt = new ParallelTransition(ft, ft2, ft3);
            pt.play();

            gameOver = true;
        }
        if (rect7.getOpacity() == 1 && rect8.getOpacity() == 1 && rect9.getOpacity() == 1) {

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

            ParallelTransition pt = new ParallelTransition(rt, rt2, rt3);
            pt.play();

            gameOver = true;
        }
        if (circ1.getOpacity() == 1 && circ5.getOpacity() == 1 && circ9.getOpacity() == 1) {
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

            ParallelTransition pt = new ParallelTransition(ft, ft2, ft3);
            pt.play();

            gameOver = true;
        }
        if (rect1.getOpacity() == 1 && rect5.getOpacity() == 1 && rect9.getOpacity() == 1) {

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

            ParallelTransition pt = new ParallelTransition(rt, rt2, rt3);
            pt.play();

            gameOver = true;
        }
        if (circ3.getOpacity() == 1 && circ5.getOpacity() == 1 && circ7.getOpacity() == 1) {
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

            ParallelTransition pt = new ParallelTransition(ft, ft2, ft3);
            pt.play();

            gameOver = true;
        }
        if (rect3.getOpacity() == 1 && rect5.getOpacity() == 1 && rect7.getOpacity() == 1) {

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

            ParallelTransition pt = new ParallelTransition(rt, rt2, rt3);
            pt.play();

            gameOver = true;
        }
        if (circ1.getOpacity() == 1 && circ4.getOpacity() == 1 && circ7.getOpacity() == 1) {
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

            ParallelTransition pt = new ParallelTransition(ft, ft2, ft3);
            pt.play();

            gameOver = true;
        }
        if (rect1.getOpacity() == 1 && rect4.getOpacity() == 1 && rect7.getOpacity() == 1) {

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

            ParallelTransition pt = new ParallelTransition(rt, rt2, rt3);
            pt.play();

            gameOver = true;
        }
        if (circ2.getOpacity() == 1 && circ5.getOpacity() == 1 && circ8.getOpacity() == 1) {
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

            ParallelTransition pt = new ParallelTransition(ft, ft2, ft3);
            pt.play();

            gameOver = true;
        }
        if (rect2.getOpacity() == 1 && rect5.getOpacity() == 1 && rect8.getOpacity() == 1) {

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

            ParallelTransition pt = new ParallelTransition(rt, rt2, rt3);
            pt.play();

            gameOver = true;
        }
        if (circ3.getOpacity() == 1 && circ6.getOpacity() == 1 && circ9.getOpacity() == 1) {
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

            ParallelTransition pt = new ParallelTransition(ft, ft2, ft3);
            pt.play();

            gameOver = true;
        }
        if (rect3.getOpacity() == 1 && rect6.getOpacity() == 1 && rect9.getOpacity() == 1) {

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

            ParallelTransition pt = new ParallelTransition(rt, rt2, rt3);
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
        gameOver = false;
    }

    @FXML
    private void closeProgram(ActionEvent event) {

        Platform.exit();
        System.exit(0);

    }
}
