import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutManager {
    public static void main(String[] args) {
        // showBorderLayout();
       // showFlowLayout();
       // showGridLayout();
       // showCardLayout();
        showBoxLayout();
    }


    private static void showBoxLayout() {
        JFrame frame = new JFrame("BoxLayout Example");

        // Create a panel with BoxLayout along the Y_AXIS (vertical)
        JPanel panel = new JPanel();
       // panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        // Create components to add to the panel
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JLabel label = new JLabel("This is a label");

        // Add components to the panel
        panel.add(button1);
        panel.add(Box.createVerticalStrut(10)); // Add vertical space
        panel.add(button2);
        panel.add(Box.createVerticalStrut(10)); // Add vertical space
        panel.add(button3);
        panel.add(Box.createVerticalGlue()); // Add vertical glue to push components to the top
        panel.add(label);

        // Add the panel to the frame
        frame.add(panel);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

    private static void showCardLayout() {
        // Create a new JFrame
        JFrame frame = new JFrame("CardLayout Example");

        // Create a panel with CardLayout
        JPanel cardPanel = new JPanel(new CardLayout());
        // Create "cards" to be added to the panel
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Card 1"));
        card1.setBackground(Color.CYAN);

        JPanel card2 = new JPanel();
        card2.add(new JLabel("Card 2"));
        card2.setBackground(Color.BLUE);

        JPanel card3 = new JPanel();
        card3.add(new JLabel("Card 3"));
        card3.setBackground(Color.ORANGE);
        // Add cards to the card panel with unique names
        cardPanel.add(card1, "card1");
        cardPanel.add(card2, "card2");
        cardPanel.add(card3, "card3");

        // Create buttons to switch between cards
        JButton prevButton = new JButton("Previous");
        JButton nextButton = new JButton("Next");

        // Add action listeners to the buttons
        prevButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout layout = (CardLayout) cardPanel.getLayout();
                layout.previous(cardPanel);
            }
        });

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout layout = (CardLayout) cardPanel.getLayout();
                layout.next(cardPanel);
            }
        });

        // Create a panel to hold the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);

        // Add the card panel and button panel to the frame
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    private static void showGridLayout() {
        // Create a new JFrame
        JFrame frame = new JFrame("GridLayout Example");

        // Set the layout manager for the frame to GridLayout
        frame.setLayout(new GridLayout(2, 3)); // 3 rows, 2 columns

        addButtons(frame);
        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    private static void showFlowLayout() {
        /**
         * When you run this program, it will display a
         * JFrame with five buttons arranged
         * horizontally in a FlowLayout.
         * If the space is not enough to accommodate all buttons
         * in a single row, they will wrap to the next row.
         *
         * */
        // Create a new JFrame
        JFrame frame = new JFrame("FlowLayout Example");

        // Set the layout manager for the frame to FlowLayout
        //frame.setLayout(new FlowLayout());
        frame.setLayout(new FlowLayout());
        // Create and add components to the frame
        addButtons(frame);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);

    }

    private static void addButtons(JFrame frame) {
        JButton button1 = new JButton("Button 1");
        frame.add(button1);

        JButton button2 = new JButton("Button 2");
        frame.add(button2);

        JButton button3 = new JButton("Button 3");
        frame.add(button3);

        JButton button4 = new JButton("B");
        frame.add(button4);

        JButton button5 = new JButton("Button 5");
        frame.add(button5);
    }

    private static void showBorderLayout() {
        /*When you run this program, it will display a
        JFrame with five buttons positioned at the
        north, south, east, west,
        and center regions of the BorderLayout, respectively
        *
        * */
        // Create a new JFrame
        JFrame frame = new JFrame("BorderLayout Example");

        // Set the layout manager for the frame to BorderLayout
        frame.setLayout(new BorderLayout());

        // Create and add components to the frame
        JButton button1 = new JButton("North");
        frame.add(button1, BorderLayout.NORTH);

        JButton button2 = new JButton("South");
        frame.add(button2, BorderLayout.SOUTH);

        JButton button3 = new JButton("East");
        frame.add(button3, BorderLayout.EAST);

        JButton button4 = new JButton("West");
        frame.add(button4, BorderLayout.WEST);

        JButton button5 = new JButton("Center");
        frame.add(button5, BorderLayout.CENTER);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

}
