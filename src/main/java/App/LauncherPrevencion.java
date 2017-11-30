
package App;

import Utils.Reproductor;
import Vista.VentanaPrincipal;

public class LauncherPrevencion {

    public static void main(String[] args) {

        VentanaPrincipal Vpr = new VentanaPrincipal();
        
        Reproductor r = new Reproductor();
        r.ReproducirAudio("audios/bienvenida.mp3");
    }

}
