package ConnectFour;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class ConnectFour extends Application {
    private static final String PATH = "C:/Users/jpake/OneDrive/Documents/Personal Projects/RandomJava/src/ConnectFour/";
    private URL image;

    private void startGameBoard(Stage stage){

        GridPane gameboard = new GridPane();
        try {
            image = new File(PATH).toURI().toURL();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        for( int col = 0; col < 7; col++){
            for (int row = 0; row < 6; row++){
                StackPane stackPane = new StackPane();
                ImageView imageView = new ImageView(image+ "empty.png");


                stackPane.getChildren().add(imageView);
                gameboard.add(stackPane, col, row);
            }
        }

        Label playerTurns = new Label("Player 1 turn");

        VBox vbox = new VBox();
        vbox.getChildren().addAll(
                playerTurns,
                gameboard
        );


        Scene game = new Scene(vbox);
        stage.setScene(game);
        stage.setTitle("Connect 4");
        stage.show();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        startGameBoard(primaryStage);

    }
}
