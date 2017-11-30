
package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotHabitacion extends JPanel {

    final static String IZQUIERDA_Comedor = "izquierda_comedor";
    final static String CENTRO_Comedor = "centro_comedor";
    final static String DERECHA_Comedor = "derecha_comedor";
    final static String IZQUIERDA_Living = "izquierda_living";
    final static String CENTRO_Living = "centro_living";
    final static String DERECHA_Living = "derecha_living";
    final static String IZQUIERDA_Cocina = "izquierda_cocina";
    final static String CENTRO_Cocina = "centro_cocina";
    final static String DERECHA_Cocina = "derecha_cocina";
    final static String IZQUIERDA_Dormitorio = "izquierda_dormitorio";
    final static String CENTRO_Dormitorio = "centro_dormitorio";
    final static String DERECHA_Dormitorio = "derecha_dormitorio";

    JButton btnIzquierda;
    JButton btnCentro;
    JButton btnDerecha;

    public PanelBotHabitacion() {
        initComponent();
    }

    public void initComponent() {
        GridLayout inferior = new GridLayout(1, 3, 3, 3);
        setBackground(Color.GRAY);
        this.setLayout(inferior);
        setPreferredSize(new Dimension(0, 155));
    }

    public void crearImagenes(String ruta1, String ruta2, String ruta3) {

        btnIzquierda = new JButton();
        btnIzquierda.setBackground(Color.WHITE);
        ImageIcon icono1 = new ImageIcon(ruta1);
        btnIzquierda.setIcon(icono1);
        this.add(btnIzquierda);

        btnCentro = new JButton();
        btnCentro.setBackground(Color.WHITE);
        ImageIcon icono2 = new ImageIcon(ruta2);
        btnCentro.setIcon(icono2);
        this.add(btnCentro);

        btnDerecha = new JButton();
        btnDerecha.setBackground(Color.WHITE);
        ImageIcon icono3 = new ImageIcon(ruta3);
        btnDerecha.setIcon(icono3);
        this.add(btnDerecha);
    }

}
