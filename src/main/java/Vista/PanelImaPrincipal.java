
package Vista;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelImaPrincipal extends JPanel {

    private ImageIcon imagen;
    private Icon icono;
    private JLabel boton;

    public PanelImaPrincipal() {
        initComponent();
    }

    public void initComponent() {
        boton = new JLabel();
        boton.setBounds(0, 0, 750, 600);
        boton.setIcon(crearImagen(boton));
        this.add(boton, BorderLayout.CENTER);
    }

    public Icon crearImagen(JLabel boton) {
        imagen = new ImageIcon("imagenes\\principal.jpg");
        icono = new ImageIcon(imagen.getImage().getScaledInstance(boton.getWidth(),
                boton.getHeight(), Image.SCALE_DEFAULT));
        return icono;
    }

}
