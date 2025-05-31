import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class EventListControl {

    private Stage primaryStage;
    private Scene eventListScene;
    private Scene addEventScene;
    private AddEventControl addEventControl;

    // Setters for stage and scenes
    public void setAddEventScene(Scene scene) {
        this.addEventScene = scene;
    }

    public void setPrimaryStage(Stage stage) {
        this.primaryStage = stage;
    }

    public void setEventListScene(Scene scene) {
        this.eventListScene = scene;
    }

    public void setAddEventControl(AddEventControl control) {
        this.addEventControl = control;
    }

    // For displaying events in ListView
    @FXML
    private ListView<String> eventListView;

    // To add events to the list
    public void addEvent(String event) {
        eventListView.getItems().add(event);

        //Simple slide-in animation
        TranslateTransition tt = new TranslateTransition(Duration.millis(1000), eventListView);
        tt.setFromY(100);
        tt.setToY(0);
        tt.play();
    }

    // For add New Event button
    @FXML
    private void handleAddEvent() {
        addEventControl.reset();
        primaryStage.setScene(addEventScene);
    }
    // For returning to EventList
    public void goBackToEventList() {
        primaryStage.setScene(eventListScene);
    }
}
