package ventanaPrincipal;

import javax.swing.*;
import java.awt.*;

public class LaminaPrincipal extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(50, 50, 200, 200);
    }

}
