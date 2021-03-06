package TowerDefense;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Game game = new Game();
        stage = game.getStage();
        stage.setResizable(false);
        stage.setTitle("Tower Defense");
        stage.show();
    }
}
