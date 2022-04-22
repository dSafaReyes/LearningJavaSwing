package ventanaPrincipal;

import javax.swing.*;
import java.awt.*;

public class MiMarco extends JFrame {

    public MiMarco() {

        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = mipantalla.getScreenSize();
        setBounds(tamanioPantalla.width/4, tamanioPantalla.height/4, tamanioPantalla.width/2, tamanioPantalla.height/2);
        setResizable(true);
        setTitle("Mi ventana");

        Image miIcono = mipantalla.getImage("images/icono.png");
        setIconImage(miIcono);

        LaminaPrincipal laminaPrincipal = new LaminaPrincipal();
        add(laminaPrincipal);

    }

}


