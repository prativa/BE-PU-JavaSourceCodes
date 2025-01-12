import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDemo {
    public static void main(String[] args){
        showMenu();
    }

    private static void showMenu() {
        // Create a new JFrame
        JFrame frame = new JFrame("Menu Example");

        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create a JMenu
        JMenu fileMenu = new JMenu("File");

        // Create JMenuItem for File menu
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        // Add action listener to Exit menu item
        exitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Add menu items to File menu
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator(); // Add a separator
        fileMenu.add(exitMenuItem);

        // Add File menu to the menu bar
        menuBar.add(fileMenu);

        // Set the menu bar for the frame
        frame.setJMenuBar(menuBar);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);

    }
}
