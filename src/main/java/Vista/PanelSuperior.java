
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelSuperior extends JPanel {

    final static String volverMenuPrincipal = "MenuPrincipal";
    final static String volverVentanaIdentificar = "VentanaIdentificar";
    final static String darInstruccion = "Instruccion";
    final static String salirPrograma = "Salir";
    
    JButton btnRegresar;
    JButton btnInstruccion;
    JButton btnSalir;
    JLabel lbl;

    public PanelSuperior() {
        initComponent();
    }

    public void initComponent() {

        GridLayout superior = new GridLayout(1, 6);
        setLayout(superior);
        Font fuente = new Font("Showcard Gothic", 3, 10);

        btnRegresar = new JButton("Regresar");
        btnRegresar.setBackground(Color.ORANGE);
        btnRegresar.setFont(fuente);
        btnRegresar.setForeground(Color.BLACK);
        this.add(btnRegresar);

        lbl = new JLabel("");
        this.add(lbl);

        btnInstruccion = new JButton("Instruccion");
        btnInstruccion.setBackground(Color.GREEN);
        btnInstruccion.setFont(fuente);
        btnInstruccion.setForeground(Color.BLACK);
        this.add(btnInstruccion);

        lbl = new JLabel("");
        this.add(lbl);

        btnSalir = new JButton("Salir");
        btnSalir.setBackground(Color.RED);
        btnSalir.setFont(fuente);
        btnSalir.setForeground(Color.BLACK);
        this.add(btnSalir);

    }

}
