
package Vista;

import javax.swing.Icon;
import javax.swing.JLabel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertNull;

public class PanelImaPrincipalTest {
    
    public PanelImaPrincipalTest() {
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
        JLabel boton = null;
        PanelImaPrincipal panelImagen = new PanelImaPrincipal();
        Icon resultado = null;
        Icon imagen = panelImagen.crearImagen(boton);
        assertNull(imagen);
        
    }
    
}
