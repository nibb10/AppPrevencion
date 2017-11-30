package Vista;

import Utils.Reproductor;
import static Vista.PanelBotPrincipal.APRENDER;
import static Vista.PanelBotPrincipal.IDENTIFICAR;
import static Vista.PanelBotPrincipal.SALIR;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends JFrame implements ActionListener {

    Reproductor r = new Reproductor();

    public VentanaPrincipal() {
        this.initComponent();
    }

    public void Cerrar() {
        dispose();
    }

    public void initComponent() {
        PanelImaPrincipal pnIma = new PanelImaPrincipal();
        this.add(pnIma, BorderLayout.CENTER);

        PanelBotPrincipal pnBut = new PanelBotPrincipal();
        this.add(pnBut, BorderLayout.SOUTH);

        pnBut.btnIdentificar.setActionCommand(IDENTIFICAR);
        pnBut.btnAprender.setActionCommand(APRENDER);
        pnBut.btnSalir.setActionCommand(SALIR);

        pnBut.btnIdentificar.addActionListener(this);
        pnBut.btnAprender.addActionListener(this);
        pnBut.btnSalir.addActionListener(this);

        this.setUndecorated(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 650);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
    }

    public void actionPerformed(ActionEvent evento) {

        String comando = evento.getActionCommand();

        switch (comando){
            case (IDENTIFICAR):
                r.ReproducirAudio("audios/identificando_riesgos.mp3");
                VentanaIdentificar Vid = new VentanaIdentificar();
                Cerrar();
                break;
                
            case (APRENDER):
                r.ReproducirAudio("audios/aprendiendo_riesgos.mp3");
                VentanaAprender Vap = new VentanaAprender();
                Cerrar();
                break;
                
            case (SALIR):
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
