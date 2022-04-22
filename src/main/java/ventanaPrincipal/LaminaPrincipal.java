package ventanaPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class LaminaPrincipal extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangle = new Rectangle2D.Double(100, 100, 200, 150);
        g2.draw(rectangle);

    }

}
