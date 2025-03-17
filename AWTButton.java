import java.awt.*;
import java.awt.event.*;

public class AWTButton {
    public static void main(String[] args) {
        Frame frame = new Frame("Creating Button using AWT");
        Button button = new Button("Click Here");
        
        frame.setSize(300, 200);
        frame.setLayout(null);
        
        int frameWidth = frame.getWidth();
        int frameHeight = frame.getHeight();
        int buttonWidth = 100;
        int buttonHeight = 50;
        
        button.setBounds((frameWidth - buttonWidth) / 2, (frameHeight - buttonHeight) / 2, buttonWidth, buttonHeight);
        button.setBackground(Color.GREEN);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        });
        
        frame.add(button);
        frame.setVisible(true);
        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
