import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
// 6 step process for creating a gui
        // step 1. create a frame
        JFrame frame = new JFrame();
        frame.setSize(750, 500);
        frame.setBackground(Color.pink);
        // step 2. create panel
JPanel panel = new JPanel();
panel.setBackground(new Color(245, 37, 145));
        // step 3. create components
JLabel label = new JLabel("Hello World");
        // step 4. add components to the panel
panel.add(label);
        JScrollBar scroll = new JScrollBar(JScrollBar.HORIZONTAL);
       
        panel.add(scroll);

        // step 5. add the panel to the frame
frame.add(panel);
        // step 6. make frame visible
frame.setVisible(true);


        }
    }
