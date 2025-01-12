import javax.swing.*;
import java.awt.*;

public class TooltipExample {
    public static void main(String[] args){
        // Create a new JFrame
        JFrame frame = new JFrame("Tooltip Example");

        // Create a panel with FlowLayout
        JPanel panel = new JPanel(new FlowLayout());

        // Create a button with tooltip
        JButton button = new JButton("Hover Me");
        button.setToolTipText("This is a button"); // Set tooltip text
        panel.add(button);

        // Create a text field with tooltip
        JTextField textField = new JTextField(20);
        textField.setToolTipText("Enter text here"); // Set tooltip text
        panel.add(textField);

        // Create a label with tooltip
        JLabel label = new JLabel("Label");
        label.setToolTipText("This is a label"); // Set tooltip text
        panel.add(label);

        // Add the panel to the frame
        frame.add(panel);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
