# Event Planner

A simple **Event Planner** app using JavaFX.  
Users can add events with a title, date, time, and description, and view them in a styled event list.

## How to Run
Requirement: JavaFX SDK 24.0.1

Set path: --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml

Run Main.java from IDE 

## JavaFX Controls Used

- `TextField` → for event Title and Time inputs
- `DatePicker` → for selecting Event Date
- `TextArea` → for event Description
- `Button` → for "Save Event" and "Back to Event List"
- `ListView<String>` → to display the list of events
- `Label` → for headings and field labels

## Effects, Gradients, and Animations
- `ListView` uses a **linear gradient** and a DropShadow effect
- When a new event is added, a simple slide-in animation is applied using TranslateTransition

## JavaFX properties for binding
- The `Event` class uses JavaFX properties for data binding:

private final StringProperty title = new SimpleStringProperty();  
private final ObjectProperty<LocalDate> date = new SimpleObjectProperty<>();  
private final StringProperty time = new SimpleStringProperty();  
private final StringProperty description = new SimpleStringProperty();  
- Allows the data to easily bound to UI components

## Screenshots of running program
https://drive.google.com/file/d/1_zn3XMMP-viBzPfezatVVOeB3lQfjKrw/view?usp=drive_link
https://drive.google.com/file/d/1OlX_9qvUDcqlOoNlFaMj4Wtiu6_kH8D_/view?usp=drive_link
