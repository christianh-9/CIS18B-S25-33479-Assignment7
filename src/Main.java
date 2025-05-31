import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

       // To load EventList View
       FXMLLoader loader = new FXMLLoader(getClass().getResource("EventListView.fxml"));
       Parent root = loader.load();
       Scene eventListScene = new Scene(root, 600, 400);

       // Get EventList controller and set stage and scene
       EventListControl eventListControl = loader.getController();
       eventListControl.setPrimaryStage(primaryStage);
       eventListControl.setEventListScene(eventListScene);

       // To load AddEvent View
       FXMLLoader loader2 = new FXMLLoader(getClass().getResource("AddEventView.fxml"));
       Parent root2 = loader2.load();
       Scene addEventScene = new Scene(root2, 600, 400);

       // Get AddEvent controller and set its scene and stage
       AddEventControl addEventControl = loader2.getController();
       addEventControl.setEventListControl(eventListControl);
       addEventControl.setPrimaryStage(primaryStage);

       // Link AddEvent scene and controller to EventListControl
       eventListControl.setAddEventScene(addEventScene);
       eventListControl.setAddEventControl(addEventControl);

        // Initial event list scene
        primaryStage.setTitle("Event Planner");
        primaryStage.setScene(eventListScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}