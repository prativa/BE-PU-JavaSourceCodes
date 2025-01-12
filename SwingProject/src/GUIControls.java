import javax.swing.*;
import java.awt.*;

public class GUIControls {

    public static void main(String[] args){
        // Create a new JFrame
        JFrame frame = new JFrame("Unique Component Methods Example");

        // Create a panel with GridLayout to hold controls
        JPanel panel = new JPanel(new GridLayout(0, 2, 10, 10)); // 0 rows, 2 columns

        // Add controls to the panel using custom methods
        addLabel(panel, "This is a label");
        addButton(panel, "Click Me");
        addTextField(panel, "Enter text here");
        addCheckBox(panel, "Check me");
        addRadioButtons(panel, "Option 1", "Option 2","Option 3");
        addComboBox(panel, "Item 1", "Item 2", "Item 3");
        addList(panel, "Item 1", "Item 2", "Item 3");
        addSlider(panel, 0, 100, 50);
        addProgressBar(panel, 90);

        // Add the panel to the frame
        frame.add(panel);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);

    }
    // Method to add a JLabel to the panel
    private static void addLabel(JPanel panel, String text) {
        JLabel label = new JLabel(text);
        label.setForeground(Color.BLUE); // Set text color
        panel.add(label);
    }

    // Method to add a JButton to the panel
    private static void addButton(JPanel panel, String text) {
        JButton button = new JButton(text);
        button.setBackground(Color.GREEN); // Set button color
        panel.add(button);
    }

    // Method to add a JTextField to the panel
    private static void addTextField(JPanel panel, String text) {
        JTextField textField = new JTextField(text);
        textField.setFont(new Font("Arial", Font.BOLD, 14)); // Set font
        panel.add(textField);
    }

    // Method to add a JCheckBox to the panel
    private static void addCheckBox(JPanel panel, String text) {
        JCheckBox checkBox = new JCheckBox(text);
        checkBox.setSelected(true); // Set initial state
        panel.add(checkBox);
    }

    // Method to add JRadioButtons to the panel
    private static void addRadioButtons(JPanel panel, String... options) {
        ButtonGroup group = new ButtonGroup();
        for (String option : options) {
            JRadioButton radioButton = new JRadioButton(option);
            group.add(radioButton);
            panel.add(radioButton);
        }
    }

    // Method to add a JComboBox to the panel
    private static void addComboBox(JPanel panel, String... items) {
        JComboBox<String> comboBox = new JComboBox<>(items);
        comboBox.setSelectedIndex(0); // Set initial selection
        panel.add(comboBox);
    }

    // Method to add a JList to the panel
    private static void addList(JPanel panel, String... items) {
        JList<String> list = new JList<>(items);
        panel.add(new JScrollPane(list));
    }

    // Method to add a JSlider to the panel
    private static void addSlider(JPanel panel, int min, int max, int initialValue) {
        JSlider slider = new JSlider(JSlider.VERTICAL, min, max, initialValue);
        slider.setMajorTickSpacing(10); // Set tick spacing
        slider.setPaintTicks(true); // Show ticks
        panel.add(slider);
    }

    // Method to add a JProgressBar to the panel
    private static void addProgressBar(JPanel panel, int value) {
        JProgressBar progressBar = new JProgressBar();
        progressBar.setValue(value);
        progressBar.setStringPainted(true); // Show text
        panel.add(progressBar);
    }

}
