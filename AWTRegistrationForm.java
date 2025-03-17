import java.awt.*;
import java.awt.event.*;

public class AWTRegistrationForm extends Frame {
    Label nameLabel, dobLabel, genderLabel;
    TextField nameField, dayField, monthField, yearField;
    CheckboxGroup genderGroup;
    Checkbox male, female;
    Button submitButton;

    public AWTRegistrationForm() {
        setTitle("User Registration Form");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2, 10, 10));

        nameLabel = new Label("Name:");
        dobLabel = new Label("Date of Birth (dd-mm-yy):");
        genderLabel = new Label("Gender:");

        nameField = new TextField(20);
        dayField = new TextField(2);
        monthField = new TextField(2);
        yearField = new TextField(4);

        genderGroup = new CheckboxGroup();
        male = new Checkbox("Male", genderGroup, false);
        female = new Checkbox("Female", genderGroup, false);

        submitButton = new Button("Submit");
        submitButton.setBackground(Color.GREEN);

        add(nameLabel);
        add(nameField);
        add(dobLabel);
        Panel dobPanel = new Panel();
        dobPanel.add(dayField);
        dobPanel.add(monthField);
        dobPanel.add(yearField);
        add(dobPanel);
        add(genderLabel);
        Panel genderPanel = new Panel();
        genderPanel.add(male);
        genderPanel.add(female);
        add(genderPanel);

        Panel submitPanel = new Panel();
        submitPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        submitPanel.add(submitButton);
        add(submitPanel);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new AWTRegistrationForm();
    }
}
