package Vista;

import Utils.Reproductor;
import static Vista.PanelSeleccion.COCINA;
import static Vista.PanelSeleccion.COMEDOR;
import static Vista.PanelSeleccion.DORMITORIO;
import static Vista.PanelSeleccion.LIVING;
import static Vista.PanelSuperior.darInstruccion;
import static Vista.PanelSuperior.salirPrograma;
import static Vista.PanelSuperior.volverMenuPrincipal;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaIdentificar extends JFrame implements ActionListener {

    Reproductor r = new Reproductor();

    public VentanaIdentificar() {
        initComponent();
    }

    public void Cerrar() {
        dispose();
    }

    public void initComponent() {

        PanelSuperior pnSup = new PanelSuperior();
        pnSup.setBackground(Color.LIGHT_GRAY);
        this.add(pnSup, BorderLayout.NORTH);

        pnSup.btnRegresar.setActionCommand(volverMenuPrincipal);
        pnSup.btnInstruccion.setActionCommand(darInstruccion);
        pnSup.btnSalir.setActionCommand(salirPrograma);

        pnSup.btnRegresar.addActionListener(this);
        pnSup.btnInstruccion.addActionListener(this);
        pnSup.btnSalir.addActionListener(this);

        PanelSeleccion pnIde = new PanelSeleccion();
        pnIde.initIdentificar();
        this.add(pnIde, BorderLayout.CENTER);

        pnIde.btnComedor.setActionCommand(COMEDOR);
        pnIde.btnLiving.setActionCommand(LIVING);
        pnIde.btnCocina.setActionCommand(COCINA);
        pnIde.btnDormitorio.setActionCommand(DORMITORIO);

        pnIde.btnComedor.addActionListener(this);
        pnIde.btnLiving.addActionListener(this);
        pnIde.btnCocina.addActionListener(this);
        pnIde.btnDormitorio.addActionListener(this);

        this.setUndecorated(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 650);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
    }

    public void actionPerformed(ActionEvent evento) {

        String comando = evento.getActionCommand();

        switch (comando) {
            case (COMEDOR):
                r.ReproducirAudio("audios/comedor.mp3");
                VentanaHabitacion Vcom = new VentanaHabitacion();
                Vcom.initComedor();
                Cerrar();
                break;
                
            case (LIVING):
                r.ReproducirAudio("audios/living.mp3");
                VentanaHabitacion Vliv = new VentanaHabitacion();
                Vliv.initLiving();
                Cerrar();
                break;
                
            case (COCINA):
                r.ReproducirAudio("audios/cocina.mp3");
                VentanaHabitacion Vcoc = new VentanaHabitacion();
                Vcoc.initCocina();
                Cerrar();
                break;
                
            case (DORMITORIO):
                r.ReproducirAudio("audios/dormitorio.mp3");
                VentanaHabitacion Vdor = new VentanaHabitacion();
                Vdor.initDormitorio();
                Cerrar();
                break;
                
            case (volverMenuPrincipal):
                VentanaPrincipal Vpr = new VentanaPrincipal();
                Cerrar();
                break;
                
            case (darInstruccion):
                r.ReproducirAudio("audios/instruccion_identificar.mp3");
                break;
                
            case (salirPrograma):
                r.ReproducirAudio("audios/opcionSalida.mp3");
                int opc = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Advertencia",
                    JOptionPane.YES_NO_OPTION);
                
                if (opc == 0) {
                    r.ReproducirAudio("audios/Salida.mp3");
                    System.exit(0);
                    }
                break;
        }
    }
}
