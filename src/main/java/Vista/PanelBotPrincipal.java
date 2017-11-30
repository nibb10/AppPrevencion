
package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class PanelBotPrincipal extends JPanel {

    final static String IDENTIFICAR = "Identificar";
    final static String APRENDER = "Aprender";
    final static String SALIR = "Salida";

    JButton btnIdentificar;
    JButton btnAprender;
    JButton btnSalir;

    public PanelBotPrincipal() {
        initComponent();
    }
    
    public void initComponent(){

        GridLayout botones = new GridLayout(0, 3, 0, 0);
        setPreferredSize(new Dimension(0, 50));
        this.setLayout(botones);

        Font fuente = new Font("Showcard Gothic", 3, 15);

        btnIdentificar = new JButton("Identificando Riesgos");
        btnIdentificar.setBackground(Color.ORANGE);
        btnIdentificar.setForeground(Color.BLUE);
        btnIdentificar.setFont(fuente);
        this.add(btnIdentificar);

        btnAprender = new JButton("Aprendiendo Riesgos");
        btnAprender.setBackground(Color.GREEN);
        btnAprender.setForeground(Color.BLUE);
        btnAprender.setFont(fuente);
        this.add(btnAprender);

        btnSalir = new JButton("Salir");
        btnSalir.setBackground(Color.RED);
        btnSalir.setForeground(Color.BLUE);
        btnSalir.setFont(fuente);
        this.add(btnSalir);
    }
    
}
