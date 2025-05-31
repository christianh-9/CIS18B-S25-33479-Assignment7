import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import java.time.LocalDate;

public class Event {

    private final StringProperty title = new SimpleStringProperty();
    private final ObjectProperty<LocalDate> date = new SimpleObjectProperty<>();
    private final StringProperty time = new SimpleStringProperty();
    private final StringProperty description = new SimpleStringProperty();

    // Getters and setters for binding
    public StringProperty titleProperty() {
        return title;
    }
    public ObjectProperty<LocalDate> dateProperty() {
        return date;
    }
    public StringProperty timeProperty() {
        return time;
    }

    public StringProperty descriptionProperty() {
        return description;
    }

    public String getTitle() {
        return title.get();
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public LocalDate getDate() {
        return date.get();
    }
    public void setDate(LocalDate date) {
        this.date.set(date);
    }

    public String getTime() {
        return time.get();
    }
    public void setTime(String time) {
        this.time.set(time);
    }

    public String getDescription() {
        return description.get();
    }
    public void setDescription(String description) {
        this.description.set(description);
    }

    @Override
    public String toString() {
        return "Title: " + title.get() + " | Date: " + date.get() + " | Time: " + time.get() + " | Description: " + description.get();
    }
}

