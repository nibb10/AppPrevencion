
package Vista;

import Utils.Reproductor;
import static Vista.PanelSeleccion.Video1;
import static Vista.PanelSeleccion.Video2;
import static Vista.PanelSeleccion.Video3;
import static Vista.PanelSeleccion.Video4;
import static Vista.PanelSuperior.volverMenuPrincipal;
import static Vista.PanelSuperior.darInstruccion;
import static Vista.PanelSuperior.salirPrograma;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaAprender extends JFrame implements ActionListener {

    Reproductor r = new Reproductor();
    
    public VentanaAprender() {
        initComponent();
    }

    public void Cerrar() {
        dispose();
    }

    public void initComponent() {

        PanelSuperior pnSup = new PanelSuperior();
        pnSup.setBackground(Color.LIGHT_GRAY);
        this.add(pnSup, BorderLayout.NORTH);
        
        PanelSeleccion pnAp = new PanelSeleccion();
        pnAp.initAprender();
        this.add(pnAp, BorderLayout.CENTER);

        pnAp.btnVideo1.setActionCommand(Video1);
        pnAp.btnVideo2.setActionCommand(Video2);
        pnAp.btnVideo3.setActionCommand(Video3);
        pnAp.btnVideo4.setActionCommand(Video4);

        pnAp.btnVideo1.addActionListener(this);
        pnAp.btnVideo2.addActionListener(this);
        pnAp.btnVideo3.addActionListener(this);
        pnAp.btnVideo4.addActionListener(this);

        pnSup.btnRegresar.setActionCommand(volverMenuPrincipal);
        pnSup.btnInstruccion.setActionCommand(darInstruccion);
        pnSup.btnSalir.setActionCommand(salirPrograma);
        
        pnSup.btnRegresar.addActionListener(this);
        pnSup.btnInstruccion.addActionListener(this);
        pnSup.btnSalir.addActionListener(this);
        
        this.setUndecorated(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 650);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);

    }

    public void actionPerformed(ActionEvent evento) {

        String comando = evento.getActionCommand();
        
        try {
            
        switch (comando) {
            case (volverMenuPrincipal):
                VentanaPrincipal Vpr = new VentanaPrincipal();
                Cerrar();
                break;
                
            case (Video1):
                r.ReproducirVideo("videos/video1.mp4");
                break;
                
            case (Video2):
                r.ReproducirVideo("videos/video2.mp4");
                break;
                
            case (Video3):
                r.ReproducirVideo("videos/video3.mp4");
                break;
                
            case (Video4):
                r.ReproducirVideo("videos/video4.mp4");
                break;
                
            case (darInstruccion):
                r.ReproducirAudio("audios/instruccion_aprender.mp3");
                break;
                
            case (salirPrograma):
                r.ReproducirAudio("audios/opcionSalida.mp3");
                int opc = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Advertencia",
                    JOptionPane.YES_NO_OPTION);
                
                if (opc == 0) {
                    r.ReproducirAudio("audios/Salida.mp3");
                    System.exit(0);
                }
            }
        
        } catch (InterruptedException ex) {
                Logger.getLogger(VentanaAprender.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
