
package Vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelImaHabitacion extends JPanel {

    JLabel btnHabitacion;

    public PanelImaHabitacion() {
        initComponent();
    }

    public void initComponent() {
        btnHabitacion = new JLabel();
        this.add(btnHabitacion);
    }

    public void crearImagen(String ruta) {
        ImageIcon icono = new ImageIcon(ruta);
        btnHabitacion.setIcon(icono);
    }

}
