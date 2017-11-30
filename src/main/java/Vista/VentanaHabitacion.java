package Vista;

import Utils.Reproductor;
import static Vista.PanelBotHabitacion.IZQUIERDA_Comedor;
import static Vista.PanelBotHabitacion.IZQUIERDA_Cocina;
import static Vista.PanelBotHabitacion.IZQUIERDA_Living;
import static Vista.PanelBotHabitacion.IZQUIERDA_Dormitorio;
import static Vista.PanelBotHabitacion.CENTRO_Comedor;
import static Vista.PanelBotHabitacion.CENTRO_Cocina;
import static Vista.PanelBotHabitacion.CENTRO_Living;
import static Vista.PanelBotHabitacion.CENTRO_Dormitorio;
import static Vista.PanelBotHabitacion.DERECHA_Comedor;
import static Vista.PanelBotHabitacion.DERECHA_Cocina;
import static Vista.PanelBotHabitacion.DERECHA_Living;
import static Vista.PanelBotHabitacion.DERECHA_Dormitorio;
import static Vista.PanelSuperior.darInstruccion;
import static Vista.PanelSuperior.volverVentanaIdentificar;
import static Vista.PanelSuperior.salirPrograma;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaHabitacion extends JFrame implements ActionListener {

    Reproductor r = new Reproductor();
    private PanelSuperior pnSup;
    private PanelImaHabitacion pnIma;
    private PanelBotHabitacion pnInf;

    public VentanaHabitacion() {
        initComponent();
    }

    public void Cerrar() {
        dispose();
    }

    public void initComponent() {
        pnSup = new PanelSuperior();
        pnSup.setBackground(Color.LIGHT_GRAY);
        this.add(pnSup, BorderLayout.NORTH);

        pnIma = new PanelImaHabitacion();
        pnIma.setBackground(Color.LIGHT_GRAY);
        this.add(pnIma, BorderLayout.CENTER);

        pnInf = new PanelBotHabitacion();
        this.add(pnInf, BorderLayout.SOUTH);

        pnSup.btnRegresar.setActionCommand(volverVentanaIdentificar);
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

    public void initComedor() {
        pnIma.crearImagen("imagenes\\comedor2.jpg");

        pnInf.crearImagenes("imagenes\\ventana.jpg",
                "imagenes\\mantel.gif", "imagenes\\agua.jpg");

        pnInf.btnIzquierda.setActionCommand(IZQUIERDA_Comedor);
        pnInf.btnCentro.setActionCommand(CENTRO_Comedor);
        pnInf.btnDerecha.setActionCommand(DERECHA_Comedor);

        pnInf.btnIzquierda.addActionListener(this);
        pnInf.btnCentro.addActionListener(this);
        pnInf.btnDerecha.addActionListener(this);
    }

    public void initLiving() {
        pnIma.crearImagen("imagenes\\living2.jpg");

        pnInf.crearImagenes("imagenes\\chimenea.gif",
                "imagenes\\florero.jpg", "imagenes\\enchufe.gif");

        pnInf.btnIzquierda.setActionCommand(IZQUIERDA_Living);
        pnInf.btnCentro.setActionCommand(CENTRO_Living);
        pnInf.btnDerecha.setActionCommand(DERECHA_Living);

        pnInf.btnIzquierda.addActionListener(this);
        pnInf.btnCentro.addActionListener(this);
        pnInf.btnDerecha.addActionListener(this);
    }

    public void initCocina() {
        pnIma.crearImagen("imagenes\\cocina2.jpg");

        pnInf.crearImagenes("imagenes\\cuchillo.gif",
                "imagenes\\fregadero.jpg", "imagenes\\horno.gif");

        pnInf.btnIzquierda.setActionCommand(IZQUIERDA_Cocina);
        pnInf.btnCentro.setActionCommand(CENTRO_Cocina);
        pnInf.btnDerecha.setActionCommand(DERECHA_Cocina);

        pnInf.btnIzquierda.addActionListener(this);
        pnInf.btnCentro.addActionListener(this);
        pnInf.btnDerecha.addActionListener(this);
    }

    public void initDormitorio() {
        pnIma.crearImagen("imagenes\\dormitorio2.jpg");

        pnInf.crearImagenes("imagenes\\calefactor.jpg",
                "imagenes\\ventilador.gif", "imagenes\\alfombra.jpg");

        pnInf.btnIzquierda.setActionCommand(IZQUIERDA_Dormitorio);
        pnInf.btnCentro.setActionCommand(CENTRO_Dormitorio);
        pnInf.btnDerecha.setActionCommand(DERECHA_Dormitorio);

        pnInf.btnIzquierda.addActionListener(this);
        pnInf.btnCentro.addActionListener(this);
        pnInf.btnDerecha.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evento) {

        String comando = evento.getActionCommand();

        switch (comando) {

            case (IZQUIERDA_Comedor):
                r.ReproducirAudio("audios/ventana.mp3");
                break;

            case (CENTRO_Comedor):
                r.ReproducirAudio("audios/mantel.mp3");
                break;

            case (DERECHA_Comedor):
                r.ReproducirAudio("audios/agua.mp3");
                break;
                
            case (IZQUIERDA_Living):
                r.ReproducirAudio("audios/chimenea.mp3");
                break;
                
            case (CENTRO_Living):
                r.ReproducirAudio("audios/florero.mp3");
                break;
                
            case (DERECHA_Living):
                r.ReproducirAudio("audios/enchufe.mp3");
                break;
                
            case (IZQUIERDA_Cocina):
                r.ReproducirAudio("audios/cuchillo.mp3");
                break;
                
            case (CENTRO_Cocina):
                r.ReproducirAudio("audios/fregadero.mp3");
                break;
                
            case (DERECHA_Cocina):
                r.ReproducirAudio("audios/horno.mp3");
                break;
                
            case (IZQUIERDA_Dormitorio):
                r.ReproducirAudio("audios/calefactor.mp3");
                break;
                
            case (CENTRO_Dormitorio):
                r.ReproducirAudio("audios/ventilador.mp3");
                break;
                
            case (DERECHA_Dormitorio):
                r.ReproducirAudio("audios/alfombra.mp3");
                break;

            case (volverVentanaIdentificar):
                VentanaIdentificar Vid = new VentanaIdentificar();
                Cerrar();
                break;
                
            case (darInstruccion):
                r.ReproducirAudio("audios/instruccion_habitacion.mp3");
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
