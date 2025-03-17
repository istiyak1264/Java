import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ButtonPanel extends JPanel {
    private JButton button;

    public ButtonPanel(String buttonText) {
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

        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 50));
        add(button);
    }
}

class ButtonFrame extends JFrame {
    public ButtonFrame(String buttonText) {
        super("Simple Button using Java Swing");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ButtonPanel buttonPanel = new ButtonPanel(buttonText);
        add(buttonPanel);
    }
}

public class javaSwingInheritance {
    public static void main(String[] args) {
        ButtonFrame frame = new ButtonFrame("Click Me!");
        frame.setVisible(true);
    }
}
