
package projectfx;
import java.io.File;
import javafx.geometry.Insets;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
/**
 *
 * @author shaim
 */
public class ProjectFX extends Application {
    
        private Scene stage1;
        private Scene stage2;
        private Scene stage3;
        private Scene stage4;
        private Scene stage5;
        private Scene stage6;
        private Scene stage7;



    @Override
    public void start(Stage primaryStage) 
    {
// Root BorderPane
        BorderPane root = new BorderPane();

        // Top Section - HBox with Multi-functional Label, TextField, and ComboBox
        HBox topBar = new HBox(10);
        topBar.setPadding(new Insets(10));
        topBar.setStyle("-fx-background-color: #f0f0f0;");
        topBar.setSpacing(250);
        topBar.setAlignment(Pos.CENTER);
        Label notificationLabel = new Label("\uD83D\uDD14"); // Bell shape
        notificationLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        TextField searchField = new TextField();
        searchField.setPromptText("Search...");

        ComboBox<String> modeComboBox = new ComboBox<>();
        modeComboBox.getItems().addAll("Light", "Dark");
        modeComboBox.setValue("Light");

        topBar.getChildren().addAll(notificationLabel, searchField, modeComboBox);
        root.setTop(topBar);

        // VBox Section for Welcome Messages
        VBox welcomeBox = new VBox(10);
        welcomeBox.setPadding(new Insets(20));
        welcomeBox.setStyle("-fx-background-color: #ea5f02;");

        Label welcomeLabel = new Label("Welcome UN to RentalC...");
        welcomeLabel.setStyle("-fx-font-size: 40px; -fx-font-weight: bold;-fx-text-fill: white;");
        
       
        Label subLabel = new Label("Rent your Dream Car!");
        subLabel.setStyle("-fx-font-size: 25px;-fx-text-fill: white;");
        
        welcomeBox.setSpacing(70);
        welcomeBox.getChildren().addAll(welcomeLabel, subLabel);
        root.setTop(new VBox(topBar, welcomeBox));

        // Center Section - GridPane for Picks for You
        GridPane centerGrid = new GridPane();
        centerGrid.setPadding(new Insets(20));
        centerGrid.setHgap(15);
        centerGrid.setVgap(15);

        Label picksLabel = new Label("Picks for you");
        picksLabel.setStyle("-fx-font-size: 25px; -fx-font-weight: bold;");
        GridPane.setConstraints(picksLabel, 0, 0, 2, 1);
        Image image = null;



        ImageView image1 = new ImageView(new Image(new File("\"C:\\Users\\shaim\\Pictures\\Screenshots\\Screenshot 2024-11-28 190342.png\"").toURI().toString()));
        image1.setFitWidth(100);
        image1.setFitHeight(100);
        image1.setPreserveRatio(true);

        ImageView image2 = new ImageView(new Image(new File("\"C:\\Users\\shaim\\Pictures\\Screenshots\\Screenshot 2024-11-28 190342.png\"").toURI().toString()));
        image2.setFitWidth(100);
        image2.setFitHeight(100);
        image2.setPreserveRatio(true);
      

        GridPane.setConstraints(image1, 3,1);
        GridPane.setConstraints(image2, 8,1);
       

        centerGrid.getChildren().addAll(picksLabel, image1, image2);
        root.setCenter(centerGrid);

        // Bottom Section - HBox with Navigation Buttons
        HBox bottomBar = new HBox(15);
        bottomBar.setPadding(new Insets(10));
        bottomBar.setStyle("-fx-background-color: #ea5f02;-fx-text-fill: grey;");
        bottomBar.setSpacing(250);
        
        
        Button homeButton = new Button("Home");
      homeButton.setStyle("-fx-background-color: transparent; -fx-border-color: transparent; -fx-font-size: 18px; -fx-font-weight: bold; -fx-padding: 5;");

        Button rentButton = new Button("Rent");
      rentButton.setStyle("-fx-background-color: transparent; -fx-border-color: transparent; -fx-font-size: 18px; -fx-font-weight: bold; -fx-padding: 5;");

        Button meButton = new Button("Me");
      meButton.setStyle("-fx-background-color: transparent; -fx-border-color: transparent; -fx-font-size: 18px; -fx-font-weight: bold; -fx-padding: 5;");
        
       
        bottomBar.setAlignment(Pos.CENTER);
        bottomBar.getChildren().addAll(homeButton, rentButton, meButton);
        root.setBottom(bottomBar);

        // Scene and Stage setup
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("RentalC");
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
