import java.awt.Color;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class DemoKeyListener extends JFrame {

    JFrame frame;
    JTextArea text;

    DemoKeyListener() {
        frame = new JFrame("Key Listener Demo");
        text = new JTextArea();

        text.addKeyListener(new MyKeyListener());
        text.setBounds(200, 150, 100, 90);
        text.setFocusable(true);
        text.requestFocusInWindow();

        frame.setSize(500, 500);
        frame.getContentPane().setBackground(new Color(0, 0, 0));
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(text);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new DemoKeyListener();
    }

    class MyKeyListener implements KeyListener {
        public void keyPressed(KeyEvent e) {
            text.setText("Key Pressed: " + e.getKeyChar());
        }

        public void keyReleased(KeyEvent e) {
            text.setText("Key Released: " + e.getKeyChar());
        }

        public void keyTyped(KeyEvent e) {
            text.setText("Key Typed: " + e.getKeyChar());
        }
    }
}
