
package Vista;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PanelImaHabitacionTest {
    
    public PanelImaHabitacionTest() {
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
    public void testCrearImagen() {
        System.out.println("crearImagen");
        String ruta = "";
        PanelImaHabitacion imagen = new PanelImaHabitacion();
        imagen.crearImagen(ruta);
      
    }
    
}
