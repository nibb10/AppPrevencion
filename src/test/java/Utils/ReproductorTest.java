
package Utils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReproductorTest {
    
    public ReproductorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testReproducirAudio() {
        System.out.println("ReproducirAudio");
        String ruta = "";
        Reproductor audio = new Reproductor();
        audio.ReproducirAudio(ruta);
    }

    @Test
    public void testReproducirVideo() throws Exception {
        System.out.println("ReproducirVideo");
        String ruta = "";
        Reproductor video = new Reproductor();
        video.ReproducirVideo(ruta);
    }
    
}
