import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Button {
    private JButton button;

    public Button(String buttonText) {
        button = new JButton(buttonText);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setBackground(Color.CYAN);

        int buttonWidth = 150;
        int buttonHeight = 50;
        button.setPreferredSize(new Dimension(buttonWidth, buttonHeight));

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You clicked the button!");
            }
        });
    }

    public JButton getButton() {
        return button;
    }

    public void setBounds(int i, int j, int buttonWidth, int buttonHeight) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setBounds'");
    }

    public void setBackground(Color green) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setBackground'");
    }

    public void addActionListener(ActionListener actionListener) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addActionListener'");
    }
}

class ButtonPanel extends JPanel {
    public ButtonPanel(Button button) {
        add(button.getButton());  // Directly using the JButton from the Button object (association)
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 50));
    }
}

class ButtonFrame extends JFrame {
    public ButtonFrame(Button button) {
        setTitle("Simple Button using Java Swing");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ButtonPanel buttonPanel = new ButtonPanel(button);  // Passing the Button object to ButtonPanel constructor (association)
        add(buttonPanel);
    }
}

public class javaSwingAssociationAndConstructors {
    public static void main(String[] args) {
        Button button = new Button("Click Me!");  // Creating the Button object
        ButtonFrame frame = new ButtonFrame(button);  // Passing Button object to ButtonFrame constructor (association)
        frame.setVisible(true);
    }
}
