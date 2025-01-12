import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;

public class DialogExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Dialog Example");

        // Create a panel with FlowLayout
        JPanel panel = new JPanel(new FlowLayout());

        // Create buttons to show dialogs
        addButton(panel, "Show Message Dialog", e -> showMessageDialog(frame));
        addButton(panel, "Show Input Dialog", e -> showInputDialog(frame));
        addButton(panel, "Show File Chooser", e -> showFileChooser(frame));
        addButton(panel, "Show Option Dialog", e -> showOptionDialog(frame));

        // Add the panel to the frame
        frame.add(panel);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    // Method to create and show a message dialog
    private static void showMessageDialog(Component parent) {
        JOptionPane.showMessageDialog(parent, "This is a message dialog", "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    // Method to create and show an input dialog
    private static void showInputDialog(Component parent) {
        String input = JOptionPane.showInputDialog(parent, "Enter your name:");
        if (input != null) {
            JOptionPane.showMessageDialog(parent, "Hello, " + input + "!", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Method to create and show a file chooser dialog
    private static void showFileChooser(Component parent) {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(parent);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            JOptionPane.showMessageDialog(parent, "Selected file: " + selectedFile.getAbsolutePath(), "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Method to create and show an option dialog
    private static void showOptionDialog(Component parent) {
        String[] options = {"Option 1", "Option 2", "Option 3"};
        int result = JOptionPane.showOptionDialog(parent, "Choose an option:", "Option Dialog",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (result != JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(parent, "You selected: " + options[result], "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Method to create and add a button to the panel
    private static void addButton(Container container, String text, ActionListener actionListener) {
        JButton button = new JButton(text);
        button.addActionListener(actionListener);
        container.add(button);
    }
}
