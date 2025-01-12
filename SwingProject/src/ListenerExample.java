import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListenerExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Event Listeners Example");

        // Create a panel with FlowLayout
        JPanel panel = new JPanel(new FlowLayout());

        // Create a button with ActionListener
        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button clicked", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        panel.add(button);

        // Add MouseListener to the button
        button.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked");
            }

            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse pressed");
            }

            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse released");
            }

            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse entered");
            }

            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse exited");
            }
        });

        // Add KeyListener to the frame
        frame.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
                System.out.println("Key typed: " + e.getKeyChar());
            }

            public void keyPressed(KeyEvent e) {
                System.out.println("Key pressed: " + e.getKeyCode());
            }

            public void keyReleased(KeyEvent e) {
                System.out.println("Key released: " + e.getKeyCode());
            }
        });

        // Add WindowListener to the frame
        frame.addWindowListener(new WindowListener() {
            public void windowOpened(WindowEvent e) {
                System.out.println("Window opened");
            }

            public void windowClosing(WindowEvent e) {
                System.out.println("Window closing");
            }

            public void windowClosed(WindowEvent e) {
                System.out.println("Window closed");
            }

            public void windowIconified(WindowEvent e) {
                System.out.println("Window iconified");
            }

            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window deiconified");
            }

            public void windowActivated(WindowEvent e) {
                System.out.println("Window activated");
            }

            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window deactivated");
            }
        });

        // Add the panel to the frame
        frame.add(panel);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);

        // Set focusable for frame to receive key events
        frame.setFocusable(true);
        frame.requestFocusInWindow();
    }
}

