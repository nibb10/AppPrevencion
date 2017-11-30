
package Utils;

import javax.swing.JApplet;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import javazoom.jl.player.Player;
import javazoom.jl.decoder.JavaLayerException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Reproductor extends JApplet {

    public void ReproducirAudio(String ruta) {
        FileInputStream fis;
        Player player;
        try {
            fis = new FileInputStream(ruta);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
            player.play();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
     
    public void ReproducirVideo(String ruta) throws InterruptedException {
        try {
            //Esta ruta puede variar según el ordenador o sistema operativo que se utilize
            //Debe estar instalado el VLC Player en la ruta especificada
            ProcessBuilder p = new ProcessBuilder("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe", ruta);
            Process start = p.start();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
