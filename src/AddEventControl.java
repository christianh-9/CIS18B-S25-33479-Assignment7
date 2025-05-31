import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class AddEventControl{

    // Text fields for inputs
    @FXML private TextField titleField;
    @FXML private DatePicker datePicker;
    @FXML private TextField timeField;
    @FXML private TextArea descriptionArea;

    private EventListControl eventListControl;
    private Stage primaryStage;

    // Setters for EventListControl and stage
    public void setEventListControl(EventListControl control) {
        this.eventListControl = control;
    }

    public void setPrimaryStage(Stage stage) {
        this.primaryStage = stage;
    }

    // For Save Event button
    @FXML
    private void handleSaveEvent() {
        // Inputs for each text box
        String title = titleField.getText();
        String date = (datePicker.getValue() != null) ? datePicker.getValue().toString() : "";
        String time = timeField.getText();
        String description = descriptionArea.getText();

        // Return if any of the inputs are empty
        if (title.isEmpty() || date.isEmpty() || time.isEmpty() || description.isEmpty()) {
            return;
        }

        // Create an event string
        String event = "Title: " + title + " | Date: " + date + " | Time: " + time + " | Description: " + description;

        // Add the string to events
        eventListControl.addEvent(event);

        // Return to Event List
        eventListControl.goBackToEventList();
    }

    // For Back to Event List button
    @FXML
    private void handleBackToList() {
       eventListControl.goBackToEventList();
    }

    // To reset input fields
    @FXML
    public void reset() {
        titleField.clear();
        datePicker.setValue(null);
        timeField.clear();
        descriptionArea.clear();
    }
}
