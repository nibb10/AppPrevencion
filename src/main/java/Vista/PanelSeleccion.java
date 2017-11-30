
package Vista;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class PanelSeleccion extends JPanel {
    
    final static String COMEDOR = "Comedor";
    final static String LIVING = "Living";
    final static String COCINA = "Cocina";
    final static String DORMITORIO = "Dormitorio";
    final static String Video1 = "video1";
    final static String Video2 = "video2";
    final static String Video3 = "video3";
    final static String Video4 = "video4";
    
    JButton btnComedor;
    JButton btnLiving;
    JButton btnCocina;
    JButton btnDormitorio;
    JButton btnVideo1;
    JButton btnVideo2;
    JButton btnVideo3;
    JButton btnVideo4;

    public PanelSeleccion() {
        initComponent();
    }
    
    public void initComponent() {
        GridLayout seleccion = new GridLayout(2, 2);
        setLayout(seleccion);
    }
    
    public void initIdentificar() {
        btnComedor = new JButton();
        ImageIcon icono1 = new ImageIcon("imagenes\\comedor.jpg");
        btnComedor.setIcon(icono1);
        this.add(btnComedor);

        btnLiving = new JButton();
        ImageIcon icono2 = new ImageIcon("imagenes\\living.jpg");
        btnLiving.setIcon(icono2);
        this.add(btnLiving);

        btnCocina = new JButton();
        ImageIcon icono3 = new ImageIcon("imagenes\\cocina.jpg");
        btnCocina.setIcon(icono3);
        this.add(btnCocina);

        btnDormitorio = new JButton();
        ImageIcon icono4 = new ImageIcon("imagenes\\dormitorio.jpg");
        btnDormitorio.setIcon(icono4);
        this.add(btnDormitorio);
    }
    
    public void initAprender() {
        btnVideo1 = new JButton();
        ImageIcon icono1 = new ImageIcon("imagenes\\video1.png");
        btnVideo1.setIcon(icono1);
        add(btnVideo1);

        btnVideo2 = new JButton();
        ImageIcon icono2 = new ImageIcon("imagenes\\video2.png");
        btnVideo2.setIcon(icono2);
        add(btnVideo2);
        
        btnVideo3 = new JButton();
        ImageIcon icono3 = new ImageIcon("imagenes\\video3.png");
        btnVideo3.setIcon(icono3);
        add(btnVideo3);
        
        btnVideo4 = new JButton();
        ImageIcon icono4 = new ImageIcon("imagenes\\video4.png");
        btnVideo4.setIcon(icono4);
        add(btnVideo4);
    }
}
